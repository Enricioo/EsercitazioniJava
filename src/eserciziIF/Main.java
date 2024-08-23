package eserciziIF;

public class Main {

	public static void main(String[] args) {

		/*
		 * Esercizio 1 Scrivi un programma Java che verifica se un numero intero è
		 * positivo, negativo o zero.
		 */

		int num1 = 5;

		if (num1 > 0) {
			System.out.println("Il numero è positivo.");
		} else if (num1 < 0) {
			System.out.println("Il numero è negativo.");
		} else {
			System.out.println("Il numero è 0.");
		}

		/*
		 * Esercizio 2 Scrivi un programma Java che verifica se un numero è pari o
		 * dispari.
		 */

		int num2 = 11;

		if (num2 % 2 == 0) {
			System.out.println("Il numero è pari.");
		} else {
			System.out.println("Il numero è dispari.");
		}

		/*
		 * Esercizio 3 Scrivi un programma Java che verifica se un carattere è una
		 * lettera maiuscola o una lettera minuscola.
		 */

		char carattere = 'a';
		if (Character.isUpperCase(carattere)) {
			System.out.println("Il carattere è una lettera maiuscola.");
		} else if (Character.isLowerCase(carattere)) {
			System.out.println("Il carattere è una lettera minuscola.");
		} else {
			System.out.println("Il carattere non è una lettera.");
		}

		/*
		 * Esercizio 4 Scrivi un programma Java che verifica se un anno è bisestile.
		 */

		int anno = 2024;
		if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
			System.out.println("L'anno è bisestile.");
		} else {
			System.out.println("L'anno non è bisestile.");
		}

		/*
		 * Esercizio 5 Scrivi un programma Java che verifica se un numero è positivo e
		 * pari.
		 */

		int num5 = 14;
		if (num5 > 0 && num5 % 2 == 0) {
			System.out.println("Il numero è positivo e pari.");
		} else {
			System.out.println("Il numero non è positivo e pari.");
		}

		/*
		 * Esercizio 6 Scrivi un programma Java che verifica se una stringa è vuota o
		 * null.
		 */

		String string = "";
		if (string == null || string.isEmpty()) {
			System.out.println("La stringa è vuota o null.");
		} else {
			System.out.println("La stringa non è vuota o null.");
		}

		/*
		 * Esercizio 7 Scrivi un programma Java che verifica se un numero è compreso tra
		 * due valori.
		 */

		int num7 = 5;
		int min = 5;
		int max = 50;
		if (num7 >= min && num7 <= max) {
			System.out.println("Il numero è compreso tra " + min + " e " + max + ".");
		} else {
			System.out.println("Il numero non è compreso tra " + min + " e " + max + ".");
		}

		/*
		 * Esercizio 8 Scrivi un programma Java che verifica se un carattere è una
		 * vocale o una consonante.
		 */

		char carattere2 = 'a';
		if (carattere2 == 'a' || carattere2 == 'e' || carattere2 == 'i' || carattere2 == 'o' || carattere2 == 'u') {
			System.out.println("Il carattere è una vocale.");
		} else {
			System.out.println("Il carattere è una consonante.");
		}

		/*
		 * Esercizio 9 Scrivi un programma Java che verifica se una persona è
		 * maggiorenne o minorenne in base all'età.
		 */

		int eta = 18;
		if (eta >= 18) {
			System.out.println("La persona è maggiorenne.");
		} else {
			System.out.println("La persona è minorenne.");
		}

		/*
		 * Esercizio 10 Scrivi un programma Java che calcola il prezzo scontato di un
		 * prodotto in base all'importo e al tasso di sconto.
		 */
		
		double prezzo = 150.0;
		double sconto = 0.5;
		double prezzoScontato = prezzo - (prezzo * sconto);
		System.out.println("Il prezzo scontato è: " + prezzoScontato);

	}

}
