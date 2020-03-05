package etoiles;

public class optim {
	public static void main(String[] args) {
				
	String s = "Hello World!Bonjour tout le monde";
	
	
	afficherPhase1(s);
	
	afficherPhase2(s);
		
		
		
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
}
