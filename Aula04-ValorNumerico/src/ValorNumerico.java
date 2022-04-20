public class ValorNumerico {
	private int valor;
	
	public ValorNumerico(int valor) {
		this.valor = valor;
	}
	
	public void incrementarValor() {
		this.valor++;
	}
	
	public void decrementarValor() {
		this.valor--;
	}
	
	public void zerarValor() {
		this.valor = 0;
	}
	
	public void multiplicarValor(int numero) {
		this.valor = this.valor * numero;
	}
	
	public void imprimirValor() {
		System.out.println("Valor atual: " + this.valor);
	}
	
	public int recuperarValor() {
		return this.valor;
	} //getValor
	
	public void setarValor(int numero) {
		if (numero < 500)
			this.valor = numero;
	} //setValor
	
	
	
	
	
}