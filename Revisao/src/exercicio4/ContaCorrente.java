package exercicio4;

public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(boolean chequeEspecial) {
		super();
		this.chequeEspecial = chequeEspecial;
	}

	private boolean chequeEspecial;

	public boolean isChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(boolean chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
}