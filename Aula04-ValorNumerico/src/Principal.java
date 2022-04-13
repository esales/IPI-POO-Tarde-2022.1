
public class Principal {

	public static void main(String[] args) {
		ValorNumerico valorNumerico = new ValorNumerico(50);
		valorNumerico.imprimirValor();
		
		valorNumerico.incrementarValor();
		valorNumerico.imprimirValor();

		valorNumerico.decrementarValor();
		valorNumerico.imprimirValor();
		
		valorNumerico.multiplicarValor(3);
		valorNumerico.imprimirValor();
		
		valorNumerico.zerarValor();
		valorNumerico.imprimirValor();
	}

}
