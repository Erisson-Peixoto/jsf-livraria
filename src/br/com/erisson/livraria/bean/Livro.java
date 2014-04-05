package br.com.erisson.livraria.bean;

import java.util.Calendar;

public class Livro {
	
	private String titulo;
	private String isbn;
	private double preco;
	private Calendar dataLancamento = Calendar.getInstance();
	
	public Livro(){
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Calendar getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento ;
	}
	
	

}
