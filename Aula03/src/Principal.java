public class Principal {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo("Azul", 175, 4, 4, true, 220);
		
		System.out.println("Número de rodas: " + veiculo.numeroRodas);
		System.out.println("Velocidade: " + veiculo.velocidade);
		
		veiculo.acelerar(25);
		
		System.out.println("Velocidade: " + veiculo.velocidade);
		
		veiculo.acelerar(25);
		
		System.out.println("Velocidade: " + veiculo.velocidade);
		
	}
}