const poupanca = 0.05;
const rendafixa = 0.10;
let tipo = "";
let valor = 0;
let valorfinal = 0;

tipo = prompt ("Indique o tipo de investimento (P para Poupança e R para renda fixa)");

valor = Number(prompt ("Indique o que pretende investir "));

if (tipo == "P") {
    valorfinal = valor + (valor * poupanca);
    alert("O valor investido foi de R$ "+ valor + " e o valor final com a correção será de " + valorfinal);
}
else if (tipo == "R") {
    valorfinal = valor + (valor * rendafixa);
    alert("O valor investido foi de R$ "+ valor + " e o valor final com a correção será de " + valorfinal);
}



else {
    alert("Tipo de investimento indicado é inválido"); 
}
/* alt + shift + a cria comentário */