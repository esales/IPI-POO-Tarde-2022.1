package questao03;

public class CorrecaoGabarito {
	private char[] gabarito;
	
	public CorrecaoGabarito(char[] gabarito) {
		this.gabarito = gabarito;
	}
	
	public void avaliarRespostas(char[] respostas) {
		int numeroAcertos = 0;
		
		for(int i=0; i<=this.gabarito.length-1; i++) {
			if(this.gabarito[i] == respostas[i]) 
				numeroAcertos++;
		}
		
		System.out.println("Total de respostas corretas: " + numeroAcertos);
	}
}