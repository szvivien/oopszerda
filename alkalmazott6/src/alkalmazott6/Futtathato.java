package alkalmazott6;

import java.util.*;

public class Futtathato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int meret = 5;
		Scanner beolvasas = new Scanner(System.in);
		
		System.out.println("Kerem adja meg az alkalmazottak szamat");
		System.out.println("alkalmazottak szama:");
		
		int meret= beolvasas.nextInt();
		
		Alkalmazott6 alkalmazottak[] = new Alkalmazott6[meret];
		Random veletlenszam = new Random();
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i]=new Alkalmazott6("XY" + (i + 1),veletlenszam.nextInt(Alkalmazott6.getNyugdijkorhatar()));
		
		System.out.println(alkalmazottak[i]);
		
		}
		Alkalmazott6.setNyugdijkorhatar(70);
		
		System.out.println("Valtoztattuk a nyugdijkorhatart.");
		
		for (Alkalmazott6 alkalmazott6 : alkalmazottak) {
			System.out.println(alkalmazott);
		}
		
		beolvasas.close();
	}

}
