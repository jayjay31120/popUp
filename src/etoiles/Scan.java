package etoiles;

import java.util.Scanner;

public class Scan {
	
	static Scanner scanner;
	
	
	
	
	public static void openScanner() {
		 scanner = new Scanner(System.in);
	}
	public static int saisir() {
		boolean ok = false;
		 int val=0;
		do {
			try {
				System.out.println("entrez une entier :");
				 val = scanner.nextInt();
				 scanner.nextLine();
				 ok = true;
			}catch(Exception e) {
				System.err.println("erreur");
				scanner.nextLine();
			}
		}while(ok==false);
		
		return val;
	}
	
	public static int saisir(int diff) {
		
		boolean ok = false;
		 int val=0;
		do {
			try {
				affichage("entrez une entier :");
				 val = scanner.nextInt();
				 scanner.nextLine();
				 if(val != diff) {
					 ok = true;
				 }else {
					 afficheErreur("la valeur doit �tre diff�rente de : " + diff);
					 scanner.nextLine();
				 }
			}catch(Exception e) {
				afficheErreur("erreur");
				scanner.nextLine();
			}
		}while(ok==false);
		
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

}
