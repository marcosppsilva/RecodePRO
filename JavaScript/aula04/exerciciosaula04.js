function exercicio01() {
    let nome = "";
    let sobrenome = "";
    let idade=0;
    let completo = "";

    nome = prompt("Indique seu nome");

    sobrenome = prompt("Indique seu sobrenome");

    idade = Number(prompt("Indique a idade"));

    completo = completo.replace("", nome + " "+ sobrenome + " - Idade: " + idade);

    completo = completo.toUpperCase();

    alert(completo)
}

function exercicio02() {

    let nome = "";
    let nomecompleto;
    let duplo = "";

    nome = prompt("Indique seu nome completo");

    nomecompleto = nome.split(" ")

    duplo = prompt("É um nome duplo? (s/n)");
        if (duplo == 's') {
            nomecompleto[0] = nomecompleto[0] + " " + nomecompleto[1]
            nomecompleto.splice(1,1)
        }

    console.log(nomecompleto);

}

function exercicio03(){
    /*Funcões Math*/

    let num = Number(prompt("Informe Um numero"))
    /*Raiz Quadrada*/
    alert(Math.sqrt(num))
    /*Exponenciação base 2*/
    alert(Math.pow(2,num))

}

function exercicio04(){
    /*Funcões Math*/

    let num1 = Number(prompt("Informe Um numero"))
    let num2 = Number(prompt("Informe Outro numero"))
    
    alert(Math.pow(num2,num1))

}

function exercicio05(){
    /*Funcões Math*/

    let num1 = Number(prompt("Informe Um numero"))    
    alert("Arredondado pra cima " + Math.ceil(num1) + "\n Arredondado pra baixo " + Math.floor(num1) + "\n Arredondado mais próximo " + Math.round(num1))
}
/*Eventos estão no HTML*/ 
function exemplo(){
    let x = document.getElementById("demoh1");
    x.style.color = "red";
    x.style.padding = "10px";
    x.style.backgroundColor = "yellow";
    x.style.border = "2px solid blue";
    x.innerHTML = "Fui Clicado";
}

function somar(){
    let valor1 = Number(document.getElementById("valor1").value);

    let valor2 = Number(document.getElementById("valor2").value);

    let soma = valor1 + valor2

    document.getElementById("resultado").value = soma;
}
/*Não chama evento no HTML e sim no próprio JS*/
document.getElementById("multi").addEventListener("click",multiplicar)

function multiplicar(){
    let valormulti = Number(document.getElementById("valormulti").value);

    let valor2multi = Number(document.getElementById("valor2multi").value);

    let multip = valormulti * valor2multi

    document.getElementById("resultadomulti").value = multip;
}
/*Exercício da caixa que muda de cor*/
document.getElementById("mudacor1").addEventListener("click",mudaazul)

document.getElementsByClassName('mudacor')[0].addEventListener("click",mudaRosa)

document.getElementsByClassName('mudacor')[1].addEventListener("click", mudaMarelo)

function mudaazul(){
    let x = document.getElementById("caixateste");
    x.style.backgroundColor = "blue";
}

function mudaRosa(){
    let x = document.getElementById("caixateste");
    x.style.backgroundColor = "purple";
}

function mudaMarelo(){
    let x = document.getElementById("caixateste");
    x.style.backgroundColor = "yellow";
}