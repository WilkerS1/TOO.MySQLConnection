package com.wilkers1.sqlconnection.model;

import com.wilkers1.sqlconnection.controller.Model;

public class Tarefa extends Model{
	
	private int id = -1;
	private String titulo = null;
	private String desc = null;
	private String prazo = null;
	private String prazoInicio = null;
	private String prazoTermino = null;
	private int    metodo = -1;
	
	public Tarefa(final String titulo, final String desc, final String prazo,
			final String prazoInicio, final String prazoTermino, final int metodo) {
		this.titulo = titulo;
		this.desc = desc;
		this.prazo = prazo;
		this.prazoInicio = prazoInicio;
		this.prazoTermino = prazoTermino;
		this.metodo = metodo;
	}
	
	public Tarefa(final int id, final String titulo, final String desc,
			final String prazo, final String prazoInicio,
			final String prazoTermino, final int metodo) {
		this(titulo, desc, prazo, prazoInicio, prazoTermino, metodo);
		if(id<1) { throw idNegativeExp; }
		this.id = id;
	}
	
	public int    getId()           { return this.id; }
	public String getTitulo()       { return this.titulo; }
	public String getDesc()         { return this.desc; }
	public String getPrazo()        { return this.prazo; }
	public String getPrazoInicio()  { return this.prazoInicio; }
	public String getPrazoTermino() { return this.prazoTermino; }
	public int    getMetodo()       { return this.metodo; }
	
	@Override
	public String toString() { return String.format("('%s', '%s', '%s', '%s', '%s', %d);", this.titulo, this.desc, this.prazo, this.prazoInicio, this.prazoTermino, this.metodo); }
	public String toString(boolean remove) throws IllegalAccessException {
		if(remove) {
			if(this.id==-1) {
				throw idCastExp;
			} else {
				return String.format("(idTarefa = %d) AND (tarefaTitulo = '%s') AND (tarefaDesc = '%s') AND  (tarefaPrazo = '%s') AND (tarefaPrazoInicio = '%s') AND (tarefaPrazoTermino = '%s') AND (idMetodo = %d);", this.id, this.titulo, this.desc, this.prazo, this.prazoInicio, this.prazoTermino, this.metodo);
			}
		} else {
			return this.toString();
		}
	}
}
