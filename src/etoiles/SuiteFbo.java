package etoiles;

import java.text.DecimalFormat;
import java.util.Scanner;


public class SuiteFbo {

	public static void main(String[] args) {



		int n = Saisir();
		remplirTab(n);
		remplirTabDIV(n);
	}
		static double Division(int n) {
			double a = (double) Calcul(n-10);
			double b = (double) Calcul(n-9);

			double z = (b/a);

			 DecimalFormat df = new DecimalFormat("0.00000000"); // import java.text.DecimalFormat;
		        System.out.println(df.format(z));
			
			return z;

		}



		static int Calcul(int n) {
			int Um_2 = 0;
			int Um_1 = 1;
			int m = 2;
			int Um = 0;
			if (n>=2){

				while (m<=n) {
					m++;
					Um = Um_1 + Um_2;
					Um_2 = Um_1;
					Um_1 = Um;

				}

			}	

			return Um;
		}

		static int Saisir() {
			Scanner sc = new Scanner(System.in);
			System.out.println("donne la valeur de n, n>=13");

			int str = 0;
			boolean ok = false;

			do{
				try{
					str = sc.nextInt();
					sc.nextLine();
					if(str>=2){
						ok=true;   
					}

				}


				catch(Exception e ){
					sc.nextLine();
					System.out.print("Erreur");

				}
			}while(ok==false);
			sc.close();
			return str;
		}

		static void afficher(int n) {
			System.out.println(n);
		}


		static void remplirTab(int n) {
			int tab[] = new int[10];
			for( int i = 0 ; i!=  10 ; i++ ) 
			{ 
				tab[i] = Calcul(n-9+i); 
				System.out.println(tab[i]);	
			}
			System.out.println();

		}
		static void remplirTabDIV(int n) {
			int tab[] = new int[10];
			for( int i = 0 ; i!=  10 ; i++ ) 
			{ 
				tab[i] = (int) Division(n-1+i); 
			}
			System.out.println();

		}
	} 