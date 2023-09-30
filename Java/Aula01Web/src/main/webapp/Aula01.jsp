<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Olá Mundo JSP</p>
		
		<%		
			int a = 20;
			int b = 10;
			int soma = a + b;
			
			for (int i = 0; i<= 10; i++){
				out.print(i + "º num" + "<br>");
			}
		%>
		
		<h2>A soma dos valores é igual <%= soma  %></h2>
		
		<h3>Vindo de Outra página:</h3>
		
		<h4>	
			<a href="Soma.jsp?n1=75&n2=80" style="text-decoration: none; font-weight: bold; color: white; background-color: grey; padding: 5px; border-radius: 10px; transition: background-color 0.3s" onmouseover="this.style.backgroundColor='rgba(128, 128, 128, 0.5)';" 
   onmouseout="this.style.backgroundColor='grey';">Clique aqui para calcular os Parâmetros n1 = 20 e n2 = 40</a>
		</h4>
		
	
</body>
</html>