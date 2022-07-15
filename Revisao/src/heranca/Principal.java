package heranca;

public class Principal {

	public static void main(String[] args) {
		VeiculoTerrestre veiculo1 = new VeiculoTerrestre();
		veiculo1.setMarca("Renault");
		System.out.println( veiculo1.getMarca() );
		
		System.out.println("");
		System.out.println("veiculo1");
		System.out.println(veiculo1 instanceof VeiculoTerrestre);
		System.out.println(veiculo1 instanceof Veiculo);
		
		System.out.println("");
		System.out.println("veiculo2");
		
		Veiculo veiculo2 = new Veiculo();
		System.out.println(veiculo2 instanceof VeiculoTerrestre);
		System.out.println(veiculo2 instanceof Veiculo);
	}
}