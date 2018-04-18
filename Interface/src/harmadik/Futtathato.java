package harmadik;

import java.awt.Color;

import masik.SzinesPont;
import sajat.Szinezheto;
import termekeim.Toll;

public class Futtathato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Szinezheto szinespont = new SzinesPont(Color.BLUE);
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		Atszinezo(szinespont);
		//Futtathato.Atszinezo(szinespont);
		System.out.println(szinespont);
		
		Szinezheto toll = new Toll("toll", 2000, Color.BLACK, "Parker");
		
		System.out.println(toll);
		System.out.println(Color.CYAN);
		System.out.println(toll);
		Atszinezo(toll);
		System.out.println(toll);
		
		
	}
	public static void Atszinezo(Szinezheto objektum) {
		objektum.setSzin(objektum.alapertelmezett);
	}
	
}
