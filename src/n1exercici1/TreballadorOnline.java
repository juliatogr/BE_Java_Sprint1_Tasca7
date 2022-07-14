package n1exercici1;

public class TreballadorOnline extends Treballador {
	private final int tarifaPlanaInternet;
	
	public TreballadorOnline(String nom, String cognom, int preuHora, int tarifaPlanaInternet) {
		super(nom, cognom, preuHora);
		this.tarifaPlanaInternet = tarifaPlanaInternet;
	}
	
	public int getTarifaPlanaInternet() {
		return tarifaPlanaInternet;
	}

	@Override
	public String toString() {
		return "Treballador Online " + getNom() + " " + getCognom() + ", que cobra "
				+ getPreuHora() + "€/h, té una tarifa plana d'internet de " + tarifaPlanaInternet + "€/mes";
	}
	
	@Override
	public void calcularSou(int numHoresMes) {
		int sou = numHoresMes * this.getPreuHora() + tarifaPlanaInternet;
		System.out.println("El treballador té un sou de " + sou + "€.");
	}
	
}
