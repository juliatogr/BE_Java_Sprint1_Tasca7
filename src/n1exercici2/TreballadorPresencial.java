package n1exercici2;

public class TreballadorPresencial extends Treballador {

	private static int benzina;
	
	public TreballadorPresencial(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
	}
	
	public static int getBenzina() {
		return benzina;
	}

	public static void setBenzina(int benzina) {
		TreballadorPresencial.benzina = benzina;
	}

	@Override
	public String toString() {
		return "Treballador Presencial " + getNom() + " " + getCognom() + ", que cobra "
				+ getPreuHora() + "€/h";
	}
	
	@Override
	public void calcularSou(int numHoresMes) {
		int sou = numHoresMes * this.getPreuHora() + benzina;
		System.out.println("El treballador té un sou de " + sou + "€.");
	}
	
	@Deprecated
	public void deprecatedMethodPresencial() {
		System.out.println("you are running a deprecated method deprecatedMethodPresencial() of TreballadorPresencial class");
	}
	
	@Deprecated
	public void deprecatedMethodPresencial2() {
		System.out.println("you are running a deprecated method deprecatedMethodPresencial2() of TreballadorPresencial class");
	}
	
}
