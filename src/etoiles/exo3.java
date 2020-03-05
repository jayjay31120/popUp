package etoiles;

public class exo3 {

	public static void main(String[] args) {


		String s = "Hello World!Bonjour tout le monde";
		int b = s.length();

		
		
		afficherNb(b);
		afficherEtoile(b);
		afficherPhrase(s);
		afficherEtoile(b);
		
		
	}

	public static void afficherEtoile(int nb) {
		for(int i = 1;i<=nb;i++){
			System.out.print('*');}

	}

	public static void afficherPhrase(String phrase) {
		System.out.println();
		System.out.println(phrase);
			
			
			
		}
	
	public static void afficherNb(int nb) {
		System.out.println(nb);
			
			
			
		}
}
