import java.util.Scanner;

public class Circunferencia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double raio = 0;
		double pi = 3.14159;
		double area = 0;
		
		System.out.println("Digite o raio: ");
		raio = scanner.nextDouble();
		
		area = pi*raio*raio;
		
		System.out.println("Área: " + area);
		

	}

}
