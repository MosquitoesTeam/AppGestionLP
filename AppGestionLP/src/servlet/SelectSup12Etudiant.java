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
@WebServlet(name="SelectSup12Etudiant", urlPatterns = { "/pages/selectSup12Etudiant" })
public class SelectSup12Etudiant extends HttpServlet {


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Etudiant> selectliste = DBEtudiant.selectEtudiantsSup12();
		
		request.setAttribute("selectliste", selectliste);
		
		getServletContext().getRequestDispatcher("/pages/selectSup12Etudiant.jsp").forward(request, response);
		
	}

}
