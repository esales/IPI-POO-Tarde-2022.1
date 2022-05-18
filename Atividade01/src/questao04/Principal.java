package questao04;

public class Principal {

	public static void main(String[] args) {
		Texto texto = new Texto("IFPE");
		
		texto.exibirTexto();
		
		texto.atualizarTexto("Instituto");
		texto.exibirTexto();
		
		texto.concatenarTexto(" Federal");
		texto.exibirTexto();
	}

}
