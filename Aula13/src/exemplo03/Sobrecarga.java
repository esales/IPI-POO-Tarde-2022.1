package exemplo03;

public class Sobrecarga {
	private int numA;
	private int numB;
	
	public Sobrecarga() {
		this.numA = 10;
		this.numB = 10;
	}
	
	public Sobrecarga(int numA, int numB) {
		this.numA = numA;
		this.numB = numB;
	}
	
	public Sobrecarga(int numA) {
		this.numA = numA;
	}
	
	public Sobrecarga(int numB) {
		this.numB = numB;
	}
	
	
	
	
	
	public void exibirNumeros() {
		System.out.println(numA + " - " + numB);
	}
	
	
	
	
	public void somar(int numA, int numB) {
		int soma = numA + numB;
		System.out.println("somar (int): " + soma);
		
	}
	
	public void somar(int numA, int numB, int numC) {
		int soma = numA + numB + numC;
		System.out.println("somar (int-3): " + soma);
		
	}

	public void somar(double numA, double numB) {
		double soma = numA + numB; 
		System.out.println("somar (double): " + soma);
	}
	
	
	public void cadastrar(String nome, int idade) {
		System.out.println("nome, idade");
	}
	
	public void cadastrar(int idade, String nome) {
		System.out.println("idade, nome");
	}
	
	
}
