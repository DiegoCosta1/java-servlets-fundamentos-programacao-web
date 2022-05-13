<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/newCompany" var="newCompanyUrl" />

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Formulário de empresas</title>
</head>
<body>
<style>
	input { margin-bottom: 10px; }
</style>
	<form action="${newCompanyUrl}" method="POST">
		Nome: <input type="text" name="name"/><br/>
		Data: <input type="text" name="data"/><br/>
		<input type="submit"/>
	</form>
	<small style="color:blue"><c:url value="/newCompany"/></small><br/>
	<small style="color:blue">${newCompanyUrl}</small>
</body>
</html>