import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNumero = scanner.nextInt();
		
		int soma = primeiroNumero + segundoNumero;
		
		System.out.println("Soma: " + soma);
				
		
	}
}