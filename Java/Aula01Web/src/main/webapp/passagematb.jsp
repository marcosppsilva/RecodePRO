<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- Na URL da página tem que ser colocado o link da seguinte forma:
	
	http://localhost:10000/Aula01Web/passagematb.jsp/?parametro1=valor&parametro2=valor
	
	ex: http://localhost:10000/Aula01Web/passagematb.jsp?nome=Marcos_Paulo&idade=20

  --%>

	<% 
	
	String nome = request.getParameter("nome");
	int idade = Integer.parseInt(request.getParameter("idade"));
	boolean apto = false;
	
	if(idade >= 18){
		apto = true;
	}
	
	out.print("Idade Enviada via url = " + idade + "<br>");
	out.print("Nome Enviado via url = " + nome + "<br>");
	out.print("Apto a votar? " + apto + "<br>");
	
	%>	

</body>
</html>