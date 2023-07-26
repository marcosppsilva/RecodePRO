Algoritmo "Avanti Turismo"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Flávio
// Descrição   : Programa para gerenciar cadastro de clientes e trajetos
// Autor(a)    : Marcos Paulo Pinto da Silva
// Data atual  : 25/07/2023
Var
   // Seção de Declarações das variáveis
   clientes: vetor[1..5] de caractere
   destinos: vetor[1..5] de caractere
   viagem: vetor[1..5, 1..2] de caractere
   l,c,op,id, iddestino: inteiro
   continuar, clientequeviaja, destinoqueviaja: caractere

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   //Aqui inicia o menu da aplicação solicitando o que o usuário quer fazer

   //defino uma estrutura de repeticção em loop onde o programa será
   //executado enquanto eu quiser fazer alguma das operações
   repita

      escreval("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
      escreval("            AVANTI TURISMO")
      escreval("           SEJA BEM VINDO!")
      escreval("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
      escreval("           Escolha uma Opção")
      escreval("1 - Para cadastrar um cliente")
      escreval("2 - Para cadastrar um destino")
      escreval("3 - Para cadastrar uma viagem")
      escreval("4 - Para consultar os clientes")
      escreval("5 - Para consultar os destinos")
      escreval("6 - Para consultar clientes e seus destinos")
      escreval("                                ")
      escreval("      Aperte qualquer tecla para fechar")
      escreval("                                ")
      escreval("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
      //Onde o usuário escolhe a opção
      leia (op)
      //Aqui começa a estrutura de escolha
      limpatela
      escolha(op)
      caso 1
         //Aqui os clientes são cadastrados
         para c de 1 ate 5 faca
            escreva("Informe o nome do cliente: ")
            leia (clientes[c])
         fimpara
      caso 2
         //Aqui os destinos são cadastrados
         para c de 1 ate 5 faca
            escreva("Informe o destino: ")
            leia (destinos[c])
         fimpara
      caso 3
         //Aqui as viagens são cadastrados
         escreva("Informe o id do cliente: ")
         leia (id)
         escreva("Informe o id do destino: ")
         leia (iddestino)
         //Aqui retiro o cliente que vai viajar
         para c de 1 ate 5 faca
              se (id = c) entao
                 clientequeviaja <- clientes[c]
              fimse
         fimpara
         //Aqui retiro o destino para onde ele vai ***Ainda não funciona***
         para c de 1 ate 5 faca
              se (iddestino = c) entao
                 destinoqueviaja <- destinos[c]
              fimse
         fimpara

         para l de 1 ate 5 faca
              para c de 1 ate 2 faca
              se viagem[l, c] = "" entao
                   viagem[l, c] <- clientequeviaja
                   viagem[l, c + 1] <- destinoqueviaja
              fimse
              fimpara
         fimpara

         //para l de 1 ate 5 faca
         //para c de 1 ate 2 faca
               //se (viagem[l,c] <> " ") entao
               //viagem[l] <- destinoqueviaja
             //  viagem[c] <- clientequeviaja
           //    fimse
         //fimpara
         //fimpara
      caso 4
         //Aqui os clientes são consultados
         para c de 1 ate 5 faca
            escreval(c,"° Cliente: ", clientes[c])
         fimpara
      caso 5
         //Aqui os destinos são consultados
         para c de 1 ate 5 faca
            escreval(c,"° Destino: ", destinos[c])
         fimpara
      caso 6
         //Aqui as viagens são consultadas ***Ainda não funciona***
         escreval ("Destino","   ","Cliente")
         para l de 1 ate 5 faca
            //escreva (l,"° Viagem: ")
            para c de 1 ate 2 faca
               escreva(viagem[l,c])
            fimpara
            escreval()
         fimpara

      outrocaso
         escreva("Quer mesmo sair? S/N : ")
         leia(continuar)
      fimescolha
      //Aqui defino a condição para dizer se meu programa continuará sua execução
      escreva("Quer fazer mais alguma operação? S/N : ")
      leia(continuar)
      limpatela
   ate (continuar = "n")


Fimalgoritmo