package questao01;
public class OperacaoMatematica {
	private int numeroA;
	private int numeroB;
	
	public OperacaoMatematica(int numeroA, int numeroB) {
		this.numeroA = numeroA;
		this.numeroB = numeroB;
	}
	
	public void somar() {
		int soma =numeroA + numeroB;
		
		System.out.println("A soma dos n�meros �: " + soma);
	}
	
	public void subtrair() {
		int subtracao = numeroA - numeroB;
		
		System.out.println("O resultado da subtra��o �: " + subtracao);
	}
	
	public void exibirNumeros() {
		System.out.println(numeroA);
		System.out.println(numeroB);
	}
}