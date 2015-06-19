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
		String cin = request.getParameter("cin");
		Etudiant e = new Etudiant();
		
	}
}
