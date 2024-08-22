package EserciziComparazione;

public class Main {

	public static void main(String[] args) {

		/*
		 * Esercizio 1 Scrivi un programma Java che determini se un numero intero è
		 * positivo.
		 */

		int numero1 = 50;
		boolean positivo = numero1 > 0;
		System.out.print("Il numero è: ");
		if (positivo) {
			System.out.println("positivo");
		} else {
			System.out.println("negativo");
		}

		/*
		 * Esercizio 2 Scrivi un programma Java che verifichi se un numero intero è
		 * pari.
		 */

		int numero2 = 10;
		boolean pari = numero2 % 2 == 0;
		System.out.print("Il numero è: ");
		if (pari) {
			System.out.println("pari");
		} else {
			System.out.println("dispari");
		}

		/*
		 * Esercizio 3 Scrivi un programma Java che confronti due stringhe e determini
		 * se sono uguali
		 */

		String a = "Catullo";
		String b = "Catulli";
		boolean uguali = a.equals(b);
		System.out.print("Le stringhe sono: ");
		if (uguali) {
			System.out.println("uguali");
		} else {
			System.out.println("non uguali");
		}

		/*
		 * Esercizio 4 Scrivi un programma Java che confronti due numeri interi e
		 * determini se sono diversi.
		 */

		int intero1 = 5;
		int intero2 = 5;
		boolean uguali2 = intero1 == intero2;
		System.out.print("I numeri sono: ");
		if (uguali2) {
			System.out.println("diversi");
		} else {
			System.out.println("uguali");
		}

		/*
		 * Esercizio 5 Scrivi un programma Java che verifichi se una stringa è vuota.
		 */

		String c = "c";
		boolean vuota = c.isBlank();
		System.out.print("La stringa ");
		if (vuota) {
			System.out.println("è vuota");
		} else {
			System.out.println("contiene qualcosa");
		}

		/*
		 * Esercizio 6 Scrivi un programma Java che confronti due numeri interi e
		 * determini se il primo numero è maggiore del secondo.
		 */

		int num1 = 54;
		int num2 = 124;
		boolean maggiore = num1 > num2;
		System.out.print("Il primo numero è: ");
		if (maggiore) {
			System.out.println("maggiore del secondo");
		} else {
			System.out.println("minore del secondo");
		}

		/*
		 * Esercizio 7 Scrivi un programma Java che confronti due numeri interi e
		 * determini se il primo numero è minore o uguale al secondo.
		 */

		int numb1 = 21;
		int numb2 = 21;
		boolean minug = numb1 <= numb2;
		System.out.println("Il primo numero è minore o uguale al secondo? " + minug);

		/*
		 * Esercizio 8 Scrivi un programma Java che confronti due stringhe e determini
		 * se la prima stringa è più lunga della seconda.
		 */

		String stringa1 = "ciaooo";
		String stringa2 = "hello";
		boolean lunghezza = stringa1.length() > stringa2.length();
		System.out.println("La prima stringa è più lunga della seconda? " + lunghezza);

		/*
		 * Esercizio 9 Scrivi un programma Java che verifichi se un numero intero è
		 * compreso tra due valori specifici.
		 */
		
		int numero = 7;
		int limiteInferiore = 10;
		int limiteSuperiore = 20;
		boolean compreso = numero > limiteInferiore && numero < limiteSuperiore;
		System.out.println("Il numero è compreso tra " + limiteInferiore + " e " + limiteSuperiore + "? " + compreso);

		/*
		 * Esercizio 10 Scrivi un programma Java che confronti due caratteri e determini
		 * se sono uguali.
		 */

		char carattere1 = 'a';
		char carattere2 = 'a';
		boolean uguali3 = carattere1 == carattere2;
		System.out.println("I caratteri sono uguali? " + uguali3);
		
	}

}
