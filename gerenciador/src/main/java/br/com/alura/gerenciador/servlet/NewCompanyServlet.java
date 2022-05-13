package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Company;
import br.com.alura.gerenciador.model.Database;

/**
 * Servlet implementation class NewCompanyServlet
 */
@WebServlet("/newCompany")
public class NewCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NewCompanyServlet() {
        super();
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String companyName = req.getParameter("name");
		
		Company company = new Company();
		company.setName(companyName);
		
		Database database = new Database();
		database.add(company);
		
		PrintWriter out = resp.getWriter();
		
		// out.println("Cadastrando nova empresa: " + companyName + ".");
		
		// Chama o JSP
		RequestDispatcher rd= req.getRequestDispatcher("/newCompany.jsp");
		req.setAttribute("nomeEmpresa", company.getName());
		req.setAttribute("name", company.getName());
		req.setAttribute("company", company.getName());
		rd.forward(req, resp);  
	}

}
