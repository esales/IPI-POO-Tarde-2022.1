import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ValorNumerico valorNumerico = new ValorNumerico(10);
		
		valorNumerico.imprimirValor();
		
		valorNumerico.incrementarValor();
		valorNumerico.imprimirValor();

		valorNumerico.decrementarValor();
		valorNumerico.imprimirValor();
		
		valorNumerico.multiplicarValor(3);
		valorNumerico.imprimirValor();
		
		valorNumerico.zerarValor();
		valorNumerico.imprimirValor();
		
		int numero = valorNumerico.recuperarValor();
		System.out.println("número: " +  numero);
		
		valorNumerico.setarValor(9999);
		valorNumerico.imprimirValor();
	}
}