package harmadik;

import java.awt.Color;

import masik.SzinesPont;
import sajat.Szinezheto;

public class Futtathato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Szinezheto szinespont = new SzinesPont(Color.BLUE);
		System.out.println(szinespont);
		szinespont.setAlapertelmezett(Color.GREEN);
		System.out.println(szinespont);
		Atszinezo(szinespont);
		System.out.println(szinespont);
	}
	public static void Atszinezo(Szinezheto objektum) {
		objektum.setAlapertelmezett(objektum.alapertelmezett);
	}
	
}
