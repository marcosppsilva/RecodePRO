let produtos = [];
produtos[0] = "Óleo";
produtos[1] = "Arroz";
produtos[2] = "Feijão";
produtos[3] = "Atum";
produtos[4] = "Açucar";
let valores = [];
valores[0] = 3.50;
valores[1] = 7.80;
valores[2] = 4.80;
valores[3] = 2.75;
valores[4] = 5.20;
let comprados = [];
let precos = [];
let pago =0;
let troco = 0;
let cupom ="CUPOM FISCAL";
let continuar = 1;
let total = 0;
let pagamento = 0;
let num = 0;

do {
num = Number(prompt("***MERCADO 23***\nIndique o Valor do produto"))

comprados.push(produtos[num]);
precos.push(valores[num]);

total += valores[num];
} while (num !== 5)

pago = Number(prompt("O valor total da compra foi de R$" +total+ "Indique valor pago: "))

troco = pago - total;

alert("O valor da compra R$" + pagamento + "\n Valor pago R$" + pagamento + "\n Troco R$" + troco )


/*
codigo professor

let total = 0

let produto = 0

let resposta = ""

let valorPagamento = 0; let troco = 0

 

 

do{

    produto = Number(prompt(" == MERCADINHO RECODE == \nDigite o valor do produto: "))

    total = total + produto

    resposta = prompt("Lançar outro produto: s / n")

 

}while (resposta == "s")

 

valorPagamento = Number(prompt("Total da compra R$ " + total + " - Digite o valor do pagamento: "))

troco = valorPagamento - total

 

alert(" -- CUPOM DO CLIENTE - \n" + "Total da compra: R$" + total + "\n" +

        "Total pago:          R$" + valorPagamento + "\n" +

        "Troco do cliente: R$"+ troco)*/
