package pack;

import java.sql.Connection;
import java.util.ArrayList;

import business.Etudiant;
import data.DBEtudiant;
import data.DBUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Etudiant e=new Etudiant("amine", "amin", "BKNP160", "rida@gmail.com", "BTS", "info", new Float(11.0), "063232532");
//		System.out.println(DBEtudiant.insert(e));
//		
		//System.out.println(DBEtudiant.selectEtudiant("BK201650").toString());
		
		//DBEtudiant.delete(DBEtudiant.selectEtudiant("BK201650"));
		
//		Etudiant e = DBEtudiant.selectEtudiant("BHDDFE");
//		e.setDiplome("DUT");
		
		//DBEtudiant.update(e);
		
//		ArrayList<Etudiant> liste = DBEtudiant.selectToutEtudiants();
//		
//		for (int i = 0; i < liste.size(); i++) {
//			System.out.println(liste.get(i).toString());
//			
//		}
		
//		String[][] liste = DBEtudiant.selectParDiplome();
//		
//		for (int i = 0; i < liste.length; i++) {
//			System.out.println(liste[i][1]+ " = "+liste[i][0] +" etudiants");
//			
//		}
		
		ArrayList<Etudiant> liste = DBEtudiant.selectEtudiantsSup12();
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i).toString());
		}
		
	}

}
