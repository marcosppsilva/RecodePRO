package principal;

public class Imovel {

	private int codigo_imovel;
	private double valor;
	private String situacao;
	private String endereco_imv;
	private String proprietario;
	
	
	
	public Imovel(int codigo_imovel, double valor, String situacao, String endereco_imv, String proprietario) {
		super();
		this.codigo_imovel = codigo_imovel;
		this.valor = valor;
		this.situacao = situacao;
		this.endereco_imv = endereco_imv;
		this.proprietario = proprietario;
	}

	public Imovel() {
	
	}
	
	
	

	public int getCodigo_imovel() {
		return codigo_imovel;
	}

	public void setCodigo_imovel(int codigo_imovel) {
		this.codigo_imovel = codigo_imovel;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getEndereco_imv() {
		return endereco_imv;
	}

	public void setEndereco_imv(String endereco_imv) {
		this.endereco_imv = endereco_imv;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
		
	
}
