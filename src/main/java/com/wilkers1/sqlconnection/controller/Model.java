package com.wilkers1.sqlconnection.controller;

import java.sql.SQLException;

import com.wilkers1.sqlconnection.model.Pessoa;
import com.wilkers1.sqlconnection.model.RefParticipante;
import com.wilkers1.sqlconnection.model.Tarefa;

public class Model {
	protected static IllegalArgumentException idNegativeExp = new IllegalArgumentException("id cannot be lower than 1.");
	protected static IllegalAccessException idCastExp = new IllegalAccessException("Cannot use this instance.");
	
	public static void insert(Model mdl) throws SQLException {
		if(mdl instanceof Pessoa) {
			new DAOPessoa().insert(mdl);
		} else if(mdl instanceof Tarefa) {
			new DAOTarefa().insert(mdl);
		} else if(mdl instanceof RefParticipante) {
			new DAORefPar().insert(mdl);
		}
	}
	public static void delete(Model mdl) {
		//TODO Complete
	}
}
