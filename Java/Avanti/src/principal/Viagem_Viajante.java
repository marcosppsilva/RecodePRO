package principal;

public class Viagem_Viajante {
	
	private int id_viagem_viajante;
	private Viagem viagem;
	private Viajante viajante;
	
	public Viagem_Viajante() {
		
	}

	public Viagem_Viajante(int id_viagem_viajante, Viagem viagem, Viajante viajante) {
		super();
		this.id_viagem_viajante = id_viagem_viajante;
		this.viagem = viagem;
		this.viajante = viajante;
	}
	
	
	

	public int getId_viagem_viajante() {
		return id_viagem_viajante;
	}

	public void setId_viagem_viajante(int id_viagem_viajante) {
		this.id_viagem_viajante = id_viagem_viajante;
	}

	public Viagem getViagem() {
		return viagem;
	}

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}

	public Viajante getViajante() {
		return viajante;
	}

	public void setViajante(Viajante viajante) {
		this.viajante = viajante;
	}	
			
}
