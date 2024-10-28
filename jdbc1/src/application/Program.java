package application;

import java.sql.Connection;

import db.DB;

public class Program {

	//CÓDIGO PARA CONEXÃO COM O BANCO
	
	public static void main(String[] args) {

		Connection conn = DB.getConnection();
		DB.closeConnection();
	}

}
