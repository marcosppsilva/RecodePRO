package principal;

public class Animal {

	private int patas;
	private int olhos;
	private String dieta;
	private String especie;
	
	public Animal(int patas, int olhos, String dieta, String especie) {
		super();
		this.patas = patas;
		this.olhos = olhos;
		this.dieta = dieta;
		this.especie = especie;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public int getOlhos() {
		return olhos;
	}
	public void setOlhos(int olhos) {
		this.olhos = olhos;
	}
	public String getDieta() {
		return dieta;
	}
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	
}
