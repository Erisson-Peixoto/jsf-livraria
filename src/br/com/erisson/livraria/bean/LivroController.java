package br.com.erisson.livraria.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.erisson.livraria.dao.DAO;

@ManagedBean
@SessionScoped
public class LivroController {

	private Livro livro = new Livro();
	private DAO<Livro> daoLivro = new DAO<Livro>(Livro.class); 
	
	public Livro getLivro(){
		return livro;
	}
	
	public String salvar(){
		if(livro.getIsbn().isEmpty()){
			FacesContext.getCurrentInstance().addMessage("isbn", new FacesMessage("O ISBN é obrigatório!"));
			return null;
		}
		daoLivro.adiciona(livro);
		System.out.println("Livro " + livro.getTitulo() + " salvo com sucesso!!!"); 
		this.livro = new Livro(); // já que nesse caso uso SessionScope, preciso criar um objeto novo para salvar com os atributos novos
		return "livro?faces-redirect=true";
	}
	
	public List<Livro> getListarLivros(){
		return daoLivro.listar();
	}
}
