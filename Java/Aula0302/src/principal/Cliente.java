package principal;

public class Cliente {
	private int id;
	private String nome;
	private String tel;	
	
	public Cliente(int id, String nome, String tel) {
		super();
		this.id = id;
		this.nome = nome;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
