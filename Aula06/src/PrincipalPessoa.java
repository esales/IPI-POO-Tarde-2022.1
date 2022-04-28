
public class PrincipalPessoa {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[5];
		pessoas[0] = new Pessoa();
		pessoas[1] = new Pessoa();
		
		pessoas[0].setNome("Pessoa 01");
		pessoas[1].setNome("Pessoa 02");
		
		System.out.println(pessoas[0].getNome());
		System.out.println(pessoas[1].getNome());
		
	}
}