<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>  
<%@page import="br.com.hightechcursos.entidades.Usuario"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 List<Usuario> lista = (List<Usuario>) request.getAttribute("lista");

for(Usuario usu:lista) {
 <%
%>
</body>
</html>