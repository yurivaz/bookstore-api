package com.yuri.bookstore.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Categoria {
	
	private Integer id;
	private String nome;
	private String descricao;
	private List<Livro> livros = new ArrayList<>();
	
	
	public Categoria(Integer id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	
	
	

}
