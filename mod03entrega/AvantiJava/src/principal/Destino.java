package principal;

public class Destino {
	private int id_destino;
	private String pais;
	private String provincia_estado;
	private String cidade;
	private Double valor;
	
	
	public Destino() {
		
	}

	public Destino(int id_destino, String pais, String provincia_estado, String cidade, Double valor) {
		super();
		this.id_destino = id_destino;
		this.pais = pais;
		this.provincia_estado = provincia_estado;
		this.cidade = cidade;
		this.valor = valor;
	}


	public int getId_destino() {
		return id_destino;
	}


	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getProvincia_estado() {
		return provincia_estado;
	}

	public void setProvincia_estado(String provincia_estado) {
		this.provincia_estado = provincia_estado;
	}


	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}	
	
}