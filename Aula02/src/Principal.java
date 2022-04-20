import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int numeroRecebido = scanner.nextInt();
		
		System.out.println("O número digitado foi: " + numeroRecebido);
		
	}
}