package principal;

public class Gato extends Animal {
	

	private String miau;
	
	
	public Gato(int patas, int olhos, String dieta, String especie, String miau) {
		super(patas, olhos, dieta, especie);
		this.miau = miau;
	}

	public String getMiau() {
		return miau;
	}

	public void setMiau(String miau) {
		this.miau = miau;
	}
	
	public void miando(int quantid) {
		for (int i = 0; i <= quantid; i++) {
			System.out.println(miau);
		}
	}

}
