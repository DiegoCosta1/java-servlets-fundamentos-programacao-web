package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String nomeEmpresa = req.getParameter("nome");
		
		PrintWriter out = resp.getWriter();
		
		out.println("Cadastrando nova empresa: " + nomeEmpresa + ".");
		
	}

}
