package model;

import java.lang.IllegalArgumentException;

public class Alunos {
	private int    id = -1;
	private String nome = null;
	private String endereco = null;
	private String bairro = null;
	
	public Alunos(final String nome, final String endereco, final String bairro) {
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
	}
	
	public Alunos(final int id, final String nome, final String endereco, final String bairro) {
		this(nome, endereco, bairro);
		if(id<1) { throw new IllegalArgumentException("id cannot be lower then 1."); }
		this.id = id;
	}
	
	public int    getId()       { return this.id; }
	public void   setId(int id) { this.id = id; }
	public String getNome()     { return this.nome; }
	public String getEndereco() { return this.endereco; }
	public String getBairro()   { return this.bairro; }
}
