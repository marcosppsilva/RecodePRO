/*Exercicio 01*/
function helloworld() {
    document.write("Hello World" + "<br>" + "<br>")
    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>')
}
/*Exercicio 02*/
function bemvindo() {
    let nome="";
    let saudacao = ", seja Bem Vindo!";
    nome = prompt("Indique seu nome")
    alert("Olá " + nome + saudacao)

    document.write("Olá " + nome + saudacao + "<br>" + "<br>")
    
    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>')
}
/*Exercicio 03*/
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
/*Exercicio 04*/
function soma2() {
    let num = 0;
    let num2 = 0;
    let soma = 0;

    num = Number(prompt("Soma 2 números \n Indique o primeiro número"));

    num2 = Number(prompt("Soma 2 números \n Indique o primeiro número"));

    soma = num + num2;

    alert("Soma 2 números \n O resultado da soma de " + num + " + " + num2 + " é igual a " + soma);

    document.write("Soma 2 números <br> O resultado da soma de " + num + " + " + num2 + " é igual a " + soma + "<br>" + "<br>");
    

    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>');
}

/*Exercicio 05*/
function medianota() {
    let nome="";
    let nota01 = 0;
    let nota02 = 0;
    let media = 0;

    nome = prompt("Indique o nome do aluno")
    nota01 = Number(prompt("Indique a primeira nota do aluno "+ nome))
    nota02 = Number(prompt("Indique a segunda nota do aluno "+ nome))

    media = (nota01 + nota02) / 2

    alert("ALUNO: " + nome + " \n NOTA 1: " + nota01 + " \n NOTA 2: " + nota02 + " \n MÉDIA: " + media)

    document.write("ALUNO: " + nome + " <br> NOTA 1: " + nota01 + " <br> NOTA 2: " + nota02 + " <br> MÉDIA: " + "<br>" + "<br>")
    
    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>')
}

/*EXERCÍCIO 06*/

function antSuc() {
    let num = 0;
    let ant = 0;
    let suc = 0;

    num = Number(prompt("ANTECESSOR E SUCESSOR \n Indique um número"));

    ant = num - 1;
    suc = num +1;

    alert("ANTECESSOR E SUCESSOR \n O número digitado foi " + num + "\n O seu antecessor é " + ant + "\n O seu sucessor é " + suc)

    document.write("ANTECESSOR E SUCESSOR <br> O número digitado foi " + num + "<br> O seu antecessor é " + ant + "<br> O seu sucessor é " + suc + "<br>" + "<br>")
    
    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>')
}

/*EXERCÍCIO 07*/
function dobroTerca() {
    let num = 0;
    let dobro = 0;
    let terca = 0;
    

    num = Number(prompt("Dobro e Terça Parte \n Indique um número"));

    if (Number.isInteger(num)) {
        alert("Dobro e Terça Parte \n O número digitado não é um número real");

        document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>');
    } else {
        dobro = num * 2;
        terca = num / 3;

        alert("Dobro e Terça Parte \n O número digitado "+ num +" é um número real" + "\n O seu dobro é " + dobro + "\n A sua terça parte é " + terca);

        document.write("Dobro e Terça Parte <br> O número digitado "+ num +" é um número real" + "<br> O seu dobro é " + dobro + "<br> A sua terça parte é " + terca + "<br>" + "<br>")

        document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>');
    }
}
    /*EXERCÍCIO 08*/
function conversorMedidas() {
    let metros = 0;
    let km = 0;
    let hm = 0;
    let dam = 0;
    let dm = 0;
    let cm = 0;
    let mm = 0;
    

    metros = Number(prompt("CONVERSOR METRO PARA OUTRAS MEDIDAS \n Indique uma distância em metros"));

    
       km = metros / 1000;
       hm = metros / 100;
       dam = metros / 10;
       dm = metros * 10;
       cm = metros * 100;
       mm = metros * 1000;
       

        alert("CONVERSOR METRO PARA OUTRAS MEDIDAS \n A distância informada em metros foi " + metros + "\n Essa distância é equivalente a " + km + "km" + "\n Essa distância é equivalente a " + hm + "hm" + "\n Essa distância é equivalente a " + dam + "dam" + "\n Essa distância é equivalente a " + dm + "dm" + "\n Essa distância é equivalente a " + cm + "cm" + "\n Essa distância é equivalente a " + mm + "mm");

        document.write("CONVERSOR METRO PARA OUTRAS MEDIDAS <br> A distância informada em metros foi " + metros + "<br> Essa distância é equivalente a " + km + "km" + "<br> Essa distância é equivalente a " + hm + "hm" + "<br> Essa distância é equivalente a " + dam + "dam" + "<br> Essa distância é equivalente a " + dm + "dm" + "<br>Essa distância é equivalente a " + cm + "cm" + "<br> Essa distância é equivalente a " + mm + "mm"+ "<br>" + "<br>")

        document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>');
    

}

/*EXERCÍCIO 09*/
function conversorDolar() {
    let valor = 0;
    const dolar = 3.45;
    let convertido = 0;
    
    

    valor = Number(prompt("CONVERSOR DÓLAR \n Indique quantos reais possui"));
    
        convertido = valor / dolar ;

        alert("CONVERSOR DÓLAR \n Você possui R$" + valor + " e com este valor consegue comprar U$" + convertido.toFixed(2));

        document.write("CONVERSOR DÓLAR <br> Você possui R$" + valor + " e com este valor consegue comprar U$" + convertido.toFixed(2) + "<br>" + "<br>")

        document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>');
    

}

/*EXERCÍCIO 10*/
function calculaTinta() {
    let larg = 0;
    let alt = 0;
    let area = 0;
    let necessario = 0;
    
    

    alt = Number(prompt("CALCULA TINTA \n Indique o tamanho da parede em altura"));

    larg = Number(prompt("CALCULA TINTA \n Indique o tamanho da parede em largura"));
    
    area = larg * alt;
    necessario = area / 2;

        alert("CALCULA TINTA \n O tamanho da área a ser pintada é " + area + "m2 \n Para pintar esta área será necessário " + necessario + " litros de tinta");

        document.write("CALCULA TINTA <br> O tamanho da área a ser pintada é " + area + "m2 <br> Para pintar esta área será necessário " + necessario + " litros de tinta" + "<br>" + "<br>")

        document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>');
    

}

/*EXERCÍCIO 11*/
function calculaDelta() {
    let a = 0;
    let b = 0;
    let c = 0;
    let delta = 0;
    
    

    a = Number(prompt("CALCULA DELTA \n Informe o valor de a"));
    b = Number(prompt("CALCULA DELTA \n Informe o valor de b"));
    c = Number(prompt("CALCULA DELTA \n Informe o valor de c"));

    delta = (b**2) - 4 * (a * c)

        alert("CALCULA DELTA \n Para a = " + a + " b = " + b + " e c = " + c + "\n O valor de delta é " + delta);

        document.write("CALCULA DELTA <br> Para a = " + a + " b = " + b + " e c = " + c + " <br> O valor de delta é " + delta + "<br> <br>")

        document.write('<button><a style="text-decoration: none; font-weight: bold;" href="index.html">Voltar para Página Inicial</a></button>');
    

}

function teste(){
    document.write(document.getElementsByTagName('img')[3]);
}