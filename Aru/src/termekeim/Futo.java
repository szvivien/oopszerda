package termekeim;
import termekeim.*;
public class Futo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aru aru_objektum = new Aru("aru", 20, 27);
		Kenyer kenyer_objektum = new Kenyer("kenyer", 100, 15, 0.75);
		
		System.out.println("A termekek adatai:");
		System.out.println(aru_objektum);
		System.out.println(kenyer_objektum);
		System.out.println();		
		
		int melyik_dragabb = aru_objektum.dragabb_e(kenyer_objektum);
        
		if (melyik_dragabb > 0) {
			System.out.println("aru a dragabb\n" + aru_objektum);
		}
		else if (melyik_dragabb < 0) {
			System.out.println("kenyer a dragabb\n" + kenyer_objektum);
		}
		else {
			System.out.println("egyforma a brutto aruk\n");
		}
		System.out.println();
		
		Aru aru2 = new Kenyer("kenyer2", 210, 15, 1);
		
		System.out.println("aru2.toString() eredmenye:");
		System.out.println(aru2);
		
		System.out.println(((Kenyer) aru2).getMennyiseg());
		
		Kenyer kenyer2 = new Kenyer("kenyer3", 110, 15, .5);
		
		System.out.println("\nelso_kenyer_nagyobb_egysegaru() eredmenye:");
		
System.out.println(Kenyer.elso_kenyer_nagyobb_egysegaru((Kenyer)aru2, kenyer2));			
		
		System.out.println("\nA nagyobb egysegaru:");
		if (Kenyer.elso_kenyer_nagyobb_egysegaru((Kenyer)aru2, kenyer2)) {
			System.out.println(aru2);
		}
		else {
			System.out.println(kenyer2);
		}
	}

}