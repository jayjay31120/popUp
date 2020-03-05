package etoiles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CorrestionFibo2 {
int z;
	
	public static void main(String[] args) {
		int n = saisir();
//		int f = fibo(n); /* je declare f et lui affecte la valeur renvoy�e par la methode fibo */
//		affichage(f);
		int []fib =new int [n];
		double []result = new double [n];
		int i;
		for (i=2;i<n;i++) {
			fib[i]=fibo(i);
			if (i>=4) {
				result[i]=(double)fib[i-1]/(double)fib[i-2];
			}
		}
		double r;
		DecimalFormat df = new DecimalFormat("0.00000000");
for (i=n-9;i<n;i++) {
	r = (double)Math.round(result[i] * 100000000) / 100000000;
	System.out.println(fib[i] +"   " + r + "   ");
	
	//System.out.println(fib[i] +"," + df.format(result[i]));
}
	}

	public static int fibo(int n) {

		int Um_2 = 0;
		int Um_1 = 1;
		int m = 2;
		int Um = 0;

		while (m <= n) {
			Um = Um_1 + Um_2;
			Um_2 = Um_1;
			Um_1 = Um;
			m = m + 1;

		}
		return Um;

	}

	public static void affichage(int x) {
		System.out.println("Le terme Un de la suite de fibonacci est : " + x);
	}

	public static int saisir() {
		Scanner saisieUtilisateur = new Scanner(System.in);

		System.out.print("Donnez la valeur de n, n > = 2 :");

		int n = 0;
		boolean ok = false;
		do {
			try {
				n = saisieUtilisateur.nextInt();
				saisieUtilisateur.nextLine();
				if (n >= 2) {
					ok = true;
				}

			} catch (Exception e) {
				saisieUtilisateur.nextLine();
				System.out.print("Erreur");
			}
		} while (ok == false);

		saisieUtilisateur.close();
		return n;
	}

}

