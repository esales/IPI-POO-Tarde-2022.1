package exercicioRevisao;

public class Pessoa {
	private String nome;
	private int idade;
	private double salario;
	private boolean casaPropria;
	
	public Pessoa(String nome,
				  int idade, 
				  double salario, 
				  boolean casaPropria) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.casaPropria = casaPropria;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		
		String respostaCasa = "N�o";
		if (casaPropria) {
			respostaCasa = "Sim";
		}
		
		System.out.println("Tem casa pr�pria: "+ respostaCasa);
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
	public boolean getCasaPropria() {
		return casaPropria;
	}
	public void setCasaPropria(boolean casaPropria) {
		this.casaPropria = casaPropria;
	}
}