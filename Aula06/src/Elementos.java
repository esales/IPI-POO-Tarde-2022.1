import java.util.Scanner;

public class Elementos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] elementos = new int[3];
		
		for(int i=0; i <= elementos.length-1; i++) {
			System.out.println("Digite um n�mero: ");
			elementos[i] = scanner.nextInt();
		}
		
		System.out.println("Imprimindo n�meros digitados...");
		
		for(int i=0; i <= elementos.length-1; i++) {
			System.out.println( elementos[i] );
		}
		
		for(int elemento: elementos) {
			System.out.println( elemento );
		}
	}
}
