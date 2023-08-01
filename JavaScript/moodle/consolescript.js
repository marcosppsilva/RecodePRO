console.log("Olá Mundo");
console.log(10);
let valor = "Joao";

console.log(valor);
console.warn("Error 4")
console.error(999)
console.info("Cuidado")
console.debug("Erro ao depurar")
console.time(60)

function pedeNome(){
    let nome = prompt("Qual o seu nome?");
    document.write(nome + ", seja bem vindo ao site!");

    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="console.html">Voltar para Página Inicial</a></button>')
}

function simEnao(){
    let opcao = confirm("Deseja encerrar?");
    document.write("Sua escolha foi: " + opcao);

    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="console.html">Voltar para Página Inicial</a></button>')
}

function confirma(){
    let opcao = confirm("Deseja encerrar?");
    document.write("Sua escolha foi: " + opcao);

    if (opcao = true) {

        document.write("Foi escolhido a opção ok gerando um true")

        document.write('<button><a style="text-decoration: none; font-weight: bold;" href="console.html">Voltar para Página Inicial</a></button>')
        } else {

        document.write("Foi escolhido a opção Cancelar gerando um false")

        document.write('<button><a style="text-decoration: none; font-weight: bold;" href="console.html">Voltar para Página Inicial</a></button>')
        }
}

function incremento(){
    let incremento = 10;
    document.write(incremento++);
    document.write("<br>");
    document.write(++incremento);
    document.write("<br>");

    document.write('<button><a style="text-decoration: none; font-weight: bold;" href="console.html">Voltar para Página Inicial</a></button>');
}

function logicos(){
    
    let a = 10;
    let b = 10;
    let c = 20;
    let d = 30;

    if (a = b && a > c) {
        document.write("Resultado Verdadeiro")

        document.write('<button><a style="text-decoration: none; font-weight: bold;" href="console.html">Voltar para Página Inicial</a></button>');

    } else {
        document.write("Resultado Falso")

        document.write('<button><a style="text-decoration: none; font-weight: bold;" href="console.html">Voltar para Página Inicial</a></button>');
    }

}

function dataHora(){
    
    let data = new Date();
    completa = "";

    let mes = data.getMonth();
    let dia = data.getDay();
    let hora = data.getHours();
    let minutos = data.getMinutes();

    alert("Mês: " + mes + "\n Dia: " + dia + "\n Hora: " + hora + "\n Minutos: " + minutos)

}

function trabaString(){
    let nome = "Marcos Paulo pinto da Silva";
    document.write(nome.substring(0, 15));
    document.write("<br>")
    document.write(nome.split(" "));
    let partes = document.write(nome.split(" "));
    document.write("<br>")
    partes.map(function(p){
        document.write(p.toUpperCase());   
    })
}

function FuncMatematica(){
    let pi = 3.14131916;

    document.write(Math.round(pi))
    document.write("<br>")
    document.write(Math.pow(2,8))
}

function jason(){
    let nomes = {
        nome: "Marcos",
        idade: 33,
        altura: 1.77,
        peso: 77
    };
    document.write(nomes.nome);
    console.log(nomes);
}