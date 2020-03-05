package etoiles;



public class Figure {

	public static void main(String[] args) {

		etoiles.Methodes.openScanner();
		int tt = etoiles.Methodes.saisir();
		etoiles.Methodes.closeScanner();
		etoiles.Methodes.triangle(tt);

	}

}
