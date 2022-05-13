package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Company;
import br.com.alura.gerenciador.model.Database;

/**
 * Servlet implementation class listCompanyServlet
 */
@WebServlet("/listCompany")
public class ListCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListCompanyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database db = new Database();
		List<Company> companies = db.getCompanies();
		
		request.setAttribute("companies", companies);
		
		PrintWriter out = response.getWriter();
		
//		out.println("<html><body>");
//		out.println("<h1>Empresas</h1><ul>");
//		
//		for (Company company : companies) {
//			out.println("<li>" + company.getName() + "</li>");
//		}
//		out.println("</ul></body></html>");
		
		RequestDispatcher rd= request.getRequestDispatcher("/listCompany.jsp");
		rd.forward(request, response);
	}

}
