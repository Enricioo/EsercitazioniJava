package eserciziFor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Esercizio 1 Stampare i numeri da 1 a 10 utilizzando un ciclo "for":
		 */

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
		}

		System.out.println();
		/*
		 * Esercizio 2 Calcolare la somma dei numeri da 1 a 50 utilizzando un ciclo
		 * "for":
		 */

		int somma = 0;
		for (int i = 0; i < 50; i++) {
			somma += i;
			System.out.print(somma + " ");
		}

		System.out.println();
		/*
		 * Esercizio 3 Stampare i numeri pari da 1 a 20 utilizzando un ciclo "for":
		 */

		for (int i = 0; i <= 20; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println();

		/*
		 * Esercizio 4 Calcolare il prodotto dei numeri dispari da 1 a 15 utilizzando un
		 * ciclo "for":
		 */

		int prodotto = 1;
		for (int i = 1; i <= 15; i += 2) {
			prodotto *= i;
		}
		System.out.println("Il prodotto dei numeri dispari da 1 a 15 è: " + prodotto);

		/*
		 * Esercizio 5 Stampare la tabellina del 5 utilizzando un ciclo "for":
		 */

		int numero = 5;
		for (int i = 1; i <= 10; i++) {
			int risultato = numero * i;
			System.out.println(numero + " x " + i + " = " + risultato);
		}

		/*
		 * Esercizio 6 Stampare i caratteri di una stringa uno alla volta utilizzando un
		 * ciclo "for":
		 */

		String testo = "Ciao!";
		for (int i = 0; i < testo.length(); i++) {
			char carattere = testo.charAt(i);
			System.out.println(carattere);
		}

		/*
		 * Esercizio 7 Calcolare il fattoriale di un numero utilizzando un ciclo "for":
		 */

		int num = 6;
		int fattoriale = 1;
		for (int i = 1; i <= num; i++) {
			fattoriale *= i;
		}
		System.out.println("Il fattoriale di " + num + " è: " + fattoriale);

		/*
		 * Esercizio 8 Stampare i numeri in ordine decrescente da 10 a 1 utilizzando un
		 * ciclo "for":
		 */

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		/*
		 * Esercizio 9 Stampare i quadrati dei numeri da 1 a 10 utilizzando un ciclo
		 * "for":
		 */

		for (int i = 1; i <= 10; i++) {
			int quadrato = i * i;
			System.out.println("Il quadrato di " + i + " è: " + quadrato);
		}

		/*
		 * Esercizio 10 Stampare una sequenza di numeri in base all'input dell'utente
		 * utilizzando un ciclo "for":
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int numScan = scanner.nextInt();
		System.out.println("Sequenza di numeri da 1 a " + numScan + ":");
		for (int i = 1; i <= numScan; i++) {
			System.out.println(i);
		}

	}

}
