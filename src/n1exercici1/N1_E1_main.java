package n1exercici1;

public class N1_E1_main {

	public static void main(String[] args){
		
		//main per demostrar l'�s de l'anotaci� @Override en el m�tode calcularSou();
		
		//Creem diferents treballadors, presencials, online o sense classificar.
		
		Treballador t = new Treballador("J�lia", "Tortosa", 15);						// Sense classificar
		TreballadorOnline to = new TreballadorOnline("Rub�n", "Pacheco", 15, 15);		// Online
		TreballadorPresencial tp = new TreballadorPresencial("Joan", "Serrano", 15);	//Presencial
		
		// S'ha d'assignar un valor a la benzina dels treballadors presencials per poder fer le c�lcul del seu sou
		TreballadorPresencial.setBenzina(10);			
		
		// Imprimim els diferents treballadors i cridem al seu calcularSou
		System.out.println(t);
		t.calcularSou(100);			// preuHora * numHoresMes = 15 * 100 = 1500�/mes
		System.out.println();
		
		System.out.println(to);		
		to.calcularSou(100);		// preuHora * numHoresMes + tarifaPlanaInternet = 15 * 100 + 15 = 1515�/mes
		System.out.println();
		
		System.out.println(tp);
		tp.calcularSou(100);		// preuHora * numHoresMes + benzina = 15 * 100 + 10 = 1510�/mes
		
		// Veiem que definint els 3 treballadors amb el mateix preu hora, el sou mensual canvia segons la benzina 
		// i la tarifa plana d'Internet. Aix� �s degut a que amb l'anotaci� @Override el programa crida al m�tode
		// calcularSou() de la classe de l'objecte corresponent, substituint la definici� de la classe mare.
	}

}
