package etoiles;
public class exo4 {
public static void main(String[] args) {

	String s = "Hello World!Bonjour tout le monde";
	String t = "* ";
	String y = " *";
	String g = t+s+y;
			
	int b = s.length();
	int z = t.length();
	int o = y.length();
	int w = b+z+o;
		
	afficherNb(b);
	afficherEtoile(b);
	afficherPhrase(s);
	afficherEtoile(b);
	
	
	System.out.println();
	System.out.println();
	
	
	afficherNb(w);
	afficherEtoile(w);
	afficherPhrase(g);
	afficherEtoile(w);	
	
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