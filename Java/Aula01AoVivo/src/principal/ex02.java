package principal;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//System.out.println("Indique o Nome do piloto");
		
		//String nomePiloto = entrada.nextLine();
		
		//System.out.println("O piloto hoje será o " + nomePiloto);
		
		double media = 0;
		double nota = 0;
		int i = 0;
		
		for(i = 1; i <= 4; i++) {
			System.out.println("Indique a " + i + "a nota");
			nota = entrada.nextDouble();
			media = nota + media;
		}
		
		System.out.println(media/4);
	}

}
