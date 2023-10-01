package principal;

public class Viagem_Viajante {
	
	private int id_viagem_viajante;
	private Viagem viagem;
	private Usuario usuario;
	
	public Viagem_Viajante() {
		
	}

	public Viagem_Viajante(int id_viagem_viajante, Viagem viagem, Usuario usuario) {
		super();
		this.id_viagem_viajante = id_viagem_viajante;
		this.viagem = viagem;
		this.usuario = usuario;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
			
}
