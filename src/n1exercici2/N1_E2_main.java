package n1exercici2;

public class N1_E2_main {

	@SuppressWarnings("deprecation")		//Eliminem els warnings causats pels m�todes obsolets
	
	public static void main(String[] args){
		
		//main per demostrar l'�s de l'anotaci� @Override en el m�tode calcularSou();
		
		//Creem diferents treballadors, presencials, online o sense classificar.
		
		Treballador t = new Treballador("J�lia", "Tortosa", 15);						// Sense classificar
		TreballadorOnline to = new TreballadorOnline("Rub�n", "Pacheco", 15, 15);		// Online
		TreballadorPresencial tp = new TreballadorPresencial("Joan", "Serrano", 15);	//Presencial
		
		// S'ha d'assignar un valor a la benzina dels treballadors presencials per poder fer le c�lcul del seu sou
		TreballadorPresencial.setBenzina(10);			
		
		to.deprecatedMethodOnline();
		to.deprecatedMethodOnline2();
		tp.deprecatedMethodPresencial();
		tp.deprecatedMethodPresencial2();
	}

}
