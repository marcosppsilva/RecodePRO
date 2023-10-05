<!DOCTYPE html>
<html>
<head>
    <title>Resultado da Conversão</title>
</head>
<body>
    <h1>Resultado da Conversão</h1>
    
    <p>Valor em Dólar: R$ <%= request.getAttribute("valorEmDolar") %></p>
    <p>Valor em Euro: R$ <%= request.getAttribute("valorEmEuro") %></p>
    <p>Valor em Libra: R$ <%= request.getAttribute("valorEmLibra") %></p>
    <p>Valor em Bitcoin: R$ <%= request.getAttribute("valorEmBitcoin") %></p>
</body>
</html>
