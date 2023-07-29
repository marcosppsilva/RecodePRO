function helloworld() {
    document.write("Hello World" + "<br>" + "<br>")
    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>')
}

function bemvindo() {
    let nome="";
    let saudacao = ", seja Bem Vindo!";
    nome = prompt("Indique seu nome")
    alert("Olá " + nome + saudacao)

    document.write("Olá " + nome + saudacao + "<br>" + "<br>")
    
    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>')
}

function salario() {
    let meses = ["Janeiro", "Fevereiro", "Março","Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"];
    let mes = new Date().getMonth();
    let salario = 0;
    let nome = "";

    nome = prompt("Indique seu nome")
    salario = Number(prompt("Indique o salário"))

    alert("Olá " + nome + "! Seu salário no mês de " + meses[mes] + " é de R$ " + salario)

    document.write("Olá " + nome + "! Seu salário no mês de " + meses[mes] + " é de R$ " + salario + "<br>" + "<br>")
    

    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>')
}

function soma2() {
    let num = 0;
    let num2 = 0;
    let soma = 0;

    num = Number(prompt("Soma 2 números \n Indique o primeiro número"));

    num2 = Number(prompt("Soma 2 números \n Indique o primeiro número"));

    soma = num + num2;

    alert("Soma 2 números \n O resultado da soma de " + num + " + " + num2 + " é igual a " + soma);

    document.write("Soma 2 números \n O resultado da soma de " + num + " + " + num2 + " é igual a " + soma + "<br>" + "<br>");
    

    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>');
}
