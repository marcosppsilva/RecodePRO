package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno01 = new Aluno("0011", "Marcos Paulo", 7, 8, 6.5);
		
		double nota = aluno01.retornaMedia();
		
		System.out.println(aluno01.getMatricula() + " " + aluno01.getNome()); 
		aluno01.resultado(nota);

	}

}
