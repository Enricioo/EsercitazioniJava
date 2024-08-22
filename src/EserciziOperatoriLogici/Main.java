package EserciziOperatoriLogici;

public class Main {

	public static void main(String[] args) {

		/*
		 * Esercizio 1 Scrivi un programma Java che verifichi se un numero è compreso
		 * tra 10 e 20 (estremi inclusi). Utilizza gli operatori logici.
		 */

		int numero = 15;
		boolean compreso = numero >= 10 && numero <= 20;
		if (compreso) {
			System.out.println("Il numero è compreso tra 10 e 20.");
		} else {
			System.out.println("Il numero non è compreso tra 10 e 20.");
		}

		/*
		 * Esercizio 2 Scrivi un programma Java che determini se un anno è bisestile o
		 * meno. Un anno bisestile è divisibile per 4, ma non per 100, a meno che non
		 * sia anche divisibile per 400.
		 */

		int anno = 2020;
		boolean bisestile = (anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0;
		System.out.println("L'anno " + anno + " è bisestile? " + bisestile);

	}

}
