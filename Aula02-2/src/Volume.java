import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		int altura = 0;
		int largura = 0;
		int comprimento = 0;
		int volume = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		altura = scanner.nextInt();
		
		System.out.println("Digite a largura: ");
		largura = scanner.nextInt();
		
		System.out.println("Digite o comprimento: ");
		comprimento = scanner.nextInt();
		
		volume = altura * largura * comprimento;
		
		System.out.println("O volume é " + volume);
		
	}

}
