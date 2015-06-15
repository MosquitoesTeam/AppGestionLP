package data;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBUtil {
	public static Connection dbConnect(String dbName, String dbUser, String dbPassword) {
		Connection con = null;
		try{
			StringBuilder dbURL1 = new StringBuilder("jdbc:mysql://localhost:3306/");
			dbURL1.append(dbName);
			String dbURL = dbURL1.toString();
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
			System.out.println("Conc ok");
		} catch(ClassNotFoundException ex) {
			
		} catch(Exception ex){
			System.out.println("Connection a la base impossible : " + ex.getMessage());
		}
		return con;
	}
	
	public static void closeStatement(Statement s) {
		try{
			if(s != null)
				s.close();
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void closePreparedStatement(PreparedStatement ps){
		try{
			if(ps != null)
				ps.close();
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void closeResultSet(ResultSet rs){
		try{
			if(rs != null)
				rs.close();
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
}
