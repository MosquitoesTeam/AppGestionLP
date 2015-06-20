package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.DBEtudiant;
import business.Etudiant;

/**
 * Servlet implementation class EtudiantsServlet
 */
@WebServlet(name="ModifEtudiantServlet", urlPatterns = { "/pages/modif" })
public class ModifEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifEtudiantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//ArrayList<Etudiant> liste=DBEtudiant.selectToutEtudiants();
		String cin=request.getParameter("cin");
		
		Etudiant e=DBEtudiant.selectEtudiant(cin);
		
		if (e!=null) {
			request.setAttribute("etudiant", e);
			getServletContext().getRequestDispatcher("/pages/modifEtudiant.jsp").forward(request, response);
		} else {
			//request.setAttribute("etudiant", "no");

		}
		
		
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//ArrayList<Etudiant> liste=DBEtudiant.selectToutEtudiants();
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
		
		System.out.println(etudiant.toString());
		
		
		
		if (DBEtudiant.update(etudiant)>0) {
			getServletContext().getRequestDispatcher(url_ok).forward(request, response);
		} else {
			request.setAttribute("action", "just test");
			getServletContext().getRequestDispatcher(url_ko).forward(request, response);
		}
		
		
		
	}

}
