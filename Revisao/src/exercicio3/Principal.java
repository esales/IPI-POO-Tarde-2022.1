package exercicio3;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();

		pessoa1.setNome("Teste");
		pessoa1.setIdade(25);
		pessoa1.setSalario(1500);
		pessoa1.setCasaPropria(true);
		
		pessoa1.exibirInformacoes();
	}

}
