package n1exercici1;

public class N1_E1_main {

	public static void main(String[] args){
		
		//main per demostrar l'ús de l'anotació @Override en el mètode calcularSou();
		
		//Creem diferents treballadors, presencials, online o sense classificar.
		
		Treballador t = new Treballador("Júlia", "Tortosa", 15);						// Sense classificar
		TreballadorOnline to = new TreballadorOnline("Rubén", "Pacheco", 15, 15);		// Online
		TreballadorPresencial tp = new TreballadorPresencial("Joan", "Serrano", 15);	//Presencial
		
		// S'ha d'assignar un valor a la benzina dels treballadors presencials per poder fer le càlcul del seu sou
		TreballadorPresencial.setBenzina(10);			
		
		// Imprimim els diferents treballadors i cridem al seu calcularSou
		System.out.println(t);
		t.calcularSou(100);			// preuHora * numHoresMes = 15 * 100 = 1500€/mes
		System.out.println();
		
		System.out.println(to);		
		to.calcularSou(100);		// preuHora * numHoresMes + tarifaPlanaInternet = 15 * 100 + 15 = 1515€/mes
		System.out.println();
		
		System.out.println(tp);
		tp.calcularSou(100);		// preuHora * numHoresMes + benzina = 15 * 100 + 10 = 1510€/mes
		
		// Veiem que definint els 3 treballadors amb el mateix preu hora, el sou mensual canvia segons la benzina 
		// i la tarifa plana d'Internet. Això és degut a que amb l'anotació @Override el programa crida al mètode
		// calcularSou() de la classe de l'objecte corresponent, substituint la definició de la classe mare.
	}

}
