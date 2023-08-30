package principal;

public class Vendedor {

	private int id_vendedor;
	private String nomeVendedor;
	private String telefoneVendedor;
	
	public Vendedor(int id_vendedor, String nomeVendedor, String telefoneVendedor) {
		super();
		this.id_vendedor = id_vendedor;
		this.nomeVendedor = nomeVendedor;
		this.telefoneVendedor = telefoneVendedor;
	}

	public Vendedor() {
		super();
	}

	public int getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public String getTelefoneVendedor() {
		return telefoneVendedor;
	}

	public void setTelefoneVendedor(String telefoneVendedor) {
		this.telefoneVendedor = telefoneVendedor;
	}
	
	
	
	
	
}
