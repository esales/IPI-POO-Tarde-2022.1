
public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Fulano");
		
		System.out.println( pessoa.getNome() );
				
		pessoa.setNome("Teste");
		
		System.out.println( pessoa.getNome() );
	}
}