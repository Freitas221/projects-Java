package application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import db.DB;

public class Program {

	//DEMO: INSERIR DADOS
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement("INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+"VALUES"
					+"(?, ?, ?, ?, ?)");
			
			st.setString(1, "Marcos Freitas");
			st.setString(2, "marcosfreitas@gmail.com");
			st.setDate(3, new Date(sdf.parse("19/04/2003").getTime()));
			st.setDouble(4, 3500.0);
			st.setInt(5, 2);
			
			int rownsAffected = st.executeUpdate();
			
			System.out.println("Linhas afetadas: " + rownsAffected);
		}
		catch(SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transação não concluída! Causa do erro: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Erro ao voltar a transação! Causa do erro: "+ e1.getMessage());
			}
		}
		catch(ParseException e2) {
			e2.getStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
