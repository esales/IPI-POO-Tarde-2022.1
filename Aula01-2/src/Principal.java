import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		int numeroRecebido = scanner.nextInt();
		
		System.out.println("O número recebido foi: " + numeroRecebido);
	}
}