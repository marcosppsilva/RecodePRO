package principal;

public class Estadia {
private int id_estadia;
private String nome_estadia;
private String tipo;
private String endereco;
private String telefone;
private String email;
private Double valor;
public Estadia() {
	
}
public Estadia(int id_estadia, String nome_estadia, String tipo, String endereco, String email, Double valor) {
	super();
	this.id_estadia = id_estadia;
	this.nome_estadia = nome_estadia;
	this.tipo = tipo;
	this.endereco = endereco;
	this.email = email;
	this.valor = valor;
}
public int getId_estadia() {
	return id_estadia;
}
public void setId_estadia(int id_estadia) {
	this.id_estadia = id_estadia;
}
public String getNome_estadia() {
	return nome_estadia;
}
public void setNome_estadia(String nome_estadia) {
	this.nome_estadia = nome_estadia;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}

}
