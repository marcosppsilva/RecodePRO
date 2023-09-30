package principal;
import java.util.Date;

public class Viagem {

	private int id_viagem;
	private Date data;
	private String tipo;
	private int duracao;
	private int viajantes;
	private Double valor_viagem;
	private Usuario usuario;
	private Destino destino;
	private Estadia estadia;
	
	
	
	
	
	public Viagem() {
		
	}

	public Viagem(int id_viagem, Date data, String tipo, int duracao, int viajantes, Double valor_viagem,
			Usuario usuario, Destino destino, Estadia estadia) {
		super();
		this.id_viagem = id_viagem;
		this.data = data;
		this.tipo = tipo;
		this.duracao = duracao;
		this.viajantes = viajantes;
		this.valor_viagem = valor_viagem;
		this.usuario = usuario;
		this.destino = destino;
		this.estadia = estadia;
	}

	public int getId_viagem() {
		return id_viagem;
	}

	public void setId_viagem(int id_viagem) {
		this.id_viagem = id_viagem;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getViajantes() {
		return viajantes;
	}

	public void setViajantes(int viajantes) {
		this.viajantes = viajantes;
	}

	public Double getValor_viagem() {
		return valor_viagem;
	}

	public void setValor_viagem(Double valor_viagem) {
		this.valor_viagem = valor_viagem;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Estadia getEstadia() {
		return estadia;
	}

	public void setEstadia(Estadia estadia) {
		this.estadia = estadia;
	}
	
}
