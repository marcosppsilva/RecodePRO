const poupanca = 0.05;
const rendafixa = 0.10;
let invest = 0;
let valor = 0;
let valorfinal = 0;

tipo = prompt ("Indique o tipo de investimento (P para Poupança e R para renda fixa)");

valor = Number(prompt ("Indique o que pretende investir "));

if (tipo == "P") {
    invest = 1
}
else if (tipo == "R") {
    invest = 2
}

switch (invest) {
    case 1: 
    valorfinal = valor + (valor * poupanca);
    alert("O valor investido foi de R$ "+ valor + " e o valor final com a correção será de " + valorfinal);
    
    break;
    
    case 2: 
    valorfinal = valor + (valor * rendafixa);
    alert("O valor investido foi de R$ "+ valor + " e o valor final com a correção será de " + valorfinal);

    break;

    default:

    alert("Opção invalida")

    break;

}

/* 

switch (tipoInvestimento) {

    case 1:

        lucro = valorInvestimento * 0.05

        break;

    case 2:

        lucro = valorInvestimento * 0.05

        break;

    default:

        alert("Opção invalida")

        break;

}

*/