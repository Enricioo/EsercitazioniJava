package EserciziOperatoriLogici;

public class Main {

	public static void main(String[] args) {

		/*
		 * Esercizio 1 
		 * Scrivi un programma Java che verifichi se un numero è compreso
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
		 * Esercizio 2 
		 * Scrivi un programma Java che determini se un anno è bisestile o
		 * meno. Un anno bisestile è divisibile per 4, ma non per 100, a meno che non
		 * sia anche divisibile per 400.
		 */

		int anno = 2020;
		boolean bisestile = (anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0;
		if (bisestile) {
			System.out.println("L'anno è bisestile.");
		} else {
			System.out.println("L'anno non è bisestile.");
		}

		/*
		 * Esercizio 3 
		 * Scrivi un programma Java che verifichi se una stringa è vuota o
		 * null.
		 */

		String testo = "";
		boolean vuota = testo == null || testo.isEmpty();
		if (vuota) {
			System.out.println("La stringa è vuota.");
		} else {
			System.out.println("La stringa non è vuota.");
		}

		/*
		 * Esercizio 4 
		 * Scrivi un programma Java che verifichi se un numero è positivo e
		 * dispari.
		 */

		int numero4 = -3;
		boolean posDis = numero4 > 0 && numero4 % 2 != 0;
		if (posDis) {
			System.out.println("Il numero è positivo e dispari.");
		} else {
			System.out.println("Il numero non è positivo e dispari.");
		}

		/*
		 * Esercizio 5 
		 * Scrivi un programma Java che determini se una persona è
		 * maggiorenne. La persona è maggiorenne se ha almeno 18 anni.
		 */

		int eta = 19;
		boolean maggiorenne = eta >= 18;
		if (maggiorenne) {
			System.out.println("La persona è maggiorenne.");
		} else {
			System.out.println("La persona non è maggiorenne.");
		}

		/*
		 * Esercizio 6 
		 * Scrivi un programma Java che verifichi se un carattere è una
		 * vocale minuscola.
		 */

		char carattere = 'e';
		boolean vocaleMinuscola = carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u';
		if (vocaleMinuscola) {
			System.out.println("La vocale è minuscola.");
		} else {
			System.out.println("La vocale non è minuscola.");
		}

		/*
		 * Esercizio 7 
		 * Scrivi un programma Java che determini se un numero è pari e
		 * divisibile per 3.
		 */

		int numero7 = 18;
		boolean divis = numero7 % 2 == 0 && numero7 % 3 == 0;
		if (divis) {
			System.out.println("Il numero è pari ed è divisible per 3.");
		} else {
			System.out.println("Il numero non è pari o non è divisible per 3.");
		}

		/*
		 * Esercizio 8 
		 * Scrivi un programma Java che verifichi se un numero è negativo o
		 * zero.
		 */

		int numero8 = -10;
		boolean neg0 = numero8 <= 0;
		if (neg0) {
			System.out.println("Il numero è minore o uguale a 0.");
		} else {
			System.out.println("Il numero non è minore o uguale a 0.");
		}

		/*
		 * Esercizio 9 
		 * Scrivi un programma Java che determini se una stringa inizia con
		 * la lettera "A" o con la lettera "B".
		 */
		
		String testo9 = "Ciao";
		boolean AB = testo9.startsWith("A") || testo9.startsWith("B");
		if (AB) {
			System.out.println("Il testo inizia con la A o con la B.");
		} else {
			System.out.println("Il testo non inizia con la A o con la B.");
		}

	}

}
