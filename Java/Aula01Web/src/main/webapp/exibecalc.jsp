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
	int valor1 = Integer.parseInt(request.getParameter("valor1"));
	int valor2 = Integer.parseInt(request.getParameter("valor2"));
	String calc = request.getParameter("calculo");
	%>
 

	<h1>Calculo</h1>
	
	<h4>
	<%
	if(calc.equals("adicao")){
		
		out.print("Valor da Soma:" + "<br>");
		out.print(valor1 + valor2);
		
	} else if(calc.equals("subtracao")){
		
		out.print("Valor da Subtra��o:" + "<br>");
		out.print(valor1 - valor2);
		
	} else if(calc.equals("divisao")){
		
		out.print("Valor da Divis�o" + "<br>");
		out.print(valor1 / valor2);
		
	}else if(calc.equals("multiplicacao")){
		
		out.print("Valor da Multiplica��o" + "<br>");
		out.print(valor1 * valor2);
		
	}
	%>
	</h4>

</body>
</html>