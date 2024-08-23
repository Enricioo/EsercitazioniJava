package eserciziSwitch;

public class Main {

	public static void main(String[] args) {

		/*
		 * Esercizio 1 Scrivi un programma Java che stampa il nome del giorno della
		 * settimana corrispondente a un numero utilizzando il blocco "switch".
		 */

		int giorno = 5;
		String giornoCorrente;

		switch (giorno) {

		case 1:
			giornoCorrente = "Lunedì";
			break;
		case 2:
			giornoCorrente = "Martedì";
			break;
		case 3:
			giornoCorrente = "Mercoledì";
			break;
		case 4:
			giornoCorrente = "Giovedì";
			break;
		case 5:
			giornoCorrente = "Venerdì";
			break;
		case 6:
			giornoCorrente = "Sabato";
			break;
		case 7:
			giornoCorrente = "Domenica";
			break;
		default:
			giornoCorrente = "Non è un giorno valido.";
			break;
		}

		System.out.println("Il giorno è: " + giornoCorrente);

		/*
		 * Esercizio 2 Scrivi un programma Java che stampa il mese corrispondente a un
		 * numero utilizzando il blocco "switch".
		 */

		int mese = 10;
		String meseCorrente;

		switch (mese) {

		case 1:
			meseCorrente = "Gennaio";
			break;
		case 2:
			meseCorrente = "Febbraio";
			break;
		case 3:
			meseCorrente = "Marzo";
			break;
		case 4:
			meseCorrente = "Aprile";
			break;
		case 5:
			meseCorrente = "Maggio";
			break;
		case 6:
			meseCorrente = "Giugno";
			break;
		case 7:
			meseCorrente = "Luglio";
			break;
		case 8:
			meseCorrente = "Agosto";
			break;
		case 9:
			meseCorrente = "Settembre";
			break;
		case 10:
			meseCorrente = "Ottobre";
			break;
		case 11:
			meseCorrente = "Novembre";
			break;
		case 12:
			meseCorrente = "Dicembre";
			break;
		default:
			meseCorrente = "Non è un mese valido.";
			break;
		}

		System.out.println("Il mese è: " + meseCorrente);

		/*
		 * Esercizio 3 Scrivi un programma Java che calcola il numero di giorni in un
		 * dato mese utilizzando il blocco "switch".
		 */

		int numeroGiorni = 12;

		switch (mese) {
		case 1:
			numeroGiorni = 31;
			break;
		case 2:
			numeroGiorni = 28;
			break;
		case 3:
			numeroGiorni = 31;
			break;
		case 4:
			numeroGiorni = 30;
			break;
		case 5:
			numeroGiorni = 31;
			break;
		case 6:
			numeroGiorni = 30;
			break;
		case 7:
			numeroGiorni = 31;
			break;
		case 8:
			numeroGiorni = 31;
			break;
		case 9:
			numeroGiorni = 30;
			break;
		case 10:
			numeroGiorni = 31;
			break;
		case 11:
			numeroGiorni = 30;
			break;
		case 12:
			numeroGiorni = 31;
			break;
		default:
			numeroGiorni = -1;
		}

		System.out.println("Il mese di " + meseCorrente + " ha " + numeroGiorni + " giorni.");

		/*
		 * Esercizio 4 Scrivi un programma Java che stampa la stagione corrispondente a
		 * un dato mese utilizzando il blocco "switch".
		 */

		String stagione;

		switch (mese) {
		case 12:
		case 1:
		case 2:
			stagione = "Inverno";
			break;
		case 3:
		case 4:
		case 5:
			stagione = "Primavera";
			break;
		case 6:
		case 7:
		case 8:
			stagione = "Estate";
			break;
		case 9:
		case 10:
		case 11:
			stagione = "Autunno";
			break;
		default:
			stagione = "Numero non valido";
		}

		System.out.println("Il mese di " + meseCorrente + " corrisponde alla stagione " + stagione + ".");

		/*
		 * Esercizio 5 Scrivi un programma Java che converte un numero romano in
		 * decimale utilizzando il blocco "switch".
		 */

		String numeroRomano = "C";
		int numeroDecimale;

		switch (numeroRomano) {
		case "I":
			numeroDecimale = 1;
			break;
		case "V":
			numeroDecimale = 5;
			break;
		case "X":
			numeroDecimale = 10;
			break;
		case "L":
			numeroDecimale = 50;
			break;
		case "C":
			numeroDecimale = 100;
			break;
		case "D":
			numeroDecimale = 500;
			break;
		case "M":
			numeroDecimale = 1000;
			break;
		default:
			numeroDecimale = -1;
		}

		System.out.println("Il numero romano " + numeroRomano + " corrisponde al numero" + numeroDecimale + ".");

		/*
		 * Esercizio 6 Scrivi un programma Java che calcola il costo di spedizione in
		 * base al peso di un pacco utilizzando il blocco "switch".
		 */

		double pesoPacco = 2.5;
		double costoSpedizione;

		switch ((int) pesoPacco) {
		case 1:
			costoSpedizione = 5.0;
			break;
		case 2:
			costoSpedizione = 7.5;
			break;
		case 3:
			costoSpedizione = 10.0;
			break;
		case 4:
			costoSpedizione = 12.5;
			break;
		default:
			costoSpedizione = 15.0;
		}

		System.out.println(
				"Il costo di spedizione per un pacco di peso " + pesoPacco + " kg è di " + costoSpedizione + " euro.");

		/*
		 * Esercizio 7 Scrivi un programma Java che stampa il nome di un mese abbreviato
		 * corrispondente a un numero utilizzando il blocco "switch".
		 */

		String nomeMese;

		switch (mese) {
		case 1:
			nomeMese = "Gen";
			break;
		case 2:
			nomeMese = "Feb";
			break;
		case 3:
			nomeMese = "Mar";
			break;
		case 4:
			nomeMese = "Apr";
			break;
		case 5:
			nomeMese = "Mag";
			break;
		case 6:
			nomeMese = "Giu";
			break;
		case 7:
			nomeMese = "Lug";
			break;
		case 8:
			nomeMese = "Ago";
			break;
		case 9:
			nomeMese = "Set";
			break;
		case 10:
			nomeMese = "Ott";
			break;
		case 11:
			nomeMese = "Nov";
			break;
		case 12:
			nomeMese = "Dic";
			break;
		default:
			nomeMese = "Numero non valido";
		}

		System.out.println("Il mese di " + meseCorrente + " corrisponde a " + nomeMese + ".");

	}

}
