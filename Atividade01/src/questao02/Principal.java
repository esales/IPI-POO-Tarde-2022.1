package questao02;

public class Principal {

	public static void main(String[] args) {
		
		ControleAssentos controle = new ControleAssentos(5);
		
		controle.exibirListaSituacao();
		
		controle.ocuparAssento(2);
		controle.ocuparAssento(2);
		controle.desocuparAssento(3);
		
		controle.exibirListaSituacao();
	}
}