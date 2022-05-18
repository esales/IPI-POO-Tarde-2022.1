
public class Principal {

	public static void main(String[] args) {
		VeiculoTerrestre terrestre = new VeiculoTerrestre("BMW");
		
		terrestre.setMarca("Honda");
		
		//System.out.println(terrestre.getMarca());
		
		Veiculo veiculo = new Veiculo("Fiat");
		
		//System.out.println(veiculo.getMarca());
		
		System.out.println(veiculo instanceof Veiculo);
		System.out.println(veiculo instanceof VeiculoTerrestre);
		
	}
}