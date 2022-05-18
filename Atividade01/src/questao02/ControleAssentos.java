package questao02;

public class ControleAssentos {
	
	private boolean[] assentos;
	
	public ControleAssentos(int quantidadeAssentos) {
		this.assentos = new boolean[quantidadeAssentos];
	}
	
	public void ocuparAssento(int numeroAssento) {
		if (assentos[numeroAssento]) {
			System.out.println("Assento " + numeroAssento + " já está ocupado.");
		} else {
			assentos[numeroAssento] = true;
			System.out.println("Assento " + numeroAssento + " reservado com sucesso.");
		}
				
	}
	
	public void desocuparAssento(int numeroAssento) {
		if (assentos[numeroAssento]) {
			assentos[numeroAssento] = false;
			System.out.println("Cancelamento da reserva do assento " + numeroAssento + " efetivado com sucesso.");
		} else {
			System.out.println("Assento " + numeroAssento + " não está ocupado.");
		}
	}
	
	public void exibirListaSituacao() {
		for(int i=0; i<=assentos.length-1; i++) {
			String texto = "Assento " + i + ": ";
			
			if(assentos[i]){
				texto = texto + "ocupado";
			}else {
				texto = texto + "desocupado";
			}
			
			System.out.println(texto);
		}
	}
}