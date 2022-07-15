package exercicio3;

public class Pessoa {
	private String nome;
	private int idade;
	private double salario;
	private boolean casaPropria;
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: R$" + salario);
		System.out.println("Tem casa própria?" + casaPropria);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isCasaPropria() {
		return casaPropria;
	}
	public void setCasaPropria(boolean casaPropria) {
		this.casaPropria = casaPropria;
	}
}