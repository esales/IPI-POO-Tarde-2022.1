public class Principal {

	public static void main(String[] args) {
		Estudante estudante = new Estudante("Fulano", "123abc", "Rua Bulhões");
		
		System.out.println(estudante.getNome());
		
		estudante.setNome("Sicrano");
		
		System.out.println(estudante.getNome());
		
		System.out.println(estudante.calcularMedia());
		
		estudante.setNota1(10);
		estudante.setNota2(5);
		estudante.setNota3(7);
		estudante.setNota4(5);
		
		
		System.out.println(estudante.calcularMedia());
		
		estudante.informarSituacao();
		
		String situacao = estudante.retornarSituacao();
		System.out.println(situacao);
	}
}