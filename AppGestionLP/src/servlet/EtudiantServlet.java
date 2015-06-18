package servlet;

import java.io.IOException;





import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import data.DBEtudiant;
import business.Etudiant;

@WebServlet( name="EtudiantServlet", urlPatterns = {"/pages/ajoutEtudiant"} )
public class EtudiantServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String url = "/pages/index.jsp";
	
		System.out.println("\n\n"+request.getParameter("action"));
		
		String cin = request.getParameter("cin");
		String cne = request.getParameter("cne");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String mail = request.getParameter("mail");
		String tel = request.getParameter("tel");
		String diplome = request.getParameter("diplome");
		String specialite = request.getParameter("specialite");
		Float moyenne = new Float(request.getParameter("moyenne"));

		
		Etudiant etudiant = new Etudiant(cin, cne, nom, prenom, mail, tel, diplome, specialite, moyenne);

		
		String url_ok ="/pages/insertion_ok.jsp";
		
		String url_ko ="/pages/insertion_ko.jsp";
		
		
		
		
		
		if (DBEtudiant.insert(etudiant)>0) {
			getServletContext().getRequestDispatcher(url_ok).forward(request, response);
		} else {
			request.setAttribute("action", "just test");
			getServletContext().getRequestDispatcher(url_ko).forward(request, response);
		}
		

		
	}
}
