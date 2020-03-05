package etoiles;

import java.util.Scanner;

public class ExoFinal {

	public static void main(String[] args) {

		String p = SaisirCar();
		afficherPhase1(p);

		afficherPhase2(p);


	}		

	static void afficherEtoile(int nb) {
		for(int i = 1;i<=nb;i++){
			System.out.print('*');}
		System.out.println();
	}

	static void afficherPhase1(String phrase) {
		System.out.println(phrase.length());
		afficherEtoile(phrase.length());
		System.out.println(phrase);
		afficherEtoile(phrase.length());
		System.out.println();

	}

	static void afficherPhase2(String phrase) {
		phrase = "* "+phrase+" *";
		afficherPhase1(phrase);

	}


	static String SaisirCar() {
		Scanner sc = new Scanner(System.in);	
		System.out.print("veuillez saisir une phrase svp bg: ");		
		String str = sc.nextLine();
		System.out.println();
		return str;






	}
}

