function codigoProfessor() {
let agenda = []
let pessoa = {

    nome: "Flavio",

    profissao: "Professor",

    salario: 1200
}

let pessoa1 = {

    nome: "Rochele",

    profissao: "Contadora",

    salario: 5000
}

agenda.push(pessoa)

agenda.push(pessoa1)

for (let index = 0; index < agenda.length; index++) {

    alert("Nome: " + agenda[index].nome)

    alert("Profissão: " + agenda[index].profissao)

    alert("Salário: " + agenda[index].salario)

}

}

function comparauser() {
    let user = {
        email: "",
        senha: 0
    }

    let bd = {
        email: "marcos@gmail.com",
        senha: "19902023"
    }

    user.email = prompt("Indique o email")
    user.senha = prompt("Indique a senha")

    if((user.email == bd.email) && (user.senha == bd.senha)){
        alert("Senha e email corretos: Entrada Permitida")
    } else{
        alert("Senha ou email incorretos: Acesso Negado")
    }
}

function cadastroAluno(){
    let aluno = {
        nome: "",
        rg: 0,
        nota1: 0,
        nota2: 0,
        nota3: 0,
        media:0,
        situacao: ""
    }

    aluno.nome = prompt("Indique o nome do Aluno");
    aluno.rg = Number(prompt("Indique o RG do aluno"));
    aluno.nota1 = Number(prompt("Indique a primeira nota do aluno"));
    aluno.nota2 = Number(prompt("Indique a segunda nota do aluno"));
    aluno.nota3 = Number(prompt("Indique a terceira nota do aluno"));

    aluno.media = (aluno.nota1 + aluno.nota2 + aluno.nota3) / 3;

    if (aluno.media > 7) {
        aluno.situacao = "Aprovado";
    } else if ((aluno.media <= 7) && (aluno.media > 5))  {
        aluno.situacao = "Recuperação";
    } else if (aluno.media = 5)  {
        aluno.situacao = "Reprovado";
    }

    alert("SITUAÇÃO DO ALUNO \n Nome: " + aluno.nome + "\n RG: " + aluno.rg + "\n Nota 1: " + aluno.nota1 + "\n Nota 2: " + aluno.nota2 + "\n Nota 3: " + aluno.nota3 + "\n Média: " + aluno.media + "\n Situação: " + aluno.situacao)

    document.write("SITUAÇÃO DO ALUNO <br> Nome: " + aluno.nome + "<br> RG: " + aluno.rg + "<br> Nota 1: " + aluno.nota1 + "<br> Nota 2: " + aluno.nota2 + "<br> Nota 3: " + aluno.nota3 + "<br> Média: " + aluno.media + "<br> Situação: " + aluno.situacao)

}

function NomeIdade() {
    let nome = "";
    let idade = 0;
    let msg = 0;

    function mostraIdade(nm, idd){
        return ("Bem vindo " + nm + "!! Você tem " + idd + " anos")
    }

    nome = prompt("Informe o seu nome")
    idade = Number(prompt("Informe sua idade"))

    msg = mostraIdade(nome, idade)

    alert(msg)

}

function vouCinema() {
    let valor = 0;
    let msg = "";

    function vouNaoVou(money){
        
        if (money >= 50) {
        return ("Uhuull!! Vamos ao cinema")
        } else {
            return (":-( Não vamos ao cinema #Chateado")
        }
    }

    valor = Number(prompt("Informe o valor que tem em dinheiro"))

    msg = vouNaoVou(valor)

    alert(msg)

}

function ParOuImpar(){
    let inicio = 0;
    let fim = 0;
    let totpar = 0
    let totimpar = 0

    function verifica(start, stop){
        

        for(let i = start; i <= stop; i++ ) {
    
        if(i % 2 == 0) {
            totpar = totpar + 1
            document.write("O número " + i + " é Par <br>")  
        } else if (i % 2 !=	0) {
            totimpar = totimpar + 1
            document.write("O número " + i + " é Impar <br>")
        }
    }
        alert("TOTAL \n O início indicado foi " + inicio + " e o final indicado foi " + fim + "\n O total de números pares é: " + totpar + "\n O total de números impares é: " + totimpar )
    }

    inicio = Number(prompt("Informe o início"))
    fim = Number(prompt("Informe o Fim"))

    verifica(inicio, fim)
}