package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	//DEMO: INSERIR DADOS
	
	public static void main(String[] args) {

		Connection conn = null;
		
		Statement st = null;
		
		ResultSet rs = null;
		
		try {
			
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from seller");
			
			while(rs.next()) {
				System.out.println(rs.getString("Email")+ ", " + rs.getString("Email")+ "," + rs.getDate("BirthDate") + ", "+ rs.getDouble("BaseSalary")+ ", " + rs.getInt("DepartmentId"));
			}
			
		}catch(SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transação não concluída! Causa do erro: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Erro ao voltar a transação! Causa do erro: "+ e1.getMessage());
			}
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}
	}

}
