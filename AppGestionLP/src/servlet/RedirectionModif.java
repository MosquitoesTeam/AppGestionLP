package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import business.Etudiant;
import data.DBEtudiant;

@WebServlet( name="RedirectionModif", urlPatterns = {"/pages/modif"} )
public class RedirectionModif extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Etudiant e = new Etudiant();
		
		e.setCin(request.getParameter("cin"));
		e.setCne(request.getParameter("cne"));
		e.setNom(request.getParameter("nom"));
		e.setPrenom(request.getParameter("prenom"));
		e.setMail(request.getParameter("mail"));
		e.setDiplome(request.getParameter("diplome"));
		e.setSpecialite(request.getParameter("specialite"));
		e.setMoyenne(new Float(request.getParameter("moyenne")));
		
		DBEtudiant.update(e);
	}
}
