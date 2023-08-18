package principal;
import java.util.Scanner;

public class ternario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int a, b, numerodias;
		
		a = 12;
		b = 8;
		numerodias = 20;
		
		//OPERADOR TERNÁRIO NADA MAIS É QUE UMA FORMA DE SIMPLIFICAR O IF, CONTUDO SÓ PODE SER USADO PARA 2 CONDIÇÕES
		String resultado = (a > b)? "Sim" : "Não";
		System.out.println(resultado);
		
		//OUTRO EXEMPLO MAS SEM RETORNAR RESULTADO, APENAS VERIFICANDO AS CONDIÇÕES
		System.out.println((numerodias <= 15)? "Primeira Quinzena" : "Segunda Quinzena");
		
		//EXERCÍCIOS COM TERNÁRIO
		//EX 01
		int idade;
		System.out.println("Apto a Votar?");
		System.out.println("Indique a idade do candidato");
		
		idade = teclado.nextInt();
		
		System.out.println((idade >= 16) ? "Apto para tirar o título de Eleitor" : "Inapto para tirar o título pois é menor de 16 anos");
		
		//EX 02
		
		System.out.println("Verifica Maioridade");
		System.out.println("Indique a idade");
		
		idade = teclado.nextInt();
		
		System.out.println((idade >= 18) ? "Maior de Idade" : "Menor de Idade");
		
		//EX 03
		int op;
		int est;
		System.out.println("Verifica Carteirinha do Estudante");
		System.out.println("Digite 1 Caso tenha carteirinha do estudante");
		System.out.println("Digite 2 Caso não tenha carteirinha do estudante");
		
		op = teclado.nextInt();
		
		est = (op < 2) ? (est = 1) : (est = 2);
		
		System.out.println((est < 2) ? "Terá desconto no bilhete de 50%" : "Terá desconto no bilhete de 15%");
		
		teclado.close();
	}

}
