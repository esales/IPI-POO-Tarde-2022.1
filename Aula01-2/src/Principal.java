import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero:");
		int numeroRecebido = scanner.nextInt();
		
		System.out.println("O n�mero recebido foi: " + numeroRecebido);
	}
}