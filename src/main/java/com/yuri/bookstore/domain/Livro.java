package com.yuri.bookstore.domain;

import lombok.Data;

@Data
public class Livro {
	
	private Integer id;
	private String titulo;
	private String nome_autor;
	private String texto;
	private Categoria categoria;
	
	public Livro(Integer id, String titulo, String nome_autor, String texto, Categoria categoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nome_autor = nome_autor;
		this.texto = texto;
		this.categoria = categoria;
	}
	
	
	
	


}
