<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="br.com.alura.gerenciador.model.Company, java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Lista de empresas cadastradas</title>
</head>
<body>
	<h1>Empresas</h1>
	
	<!-- Utilizando apenas JSP -->
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
	
	<!-- Utilizando JSTL -->
	<ul>
		<c:forEach items="${companies}" var="company">
			<!-- <li>${company.getName()}</li> -->
			
			<!-- implicitamente, chama os métodos getName() e get Date() -->
			<li><fmt:formatDate value="${company.date}" pattern="dd/MM/yyyy"/> - ${company.name}</li> 
		</c:forEach>
	</ul>
</body>
</html>