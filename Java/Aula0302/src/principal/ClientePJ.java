package principal;

public class ClientePJ extends Cliente {
	
	
	private String cnpj;
	private String ie;
	
	public ClientePJ(int id, String nome, String tel) {
		super(id, nome, tel);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	
	

}
