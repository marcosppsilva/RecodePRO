package principal;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do piloto: ");
		 
		String nomePiloto = entrada.next();
		 
		 System.out.print("Digite a distancia percorrida ");
		 
		 double distanciaPercorridaKm = entrada.nextDouble();
		 
		 System.out.print("Digite o gasto ");
		 
		 double tempoPercorrido = entrada.nextDouble();
		 double velocidadeMedia = distanciaPercorridaKm / tempoPercorrido;

 

		 System.out.printf(" A velocidade média de %S foi %.2f Km/h.", nomePiloto, velocidadeMedia );
		 
		 entrada.close();
	}

}
