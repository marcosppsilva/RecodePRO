<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Resultado da Conversão</h1>

	<p>
		Valor em Dólar: R$
		<%=request.getAttribute("valorEmDolar")%></p>
	<p>
		Valor em Euro: R$
		<%=request.getAttribute("valorEmEuro")%></p>
	<p>
		Valor em Libra: R$
		<%=request.getAttribute("valorEmLibra")%></p>
	<p>
		Valor em Bitcoin: R$
		<%=request.getAttribute("valorEmBitcoin")%></p>
</body>
</html>