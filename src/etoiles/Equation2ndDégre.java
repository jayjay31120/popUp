package etoiles;

public class Equation2ndDégre {

	public static void main(String[] args) {

		Recherche(4, 7, 3);

	
	
	
	
	
	
	
	}
	
	static void Recherche(int a, int b, int c) {
		double d = ((Math.pow(b, 2)) - (4 * a * c));
		double x1, x2;

		if (d > 0) {
			x1 = ((-b - (Math.sqrt(a))) / (2 * a));
			x2 = ((-b + (Math.sqrt(a))) / (2 * a));
			System.out.println( "x1 vaut " +x1 + " et x2 vaut " + x2);
		} else {
			if (d < 0) {
				System.out.println("le polynome n'a pas de solution");
			} else {
				x1 = x2 = (-b / 2 * a);
				System.out.println("il y a une solutiun qui est"+ x1);
			}
		}
	}

}