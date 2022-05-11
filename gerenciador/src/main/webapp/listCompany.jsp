<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="br.com.alura.gerenciador.model.Company, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Lista de empresas cadastradas</title>
</head>
<body>
	<h1>Empresas</h1>
	
	<ul>
		<%
			List<Company> companies = (List<Company>) request.getAttribute("companies"); 
			for (Company company : companies) {
		%>
			<li> <%= company.getName() %> </li>
		<%
			}
		%>
	</ul>
</body>
</html>