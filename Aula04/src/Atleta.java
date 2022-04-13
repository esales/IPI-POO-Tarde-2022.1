
public class Atleta {
	private String nome;
	private String esporte;
	private int numeroMedalhas;
	
	public Atleta(String nome, String esporte) {
		this.nome = nome;
		this.esporte = esporte;
		this.numeroMedalhas = 0;
	}
	
	public void incrementarMedalhas() {
		this.numeroMedalhas++;
	}
	
	public void decrementarMedalhas() {
		if (this.numeroMedalhas > 0) {
			this.numeroMedalhas--;
		}
	}
	
	public int retornaNumeroMedalhas() {
		return this.numeroMedalhas;
	}
}
