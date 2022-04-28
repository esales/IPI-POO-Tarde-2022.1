import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[3];
		String nome = "";
		String sobrenome = "";
		double salario = 0;
		int idade = 0;
		Pessoa pessoaMaiorIdade = null;
		Pessoa pessoaMenorIdade = null;
		int maiorIdade = -1;
		int menorIdade = 200;
		int qtdSalarioMaior = 0;
		
		for(int i=0; i <= pessoas.length-1; i++) {
			System.out.println("Digite o nome: ");
			nome = scanner.next();
			
			System.out.println("Digite o sobrenome: ");
			sobrenome = scanner.next();
			
			System.out.println("Digite a idade: ");
			idade = scanner.nextInt();
			
			System.out.println("Digite o salario: ");
			salario = scanner.nextDouble();
			
			pessoas[i] = new Pessoa(nome, sobrenome, salario, idade);
			
			if (pessoas[i].getIdade() > maiorIdade) {
				maiorIdade = pessoas[i].getIdade();
				pessoaMaiorIdade = pessoas[i];
			}
			
			if (pessoas[i].getIdade() < menorIdade) {
				menorIdade = pessoas[i].getIdade();
				pessoaMenorIdade = pessoas[i];
			}
			
			if (pessoas[i].getSalario() > 2000) {
				qtdSalarioMaior++;
			}
		}
		
		for(Pessoa pessoa:pessoas) {
			System.out.println(pessoa.getNome());
		}
		
		System.out.println("Nome da pessoa com maior idade: " + pessoaMaiorIdade.getNome());
		System.out.println("Nome da pessoa com menor idade: " + pessoaMenorIdade.getNome());
		System.out.println("Total de pessoas salário > 2000: " + qtdSalarioMaior);
	}
}