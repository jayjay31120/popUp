package etoiles;


public class Caracteristiques {
	public static void main(String[] args) {
		
		
	Methodes.openScanner();
		String xnom = Methodes.sasirnom();
		System.out.println(xnom);
String xprenom = Methodes.saisirprenom();
		System.out.println(xprenom);
	int age = Methodes.saisirAge();
		System.out.println(age);
	String taille = Methodes.saisirTaille();
		System.out.println(taille);
		Methodes.closeScanner();
	
	System.out.println("Bonjour " + xprenom + " " + xnom);
	System.out.println("Vous avez " + age + " ans");
	System.out.println("Vous mesurez " + taille + " metre");
		
		System.out.println((age>=18)? ("vous etes majeur") : (age<12)?(" vous etes un enfant") : (" vous est un ado"));  

		

	
	}
}

