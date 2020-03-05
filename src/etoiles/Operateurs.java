package etoiles;

public class Operateurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nb1 = 123;
		int nb2 = 4;
		float nb3 = 5.9f ;
		float nb4 = 6.75f;
		boolean resultat = (nb1%nb2==0);

		// (1) 
		System.out.println("le r�sulat de la somme des nb1 et nb2 est �gal � " + (nb1+nb2));

		// (2)
//		if (nb1%nb2==0) {
//			boolean	resulat = true; 
//			System.out.println(nb1 +" se divise par "+nb2);
//		}
//		else {
//			boolean resulat = false;
//			System.out.println(nb1 + " ne se divise pas "+nb2);
//		}
		
		
		// resultat = (nb1%nb2==0)?true : false;  // expression ternaire !!!!!!!!
		 System.out.println(resultat?"nb1 est divisible avec nb2" : "nb 1 est non divisible avec nb2");
		

		//(3)
		
		System.out.println(nb4);
		System.out.println(++nb4);
		//System.out.println(nb4+=1);
		System.out.println(++nb4);

		//(4)
//		if (nb3==nb4) {
//			System.out.println(nb3 + " est egal � " + nb4);
//		}
//		else { if(nb3>nb4) {
//			System.out.println(nb3 + " est superieur � " + nb4);
//		}
//		else {System.out.println(nb3 + " est inferieur � " + nb4);
//		}
//
//		}
		System.out.println((nb3==nb4)?"nb3 est �gal a nb4" : (nb3>nb4)?"nb3 est superieur � nb4" : "nb3 est inferieur a nb4"); 
	}
}