package entities;

public class Aluguel {

	/*Aluguel de dez quartos:
	 * Um programa que inicie os dez quartos 
	 * vazios, e depois leia uma N(pode ser 1 a 10).
	 * Registre o aluguel,nome e email dos hospedes e
	 *  o quarto que ele escolheu.ao final mostre um
	 *  relatorio com todas as ocupacoes
	 * 
	 */
	
	private String nome;
	private String email;
	//get = pague
	//set = faça
	
	public Aluguel(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return nome +", "+email;
	}
	
	
	
}
