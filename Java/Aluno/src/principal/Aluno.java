package principal;

public class Aluno {

	private String matricula;
	private String nome;
	private double nota1, nota2, notaTrabalho;
	
	public double retornaMedia() {
		return (nota1 + nota2 + notaTrabalho) / 3;
	}
	public void resultado (double media) {
		if(media > 7) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno Reprovado");
		}
	}
	public Aluno(String matricula, String nome, double nota1, double nota2, double notaTrabalho) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaTrabalho = notaTrabalho;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNotaTrabalho() {
		return notaTrabalho;
	}
	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
	
	
}
