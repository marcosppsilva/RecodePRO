let produtos = ["Arroz", "Feijão", "Macarrão", "Leite", "Atum"];
let precos = [6.50, 4.40, 3.20, 3.00, 2.80];
let codigoProduto;
let listaProdutos = [];
let listaPrecos = [];
let valorTotal = 0;

do {
  codigoProduto = parseInt(prompt("Digite o código do produto (0 a 4):"));

  // Verifica se o código está dentro do range do array
  if (codigoProduto >= 0 && codigoProduto <= 5) {
    listaProdutos.push(produtos[codigoProduto]);
    listaPrecos.push(precos[codigoProduto]);
    valorTotal += precos[codigoProduto];
  } else {
    alert("Código de produto inválido. Digite um código entre 0 e 4.");
    i--; // Repete a iteração para pedir outro código
  }
} while (codigoProduto !== 5)

// Exibe o cupom com os produtos e preços
let cupom = "CUPOM FISCAL\n";
for (let i = 0; i < listaProdutos.length; i++) {
  cupom += listaProdutos[i] + " - R$ " + listaPrecos[i].toFixed(2) + "\n";
}
cupom += "-------------------------\n";
cupom += "TOTAL: R$ " + valorTotal.toFixed(2);

alert(cupom);