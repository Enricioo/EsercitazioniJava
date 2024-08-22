package EserciziCasting;

public class Main {

	public static void main(String[] args) {

		/*
		 * Esercizio 1 
		 * Scrivi un programma Java che dichiara una variabile di tipo
		 * intero chiamata "numero" e una variabile di tipo double chiamata
		 * "numeroDecimale". Esegui un cast della variabile "numero" in double e assegna
		 * il valore risultante alla variabile "numeroDecimale". Stampa il valore della
		 * variabile "numeroDecimale".
		 */

		int numero1 = 20;
		double numeroDecimale1 = (int) numero1;
		System.out.println("Il valore è di: " + numeroDecimale1);

		/*
		 * Esercizio 2 
		 * Scrivi un programma Java che dichiara una variabile di tipo
		 * double chiamata "numeroDecimale" e una variabile di tipo int chiamata
		 * "numeroIntero". Esegui un cast della variabile "numeroDecimale" in int e
		 * assegna il valore risultante alla variabile "numeroIntero". Stampa il valore
		 * della variabile "numeroIntero".
		 */

		double numeroDecimale2 = 32.5;
		int numeroIntero2 = (int) numeroDecimale2;
		System.out.println("Il valore è di: " + numeroIntero2);

		/*
		 * Esercizio 3 
		 * Scrivi un programma Java che dichiara una variabile di tipo int
		 * chiamata "numeroIntero" e una variabile di tipo String chiamata
		 * "numeroStringa". Esegui un cast della variabile "numeroIntero" in String e
		 * assegna il valore risultante alla variabile "numeroStringa". Stampa il valore
		 * della variabile "numeroStringa".
		 */

		int numeroIntero3 = 65;
		String numeroStringa3 = String.valueOf(numeroIntero3);
		System.out.println("Il valore è di: " + numeroStringa3);

		/*
		 * Esercizio 4 
		 * Scrivi un programma Java che dichiara una variabile di tipo
		 * String chiamata "numeroStringa" e una variabile di tipo int chiamata
		 * "numeroIntero". Esegui un cast della variabile "numeroStringa" in int e
		 * assegna il valore risultante alla variabile "numeroIntero". Stampa il valore
		 * della variabile "numeroIntero".
		 */

		String numeroStringa4 = "22";
		int numeroIntero4 = Integer.parseInt(numeroStringa4);
		System.out.println("Il valore è di: " + numeroIntero4);

		/*
		 * Esercizio 5 
		 * Scrivi un programma Java che dichiara una variabile di tipo
		 * double chiamata "numeroDecimale" e una variabile di tipo int chiamata
		 * "numeroIntero". Esegui un cast della variabile "numeroDecimale" in int e
		 * assegna il valore risultante alla variabile "numeroIntero". Stampa il valore
		 * della variabile "numeroIntero".
		 */

		double numeroDecimale5 = 88.33;
		int numeroIntero5 = (int) numeroDecimale5;
		System.out.println("Il valore è di: " + numeroIntero5);

		/*
		 * Esercizio 6 
		 * Scrivi un programma Java che dichiara una variabile di tipo long
		 * chiamata "numeroLungo" e una variabile di tipo int chiamata "numeroIntero".
		 * Esegui un cast della variabile "numeroLungo" in int e assegna il valore
		 * risultante alla variabile "numeroIntero". Stampa il valore della variabile
		 * "numeroIntero".
		 */

		long numeroLungo6 = 533654;
		int numeroIntero6 = (int) numeroLungo6;
		System.out.println("Il valore è di: " + numeroIntero6);

		/*
		 * Esercizio 7 
		 * Scrivi un programma Java che dichiara una variabile di tipo float
		 * chiamata "numeroVirgola" e una variabile di tipo double chiamata
		 * "numeroDecimale". Esegui un cast della variabile "numeroVirgola" in double e
		 * assegna il valore risultante alla variabile "numeroDecimale". Stampa il
		 * valore della variabile "numeroDecimale".
		 */

		float numeroVirgola7 = 80.5f;
		double numeroDecimale7 = (double) numeroVirgola7;
		System.out.println("Il valore è di: " + numeroDecimale7);

		/*
		 * Esercizio 8 
		 * Scrivi un programma Java che dichiara una variabile di tipo byte
		 * chiamata "numeroPiccolo" e una variabile di tipo int chiamata "numeroGrande".
		 * Esegui un cast della variabile "numeroPiccolo" in int e assegna il valore
		 * risultante alla variabile "numeroGrande". Stampa il valore della variabile
		 * "numeroGrande".
		 */

		byte numeroPiccolo8 = 45;
		int numeroGrande8 = (int) numeroPiccolo8;
		System.out.println("Il valore è di: " + numeroGrande8);

		/*
		 * Esercizio 9 
		 * Scrivi un programma Java che dichiara una variabile di tipo
		 * double chiamata "numeroDecimale" e una variabile di tipo String chiamata
		 * "numeroStringa". Esegui un cast della variabile "numeroStringa" in double e
		 * assegna il valore risultante alla variabile "numeroDecimale". Stampa il
		 * valore della variabile "numeroDecimale".
		 */

		String numeroStringa9 = "93.26";
		double numeroDecimale9 = Double.parseDouble(numeroStringa9);
		System.out.println("Il valore è di: " + numeroDecimale9);

	}

}
