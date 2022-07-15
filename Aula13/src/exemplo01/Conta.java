package exemplo01;

public class Conta {
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
		System.out.println("Valor do saque: " + valor);
	}

	public void exibirSaldo() {
		System.out.println("Saldo: " + this.saldo);
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
}