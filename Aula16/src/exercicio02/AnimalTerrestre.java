package exercicio02;

public class AnimalTerrestre extends Animal {
	private boolean consegueNadar;
	
	public AnimalTerrestre(String nome, int numeroPatas, boolean consegueNadar) {
		super(nome, numeroPatas);
		this.consegueNadar = consegueNadar;
	}

	public boolean isConsegueNadar() {
		return consegueNadar;
	}

	public void setConsegueNadar(boolean consegueNadar) {
		this.consegueNadar = consegueNadar;
	}
}