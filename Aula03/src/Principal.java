public class Principal {

	public static void main(String[] args) {
		
		Veiculo qualquerNome = new Veiculo();
		
		System.out.println("Velocidade: " + qualquerNome.velocidade);
		
		qualquerNome.acelerar(25);
		
		System.out.println("Velocidade: " + qualquerNome.velocidade);
		
		qualquerNome.acelerar(25);
		
		System.out.println("Velocidade: " + qualquerNome.velocidade);
		
	}
}