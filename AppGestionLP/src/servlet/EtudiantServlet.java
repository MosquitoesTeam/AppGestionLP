package servlet;

import java.io.IOException;




import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import data.DBEtudiant;
import business.Etudiant;

@WebServlet( name="EtudiantServlet", urlPatterns = {"/inscription_etudiant"} )
public class EtudiantServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String url = "/index.jsp";
		String action = request.getParameter("action");
		if(action.equals("inscription_etudiant")){
			
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String cin = request.getParameter("cin");
			String mail = request.getParameter("mail");
			String diplome = request.getParameter("diplome");
			String specialite = request.getParameter("specialite");
			Float moyenne = new Float(request.getParameter("moyenne"));
			String tel = request.getParameter("tel");
			
			Etudiant etudiant = new Etudiant( nom, prenom, cin, mail, diplome, specialite, moyenne, tel);
			
			url ="/insertion_ok.jsp";
			DBEtudiant.insert(etudiant);
			
			request.setAttribute("etudiant", etudiant);
			getServletContext().getRequestDispatcher(url).forward(request, response);

		}
	}
}
