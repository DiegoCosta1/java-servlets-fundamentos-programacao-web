<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<!-- Utilizando apenas JSP -->
<% 
	String nomeEmpresa = "Alura";
	System.out.println(nomeEmpresa);
	
	String name = (String) request.getAttribute("name");
	System.out.println(name);
%>
<html>
<head>
<meta charset="utf-8">
<title>Empresa criada com sucesso</title>
</head>
<body>

<!-- Utilizando apenas JSP -->
<p>A empresa <% out.println(nomeEmpresa); %> já é cadastrada.</p>
<p>A empresa <%= name %> foi cadastrada com sucesso.</p>

<!-- Utilizando EL -->
<c:if test="${not empty company}">
	<p>A empresa ${company} foi cadastrada com sucesso.</p>
</c:if>

<c:if test="${empty company}">
	<p>Nenhuma empresa foi cadastrada.</p>
</c:if>
</body>
</html>