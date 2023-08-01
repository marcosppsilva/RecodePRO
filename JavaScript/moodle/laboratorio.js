function exercicio01(){
    document.write("Meu primeiro código usando JS! <br> Olá Mundo!")
}

function exercicio02(){
    let idade = 0;
    let confirma;

    idade = Number(prompt("Indique sua idade"))

    function verificaIdade(idade) {
        if (idade < 18){
            return true;
        } else {
            return false;
        }
    }
    confirma = verificaIdade(idade);
    
    if (confirma == true){
        alert("Você ainda é menor de idade");
        document.write("Você ainda é menor de idade");
        console.log("Você ainda é menor de idade");
    } else {
        alert("Você já é maior de idade");
        document.write("Você já é maior de idade");
        console.log("Você já é maior de idade");

    }
}

function exercicio05() {
    let numeros = [];
    let ordenado = [];
    i = 0;

    function pedeNumero() {
    for (i = 0; i <= 5 -1; i++) {
        numeros[i] = Number(prompt("Indique o " + (i+1) + " numero"))
    }
        alert(sort.numeros);
    }

    ordenado = pedeNumero();

    for (i = 0; i <= 5 -1; i++) {
        document.write(ordenado[i])    
    }

}