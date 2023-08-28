package principal;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double acumulador = 0, media = 0;
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Informe a " + (i+1) + "ª Nota");
			
			acumulador = teclado.nextDouble() + acumulador;
		}
		
		media = acumulador / 3;
		System.out.println(media);
		
		if(media < 5) {
			System.out.println("A média do aluno foi " + media + " e ele foi REPROVADO");
		} else if(media >= 5 && media < 6) {
			System.out.println("A média do aluno foi " + media + " e ele foi APROVADO COM RECUPERAÇÃO");
		} else if(media >= 6 && media <= 10) {
			System.out.println("A média do aluno foi " + media + " e ele foi APROVADO DIRETO");
		} else {
			System.out.println("Provável erro de digitação. A média das notas nunca pode ser superior a 10 ou abaixo de 0");
		}
		
		
	}

}
