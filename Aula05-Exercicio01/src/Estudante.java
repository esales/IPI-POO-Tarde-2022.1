
public class Estudante {
	private String nome;
	private String matricula;
	private String endereco;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public Estudante(String nome, String matricula, String endereco) {
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public double calcularMedia() {
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		return media;
	}
	
	public void informarSituacao() {
		double media = calcularMedia();
		
		if(media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Recuperação");
		}
	}
	
	public String retornarSituacao() {
		double media = calcularMedia();
		String situacao = "";
		
		if(media >= 6) {
			situacao = "Aprovado";
		} else {
			situacao = "Recuperação";
		}
		
		return situacao;
	}
}