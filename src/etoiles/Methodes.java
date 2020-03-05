package etoiles;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.awt.Color;
public class Methodes {

	static Scanner scanner;

	public static void openScanner() {
		scanner = new Scanner(System.in);
	}

	public static int saisir() {
		boolean ok = false;
		int val = 0;
		do {
			try {
				System.out.println("entrez une entier :");
				val = scanner.nextInt();
				scanner.nextLine();
				ok = true;
			} catch (Exception e) {
				System.err.println("erreur");
				scanner.nextLine();
			}
		} while (ok == false);

		return val;
	}

	public static int saisir(int diff) {

		boolean ok = false;
		int val = 0;
		do {
			try {
				affichage("entrez une entier :");
				val = scanner.nextInt();
				scanner.nextLine();
				if (val != diff) {
				} else {
					afficheErreur("la valeur doit �tre diff�rente de : " + diff);
					scanner.nextLine();
				}
			} catch (Exception e) {
				afficheErreur("erreur");
				scanner.nextLine();
			}
		} while (ok == false);

		return val;
	}

	public static void closeScanner() {
		scanner.close();
	}

	public static void affichage(String var) {
		System.out.println(var);
	}

	public static void afficheErreur(String var) {
		System.err.println(var);
	}

	public static void affichage(double var) {
		System.out.println(var);
	}

	public static void triangle(int f) {

		int i = 0;

		for (i = 0; i <= f + 1; i++) {
			if (i < (f / 2)) {
				// System.out.println("*".repeat(i+1));
				System.out.println(String.join("", Collections.nCopies(i + 1, "*")));
			}

			if (i > (f / 2)) {
				System.out.println(String.join("", Collections.nCopies(f - i + 1, "*")));
				// System.out.println("*".repeat(f-i+1));
			}

			//
			// for (i=0; i<f; i++) {
			// System.out.println(String.join("", Collections.nCopies(i+1, "*")));
			//
			//
			// }
			//
			// for (i=0; i<f; i++) {
			// System.out.println(String.join("", Collections.nCopies(f-i, "*")));
			//
			// }
			//
			//
			// }
			// else {
			//
			// for (i=0; i<f; i++) {
			// System.out.println(String.join("", Collections.nCopies(i+1, "*")));
			//
			//
			// }
			//
			// for (i=0; i<f; i++) {
			// System.out.println(String.join("", Collections.nCopies(f-i-1, "*")));
			//
			// }
			// }
		}
	}

	public static void afficherTab() {
		int VIDE = -1;
		int monTableau[] = { 5, 8, 7, 2, 14, 23, VIDE, VIDE };

		for (int i = 0; i < monTableau.length; i++) {
			System.out.print(monTableau[i] + " ");

		}
		System.out.println();
		System.out.println();
	}

	public static void tableauInv() {
		int VIDE = -1;
		int monTableau[] = { 5, 8, 7, 2, 14, 23, VIDE, VIDE };
		int monTableauInv[] = new int[8];
		int j = monTableau.length - 1;
		for (int i = 0; i < monTableau.length; i++) {
			monTableauInv[i] = monTableau[j];

			System.out.println((monTableau[i] + "  " + monTableauInv[i]));
			j--;

		}

		System.out.println();

	}

	public static void afficherTabInv() {
		int VIDE = -1;
		int monTableau[] = { 5, 8, 7, 2, 14, 23, VIDE, VIDE };
		int monTableauInv[] = new int[8];
		int j = monTableau.length - 1;
		for (int i = 0; i < monTableau.length; i++) {
			monTableauInv[i] = monTableau[j];

			System.out.print(monTableauInv[i] + " ");
			j--;

		}

		System.out.println();

	}

	public static void calculTableau() {
		int VIDE = -1;
		int monTableau[] = { 5, 8, 7, 2, 14, 23, VIDE, VIDE };
		int sum = 0;
		int i = 0;
		for (i = 0; i < monTableau.length; i++) {

			sum = sum + monTableau[i];
		}
		System.out.println();
		System.out.println(sum);

	}

	public static void ajouter() {
		int VIDE = -1;
		int monTableau[] = { 5, 8, 7, 2, 14, 23, VIDE, VIDE };
		openScanner();
		int n = saisir();
		closeScanner();

		for (int i = 0; i < monTableau.length; i++) {

			if (monTableau[i] == VIDE) {

				monTableau[i] = n;
				;

			}
			System.out.print(monTableau[i]);
		}

	}

	public static void remplacer() {

		int VIDE = -1;
		int monTableau[] = { 5, 8, 7, 2, 14, 23, VIDE, VIDE };
		openScanner();
		int n = saisir();

		for (int i = 0; i < monTableau.length; i++) {

			if (monTableau[i] == VIDE) {

				monTableau[i] = n;
				break;

			}

		}
		System.out.print(Arrays.toString(monTableau));
		System.out.println();
		int monTableauInv1[] = new int[8];
		monTableauInv1 = monTableau;
		openScanner();
		int z = saisir();
		closeScanner();

		for (int i = 0; i < monTableauInv1.length; i++) {

			monTableauInv1[z] = VIDE;

		}
		System.out.print(Arrays.toString(monTableauInv1));
	}

	public static String sasirnom() {
		boolean ok = false;
		String val = "";
		do {
			try {
				System.out.println("Merci d'indiquer votre nom :");
				val = scanner.nextLine();
				scanner.nextLine();
				if (val.length() < 21 && val.length()>0){
					ok = true;
				} else {
					System.out.println("erreur ->saisir moins de 21 caract�res");
				}
			} catch (Exception e) {
				System.err.println("erreur2");
				scanner.nextLine();
			}
		} while (ok == false);

		return val;
	}

	public static String saisirprenom() {
		boolean ok = false;
		String val = "";
		do {
			try {
				System.out.println("Merci d'indiquer votre prenom :");
				val = scanner.nextLine();
				scanner.nextLine();
				if (val.length() < 16 && val.length()>0) {
					ok = true;
				} else {
					System.out.println("erreur ->saisir moins de 16 caract�res");
				}
			} catch (Exception e) {
				System.err.println("erreur2");
				scanner.nextLine();
			}
		} while (ok == false);

		return val;
		
	}

	public static int saisirAge() {
		boolean ok = false;
		int val = 0;
		do {
			try {
				System.out.println("entrez votre age :");
				val = scanner.nextInt();
				scanner.nextLine();
				if (val<121) {
				
				ok = true;}
				else {
				System.out.println("erreur1");	
					
				}
			} catch (Exception e) {
				System.err.println("erreur2");
				scanner.nextLine();
			}
		} while (ok == false);

		return val;
	}

	public static String saisirTaille() {
		boolean ok = false;
		DecimalFormat df = new DecimalFormat("#.#");
		double val = 0;
		do {
			try {
				System.out.println("entrez votre taille avec une virgule :</b>");
				val = scanner.nextDouble();
				scanner.nextLine();
				if (val<=2.1 && val >=1.0) {
				
				ok = true;}
				else {
				System.out.println("avec une virgule!!!!");	
					
				}
			} catch (Exception e) {
				System.err.println("erreur2");
				scanner.nextLine();
			}
		} while (ok == false);

		return df.format(val);
	
	}

}
