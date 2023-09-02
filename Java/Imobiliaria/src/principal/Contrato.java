package principal;

import java.util.Date;

public class Contrato {

	private int codigo_contrato;
	private Cliente cliente;
	private Imovel imovel;
	private String tipoFianca;
	private String inquilino;
	private String fiador;
	private double valorAluguel;
	private double taxaAdm;
	private Date data_vencimento, dataEntrada, dataSaida;
	
	
	
	
	public Contrato(int codigo_contrato, Cliente cliente, Imovel imovel, String tipoFianca, String inquilino,
			String fiador, double valorAluguel, double taxaAdm, Date data_vencimento, Date dataEntrada,
			Date dataSaida) {
		super();
		this.codigo_contrato = codigo_contrato;
		this.cliente = cliente;
		this.imovel = imovel;
		this.tipoFianca = tipoFianca;
		this.inquilino = inquilino;
		this.fiador = fiador;
		this.valorAluguel = valorAluguel;
		this.taxaAdm = taxaAdm;
		this.data_vencimento = data_vencimento;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}


	public Contrato() {
		
	}


	public int getCodigo_contrato() {
		return codigo_contrato;
	}


	public void setCodigo_contrato(int codigo_contrato) {
		this.codigo_contrato = codigo_contrato;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Imovel getImovel() {
		return imovel;
	}


	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}


	public String getTipoFianca() {
		return tipoFianca;
	}


	public void setTipoFianca(String tipoFianca) {
		this.tipoFianca = tipoFianca;
	}


	public String getInquilino() {
		return inquilino;
	}


	public void setInquilino(String inquilino) {
		this.inquilino = inquilino;
	}


	public String getFiador() {
		return fiador;
	}


	public void setFiador(String fiador) {
		this.fiador = fiador;
	}


	public double getValorAluguel() {
		return valorAluguel;
	}


	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}


	public double getTaxaAdm() {
		return taxaAdm;
	}


	public void setTaxaAdm(double taxaAdm) {
		this.taxaAdm = taxaAdm;
	}


	public Date getData_vencimento() {
		return data_vencimento;
	}


	public void setData_vencimento(Date data_vencimento) {
		this.data_vencimento = data_vencimento;
	}


	public Date getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public Date getDataSaida() {
		return dataSaida;
	}


	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	
	
	
	
}
