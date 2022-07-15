package exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcaoConta = 1;
		Conta conta;
		String nome = "";
		String cpf = "";
		
		System.out.println("Digite:");
		System.out.println("1 - conta corrente");
		System.out.println("2 - conta poupança");
		opcaoConta = scanner.nextInt();
		
		System.out.println("Digite o nome: ");
		nome = scanner.next();
		
		System.out.println("Digite o cpf: ");
		cpf = scanner.next();
		
		if(opcaoConta == 1) {
			int opcaoChequeEspecial = 1;
			boolean chequeEspecial = false;
			
			System.out.println("Autoriza cheque especial?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			opcaoChequeEspecial = scanner.nextInt();

			if (opcaoChequeEspecial == 1) {
				chequeEspecial = true;
			}else {
				chequeEspecial = false;
			}
			
			conta = new ContaCorrente(chequeEspecial);
				
		}else {
			conta = new ContaPoupanca();
		}
		
		conta.setNome(nome);
		conta.setCpf(cpf);
		conta.setSaldo(0);
		
		System.out.println("Nome: " + conta.getNome());
		System.out.println("Cpf: " + conta.getCpf());
		System.out.println("Saldo: " + conta.getSaldo());
	}
}