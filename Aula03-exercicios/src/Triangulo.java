import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int base = 0;
		int altura = 0;
		int area = 0;
		
		System.out.println("Digite a base: ");
		base = scanner.nextInt();
		
		System.out.println("Digite a altura: ");
		altura = scanner.nextInt();
		
		area = (base*altura)/2;
		
		System.out.println("Área: " + area);
	}
}
