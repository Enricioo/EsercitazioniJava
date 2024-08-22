package EserciziNumeri;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		/*
		 * Esercizio 1 
		 * Scrivi un programma Java che calcola la somma di due numeri
		 * interi e stampa il risultato.
		 */

		int numero1 = 30;
		int numero2 = 50;
		int somma1 = numero1 + numero2;
		System.out.println("La somma è di: " + somma1);

		/*
		 * Esercizio 2 
		 * Scrivi un programma Java che calcola la differenza tra due numeri
		 * decimali e stampa il risultato.
		 */

		double prezzo1 = 25.35;
		double prezzo2 = 17.99;
		double differenza1 = prezzo1 - prezzo2;
		System.out.println("La differenza è di: " + differenza1);

		/*
		 * Esercizio 3 
		 * Scrivi un programma Java che calcola il prodotto di tre numeri
		 * interi e stampa il risultato.
		 */

		int numeroIntero1 = 63;
		int numeroIntero2 = 30;
		int numeroIntero3 = 2;
		int prodotto1 = numeroIntero1 * numeroIntero2 * numeroIntero3;
		System.out.println("Il prodotto è di: " + prodotto1);

		/*
		 * Esercizio 4 
		 * Scrivi un programma Java che calcola il quoziente tra due numeri
		 * decimali e stampa il risultato.
		 */

		double numeroDecimale1 = 40.5;
		double numeroDecimale2 = 20.25;
		double quoziente = numeroDecimale1 / numeroDecimale2;
		System.out.println("Il quoziente è di: " + quoziente);

		/*
		 * Esercizio 5 
		 * Scrivi un programma Java che calcola il modulo di un numero
		 * intero e stampa il risultato.
		 */

		int numeroInt = 52;
		int modulo = numeroInt % 2;
		System.out.println("Il modulo è di: " + modulo);

		/*
		 * Esercizio 6 
		 * Scrivi un programma Java che calcola la potenza di un numero
		 * intero e stampa il risultato.
		 */

		int base = 5;
		int esponente = 3;
		int potenza2 = 1;
		int potenza = (int) Math.pow(base, esponente);

		for (int i = 0; i < 3; i++) {
			potenza2 *= base;
			System.out.println("La potenza è di: " + potenza2);
		}

		System.out.println("La potenza è di: " + potenza);

		/*
		 * Esercizio 7 
		 * Scrivi un programma Java che calcola la radice quadrata di un
		 * numero decimale e stampa il risultato.
		 */

		double radice = 100.0;
		radice = Math.sqrt(radice);
		System.out.println("La radice è di: " + radice);

		/*
		 * Esercizio 8 
		 * Scrivi un programma Java che trova il valore massimo tra due
		 * numeri interi e stampa il risultato.
		 */

		int numeroInt1 = 50;
		int numeroInt2 = 439;
		int numeroMaggiore1 = 0;

		if (numeroInt1 > numeroInt2) {
			numeroMaggiore1 = numeroInt1;
		} else {
			numeroMaggiore1 = numeroInt2;
		}

		System.out.println("Il numero maggiore è: " + numeroMaggiore1);

		int numeroInt3 = 3413;
		int numeroInt4 = 314;
		int numeroMaggiore2 = Math.max(numeroInt3, numeroInt4);

		System.out.println("Il numero maggiore è: " + numeroMaggiore2);

		/*
		 * Esercizio 9 
		 * Scrivi un programma Java che trova il valore minimo tra tre
		 * numeri decimali e stampa il risultato.
		 */

		int numeroInt5 = 1253;
		int numeroInt6 = 13;
		int numeroMinimo1 = 0;

		if (numeroInt5 > numeroInt6) {
			numeroMinimo1 = numeroInt6;
		} else {
			numeroMinimo1 = numeroInt5;
		}

		System.out.println("Il numero minimo è: " + numeroMinimo1);

		int numeroInt7 = 564;
		int numeroInt8 = 213;
		int numeroMinimo2 = Math.min(numeroInt7, numeroInt8);

		System.out.println("Il numero minimo è: " + numeroMinimo2);

		/*
		 * Esercizio 10 
		 * Scrivi un programma Java che genera un numero casuale compreso
		 * tra 1 e 100 e stampa il risultato.
		 */

		Random r = new Random();
		int numeroRandom = r.nextInt((100) + 1);		
		System.out.println("Il numero generato è: " + numeroRandom);
		
		int numeroCasuale = (int) (Math.random() * 100) + 1;
        System.out.println("Il numero generato è: " + numeroCasuale);
		
	}

}
