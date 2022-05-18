package questao04;

public class Texto {
	private String textoArmazenado;
	
	public Texto(String textoArmazenado) {
		this.textoArmazenado = textoArmazenado;
	}
	
	public void atualizarTexto(String novoTexto) {
		textoArmazenado = novoTexto;
	}
	
	public void concatenarTexto(String texto) {
		textoArmazenado = textoArmazenado + texto;
	}
	
	public void exibirTexto() {
		System.out.println(textoArmazenado);
	}

}
