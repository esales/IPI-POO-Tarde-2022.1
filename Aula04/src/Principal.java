
public class Principal {

	public static void main(String[] args) {
		Atleta atleta = new Atleta("Teste", "Atletismo");
		
		System.out.println("N�mero de medalhas: " + atleta.retornaNumeroMedalhas());
		
		atleta.decrementarMedalhas();
		atleta.incrementarMedalhas();
		atleta.incrementarMedalhas();
		System.out.println("N�mero de medalhas: " + atleta.retornaNumeroMedalhas());
		
		atleta.decrementarMedalhas();
		atleta.decrementarMedalhas();
		atleta.decrementarMedalhas();
		System.out.println("N�mero de medalhas: " + atleta.retornaNumeroMedalhas());

	}
}