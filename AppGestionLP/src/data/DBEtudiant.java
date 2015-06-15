package data;

import java.sql.*;
import java.util.ArrayList;

import business.Etudiant;



public class DBEtudiant {
	
	public static int insert(Etudiant etudiant) {
		Connection con = DBUtil.dbConnect("gestionLP", "root", "");
		PreparedStatement ps = null;
		String query = "INSERT INTO etudiant (nom,prenom,cin,mail,diplome,specialite,moyenne,tel)"
				+ "values (?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(query);
			
			ps.setString(1, etudiant.getNom());
			ps.setString(2, etudiant.getPrenom());
			ps.setString(3, etudiant.getCin());
			ps.setString(4, etudiant.getMail());
			ps.setString(5, etudiant.getDiplome());
			ps.setString(6, etudiant.getSpecialite());
			ps.setFloat(7, etudiant.getMoyenne());
			ps.setString(8, etudiant.getTel());
			
			return ps.executeUpdate();
			
		} catch(SQLException ex){
			ex.printStackTrace();
			return 0;
		} finally{
			DBUtil.closePreparedStatement(ps);
		}
	}
	
	public static int delete (Etudiant etudiant){
		Connection con = DBUtil.dbConnect("gestionLP", "root", "");
		PreparedStatement ps = null;

		String query = "delete from etudiant where cin=?";
		try{
			ps = con.prepareStatement(query);
			
			ps.setString(1, etudiant.getCin());

			return ps.executeUpdate();
			
		} catch(SQLException ex){
			ex.printStackTrace();
			return 0;
		} finally {
			DBUtil.closePreparedStatement(ps);
		}
	}
	
	public static Etudiant selectEtudiant(String cin){
		Connection con = DBUtil.dbConnect("gestionLP", "root", "");
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM ETUDIANT where cin=?";
		try{
			ps = con.prepareStatement(query);
			ps.setString(1, cin);
			rs = ps.executeQuery();
			Etudiant etudiant = null;
			if(rs.next()){
				etudiant = new Etudiant();
				etudiant.setNom(rs.getString("nom"));
				etudiant.setPrenom(rs.getString("prenom"));
				etudiant.setCin(rs.getString("cin"));
				etudiant.setMail(rs.getString("mail"));
				etudiant.setTel(rs.getString("tel"));
				etudiant.setDiplome(rs.getString("diplome"));
				etudiant.setSpecialite(rs.getString("specialite"));
				etudiant.setMoyenne(rs.getFloat("moyenne"));
				
			}
			
			return etudiant;
			
		} catch(SQLException e) {
			System.out.println(e);
			return null;
		} finally {
			DBUtil.closePreparedStatement(ps);
			DBUtil.closeResultSet(rs);
		}
		
	}
	
	public static ArrayList<Etudiant> selectToutEtudiants(){
		Connection con = DBUtil.dbConnect("gestionLP", "root", "");
		
		ArrayList<Etudiant> liste = new ArrayList<Etudiant>();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM ETUDIANT";
		try{
			ps = con.prepareStatement(query);
			
			rs = ps.executeQuery();
			
			Etudiant etudiant = null;
			
			while(rs.next()){
				
				etudiant = new Etudiant();
				etudiant.setNom(rs.getString("nom"));
				etudiant.setPrenom(rs.getString("prenom"));
				etudiant.setCin(rs.getString("cin"));
				etudiant.setMail(rs.getString("mail"));
				etudiant.setTel(rs.getString("tel"));
				etudiant.setDiplome(rs.getString("diplome"));
				etudiant.setSpecialite(rs.getString("specialite"));
				etudiant.setMoyenne(rs.getFloat("moyenne"));
				liste.add(etudiant);
			}
			
			return liste;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			DBUtil.closePreparedStatement(ps);
			DBUtil.closeResultSet(rs);
		}
		
	}
	
	public static int update(Etudiant etudiant){
		Connection con = DBUtil.dbConnect("gestionLP", "root", "");
		PreparedStatement ps = null;
		String query = "UPDATE etudiant SET NOM=?,PRENOM=?,DIPLOME=?,"
				+"SPECIALITE=?,MOYENNE=?,MAIL=?,TEL=?" 
						+"WHERE CIN=?";
		
		try {
			ps = con.prepareStatement(query);
			
			ps.setString(1, etudiant.getNom());
			ps.setString(2, etudiant.getPrenom());
			ps.setString(3, etudiant.getDiplome());
			ps.setString(4, etudiant.getSpecialite());
			ps.setFloat(5, etudiant.getMoyenne());
			ps.setString(6, etudiant.getMail());
			ps.setString(7, etudiant.getTel());
			ps.setString(8, etudiant.getCin());
			
			return ps.executeUpdate();
			
		} catch(SQLException ex){
			ex.printStackTrace();
			return 0;
		} finally{
			DBUtil.closePreparedStatement(ps);
		}
	}
	
	public static String[][] selectParDiplome(){
		Connection con = DBUtil.dbConnect("gestionLP", "root", "");
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT count(*) as nb,diplome FROM ETUDIANT group by diplome";
		
		try{
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			String table[][] = new String[4][2] ; 
			int c = 0;
			while(rs.next()){
				table[c][0]=rs.getString("nb");
				table[c][1]=rs.getString("diplome");
				c++;
			}
			
			return table;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			DBUtil.closePreparedStatement(ps);
			DBUtil.closeResultSet(rs);
		}
		
	}
	
	public static ArrayList<Etudiant> selectEtudiantsSup12(){
		Connection con = DBUtil.dbConnect("gestionLP", "root", "");
		
		ArrayList<Etudiant> liste = new ArrayList<Etudiant>();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM ETUDIANT where moyenne >= 12";
		try{
			ps = con.prepareStatement(query);
			
			rs = ps.executeQuery();
			
			Etudiant etudiant = null;
			
			while(rs.next()){
				
				etudiant = new Etudiant();
				etudiant.setNom(rs.getString("nom"));
				etudiant.setPrenom(rs.getString("prenom"));
				etudiant.setCin(rs.getString("cin"));
				etudiant.setMail(rs.getString("mail"));
				etudiant.setTel(rs.getString("tel"));
				etudiant.setDiplome(rs.getString("diplome"));
				etudiant.setSpecialite(rs.getString("specialite"));
				etudiant.setMoyenne(rs.getFloat("moyenne"));
				liste.add(etudiant);
			}
			
			return liste;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			DBUtil.closePreparedStatement(ps);
			DBUtil.closeResultSet(rs);
		}
		
	}
}
