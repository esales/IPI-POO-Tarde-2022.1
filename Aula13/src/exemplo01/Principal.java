package exemplo01;

public class Principal {
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(1000);
		ContaPoupanca contaPoupanca = new ContaPoupanca(500);
		
		contaPoupanca.exibirSaldo();		
		contaPoupanca.sacar(100);
		contaPoupanca.exibirSaldo();
	}
}