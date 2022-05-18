package questao01;
public class Principal {

	public static void main(String[] args) {
		
		OperacaoMatematica operacao = new OperacaoMatematica(10, 2);
		
		operacao.somar();
		
		operacao.subtrair();
		
		operacao.exibirNumeros();
		
	}
}