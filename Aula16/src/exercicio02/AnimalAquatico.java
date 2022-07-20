package exercicio02;

public class AnimalAquatico extends Animal {
	private String tipoRespiracao;
	
	public AnimalAquatico(String nome, int numeroPatas, String tipoRespiracao) {
		super(nome, numeroPatas);
		this.tipoRespiracao = tipoRespiracao;
	}

	public String getTipoRespiracao() {
		return tipoRespiracao;
	}

	public void setTipoRespiracao(String tipoRespiracao) {
		this.tipoRespiracao = tipoRespiracao;
	}
}