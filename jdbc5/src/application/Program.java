package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;

import db.DB;
import db.DbIntegrityException;

public class Program {

	//DEMO: DELETAR DADOS
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement("Delete From department where Id = ?");
			
			st.setInt(1, 5);
			
			int rownsAffected = st.executeUpdate();
			
			System.out.println("Feito! Linhas afetadas: "+ rownsAffected);
			
		}catch(SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}
		
		DB.closeConnection();
		DB.closeStatement(st);
	}

}
