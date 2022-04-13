public class Veiculo {
	String cor;
	int velocidade;
	int numeroRodas;
	int numeroPortas;
	boolean possuiArCondicionado;
	int velocidadeMaxima;
	
	public Veiculo(String cor, 
				   int velocidade, 
				   int numeroRodas, 
				   int numeroPortas, 
				   boolean possuiArCondicionado, 
				   int velocidadeMaxima) {
		this.cor = cor;
		this.velocidade = velocidade;
		this.numeroRodas = numeroRodas;
		this.numeroPortas = numeroPortas;
		this.possuiArCondicionado = possuiArCondicionado;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	void acelerar(int incremento) {
		if (this.velocidade + incremento <= this.velocidadeMaxima) {
			this.velocidade += incremento;
		} else {
			this.velocidade = this.velocidadeMaxima;
		}
	}
}