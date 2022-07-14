package n1exercici2;

public class N1_E2_main {

	@SuppressWarnings("deprecation")		//Eliminem els warnings causats pels mètodes obsolets
	
	public static void main(String[] args){
		
		//main per demostrar l'ús de l'anotació @Override en el mètode calcularSou();
		
		//Creem diferents treballadors, presencials, online o sense classificar.
		
		Treballador t = new Treballador("Júlia", "Tortosa", 15);						// Sense classificar
		TreballadorOnline to = new TreballadorOnline("Rubén", "Pacheco", 15, 15);		// Online
		TreballadorPresencial tp = new TreballadorPresencial("Joan", "Serrano", 15);	//Presencial
		
		// S'ha d'assignar un valor a la benzina dels treballadors presencials per poder fer le càlcul del seu sou
		TreballadorPresencial.setBenzina(10);			
		
		to.deprecatedMethodOnline();
		to.deprecatedMethodOnline2();
		tp.deprecatedMethodPresencial();
		tp.deprecatedMethodPresencial2();
	}

}
