package base;

public class Persona {

	private String nome;
	private String cognome;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	@Override
	public String toString() {
		return "Persona: nome=" + this.nome + ", cognome=" + this.cognome;
	}


}
