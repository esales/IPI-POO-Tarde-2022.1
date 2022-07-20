package exercicio01;

public class Principal {

	public static void main(String[] args) {
		Funcionario[] funcionarios = new Funcionario[10];
		
		Funcionario f1 = new Funcionario("Funcionário 1", 50, 2000);
		Funcionario f2 = new Funcionario("Funcionário 2", 40, 4000);
		Funcionario f3 = new Funcionario("Funcionário 3", 40, 3500);
		
//		System.out.println( f2.getNome() );
		
		funcionarios[0] = f1;
		funcionarios[1] = f2;
		funcionarios[2] = f3;
		
		f1.setNome("Novo nome");
		
		System.out.println(funcionarios[0].getNome());
		

	}
}