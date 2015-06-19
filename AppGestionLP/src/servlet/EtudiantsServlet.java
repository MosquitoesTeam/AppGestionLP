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
@WebServlet(name="EtudiantsServlet", urlPatterns = { "/pages/listeEtudiant" })
public class EtudiantsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EtudiantsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Etudiant> liste=DBEtudiant.selectToutEtudiants();
		
		request.setAttribute("liste", liste);
		
		getServletContext().getRequestDispatcher("/pages/listeEtudiant.jsp").forward(request, response);
		
	}

}
