package exercicio02;

public class Principal {

	public static void main(String[] args) {
		AnimalAquatico a1 = new AnimalAquatico("peixe", 0, "brânquias");
		AnimalAquatico a2 = new AnimalAquatico("tartaruga", 4, "pulmões");
		
		AnimalTerrestre t1 = new AnimalTerrestre("cachorro", 4, false);
		AnimalTerrestre t2 = new AnimalTerrestre("pato", 2, true);
		
		System.out.println(t2.getNome());
	}

}
