import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome:");
		String nome = scanner.next();
		
		System.out.println("Digite o sobrenome: ");
		String sobrenome = scanner.next();
		
		String nomeCompleto = nome + " " + sobrenome;
		
		System.out.println(nomeCompleto);
		
		

	}

}
