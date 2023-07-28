
let alunos = [];
let notas = [];
total = 0;
media =0;
mensagem = "";

for (let i = 0; i < 5; i++) {
    alunos[i] = prompt("Informe o nome do Aluno")
    
    notas[i] = Number(prompt("Informe a nota do aluno " + alunos[i]))
    total = notas[i] + total;
}

for (let i = 0; i < 5; i++) {
    document.write("Aluno : " + alunos[i] + "    "+ notas[i] + "<br>")
    mensagem += alunos[i] + ": " + notas[i] + "\n";
}
media = total / notas.length

alert(mensagem)

document.write("A média total dos alunos foi de "+ media)



/*
Array do Professor
let nome = []

 

for (let i = 0; i < 5; i++) {

    nome[i] = Number(prompt("Digite um nome"))

}

 

nome.sort()

 

for (let index = 0; index < nome.length; index++) {  

    alert(nome[index])    

}*/