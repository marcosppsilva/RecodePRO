<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recebe e Processa Relat�rio</title>
</head>
<body>

	<%
	String descricao = request.getParameter("descricao");
	float valor = Float.parseFloat(request.getParameter("valor"));
	int estoque = Integer.parseInt(request.getParameter("estoque"));
	String tipo = request.getParameter("tipo");
	%>
	
	<p>
		Descri��o:<%=descricao%><br> Valor:
		<%=valor%><br> Estoque:
		<%=estoque%><br> Tipo:<%=tipo%>
	</p>

</body>
</html>