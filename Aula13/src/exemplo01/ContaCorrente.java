package exemplo01;

public class ContaCorrente extends Conta {
	
	private double taxa;

	public ContaCorrente(double saldo) {
		super(saldo);
		
		this.taxa = 10;
	}
	
	public void sacar(double valor) {
		double saldo = getSaldo();
		
		setSaldo(saldo - valor - taxa);
		
		System.out.println("Valor do saque: " + valor);
	}
}