<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>

<% 
	String nomeEmpresa = "Alura";
	System.out.println(nomeEmpresa);
%>
<html>
<head>
<meta charset="utf-8">
<title>Empresa criada com sucesso</title>
</head>
<body>
<!--A empresa <--% out.println(nomeEmpresa); %> foi cadastrada com sucesso.</p-->
<p>A empresa <%= nomeEmpresa %> foi cadastrada com sucesso.</p>
</body>
</html>