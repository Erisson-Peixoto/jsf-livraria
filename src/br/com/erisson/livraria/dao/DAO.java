package br.com.erisson.livraria.dao;

import java.util.ArrayList;
import java.util.List;

public class DAO<T> {
	
	private final Class<T> classe;
	private List<T> lista = new ArrayList<T>();
	
	public DAO(Class<T> classe) {
		this.classe = classe;
	}
	
	public void adiciona(T t){
		lista.add(t);
	}
	
	public List<T> listar(){
		return lista;
	}
}
