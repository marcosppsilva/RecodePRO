Algoritmo "Avanti Turismo"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Fl�vio
// Descri��o   : Programa para gerenciar cadastro de clientes e trajetos
// Autor(a)    : Marcos Paulo Pinto da Silva
// Data atual  : 25/07/2023
Var
   // Se��o de Declara��es das vari�veis
   clientes: vetor[1..5] de caractere
   destinos: vetor[1..5] de caractere
   viagem: vetor[1..5, 1..2] de caractere
   l,c,op,id, iddestino, linha: inteiro
   continuar, clientequeviaja, destinoqueviaja: caractere

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   //Aqui inicia o menu da aplica��o solicitando o que o usu�rio quer fazer
   //Variaveis preenchidas pois j� fuunciona, apenas para fazer teste de viagem

   clientes[1] <- "Marcos"
   clientes[2] <- "Jo�o"
   clientes[3] <- "J�nior"
   clientes[4] <- "Maria"
   clientes[5] <- "Pedro"

   destinos[1] <- "Lisboa"
   destinos[2] <- "Paris"
   destinos[3] <- "Berlin"
   destinos[4] <- "Porto"
   destinos[5] <- "Salvador"
   //defino uma estrutura de repetic��o em loop onde o programa ser�
   //executado enquanto eu quiser fazer alguma das opera��es
   repita

      escreval("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
      escreval("            AVANTI TURISMO")
      escreval("           SEJA BEM VINDO!")
      escreval("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
      escreval("           Escolha uma Op��o")
      escreval("1 - Para cadastrar um cliente")
      escreval("2 - Para cadastrar um destino")
      escreval("3 - Para cadastrar uma viagem")
      escreval("4 - Para consultar os clientes")
      escreval("5 - Para consultar os destinos")
      escreval("6 - Para consultar viagens")
      escreval("                                ")
      escreval("      Aperte qualquer tecla para fechar")
      escreval("                                ")
      escreval("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
      //Onde o usu�rio escolhe a op��o
      leia (op)
      //Aqui come�a a estrutura de escolha
      limpatela
      escolha(op)
      caso 1
         //Aqui os clientes s�o cadastrados
         para c de 1 ate 5 faca
            escreva("Informe o nome do cliente: ")
            leia (clientes[c])
         fimpara
      caso 2
         //Aqui os destinos s�o cadastrados
         para c de 1 ate 5 faca
            escreva("Informe o destino: ")
            leia (destinos[c])
         fimpara
      caso 3
         //Aqui as viagens s�o cadastrados
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
         //Aqui retiro o destino para onde ele vai
         para c de 1 ate 5 faca
            se (iddestino = c) entao
               destinoqueviaja <- destinos[c]
            fimse
         fimpara

         //Aqui percorro a matriz e vejo se as celulas estao vazias, caso esteja posso adicionar elementos a viagem
         para l de 1 ate 5 faca
              se (viagem[l] = "") e (viagem[c] = "") entao
              para c de 1 ate 1 faca
                  viagem[l,1] <- clientequeviaja
                  viagem[l,2] <- destinoqueviaja
               fimpara
            fimse
         fimpara

      caso 4
         //Aqui os clientes s�o consultados
         para c de 1 ate 5 faca
            escreval(c,"� Cliente: ", clientes[c])
         fimpara
      caso 5
         //Aqui os destinos s�o consultados
         para c de 1 ate 5 faca
            escreval(c,"� Destino: ", destinos[c])
         fimpara
      caso 6
         //Aqui as viagens s�o consultadas ***Ainda n�o funciona***
         escreval ("Destino     "," ":15,"Cliente")
         escreval (" ")
         para l de 1 ate 5 faca
            //escreva (l,"� Viagem: ")
            para c de 1 ate 2 faca
               escreva(viagem[l,c])
               escreva(" ":15)
            fimpara
            escreval()
         fimpara

      outrocaso
         escreva("Quer mesmo sair? S/N : ")
         leia(continuar)
      fimescolha
      //Aqui defino a condi��o para dizer se meu programa continuar� sua execu��o
      escreva("Quer fazer mais alguma opera��o? S/N : ")
      leia(continuar)
      limpatela
   ate (continuar = "n")


Fimalgoritmo