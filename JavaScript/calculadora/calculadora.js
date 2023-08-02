document.getElementById("limpar").addEventListener("click", limpar)

function limpar(){
    let limpa = document.getElementById('numtela');
    limpa.innerHTML = "0";
}


document.getElementById('num1').addEventListener("click",addnum);

function addnum(){
let recebe = document.getElementsByTagName('li')[4];
let paratela = document.getElementById('numtela');
let numero = recebe.textContent;
let numeros
numero.replace(numero, numero + numero);
paratela.innerHTML = Number(numero);
/*paratela.innerHTML = "1";
alert(paratela);*/
}