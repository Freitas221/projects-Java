package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	//DEMO: ATUALIZAR DADOS
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)");
			
			st.setDouble(1, 300);
			st.setInt(2, 1);
			
			int rowsAffecteds = st.executeUpdate();
			
			System.out.println("Feito! Linhas afetadas: "+ rowsAffecteds);
			
		}catch(SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transação não concluída! Causa do erro: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Erro ao voltar a transação! Causa do erro: "+ e1.getMessage());
			}
		}finally {
			DB.closeConnection();
			DB.closeStatement(st);
		}
	}

}
