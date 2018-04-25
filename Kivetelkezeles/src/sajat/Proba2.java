package sajat;

import java.util.*;

public class Proba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int meret = 5;
		int tomb[] = new int[meret];
		Scanner beolvasas = new Scanner(System.in);

		for (int i = 0; i < tomb.length; i++) {
			boolean rosszAdat = true;

			do {

				System.out.println("Kerem adja meg a(z)" + (i + 1) + ". egesz szamot!");
				System.out.println("szam:");

				try {
					tomb[i] = Integer.parseInt(beolvasas.nextLine());
					rosszAdat = false;
					
				
				} catch (NumberFormatException e) {
					System.out.println("nem egesz szamot kaptunk");
				
					
				} catch (Exception e) {
					System.out.println("elkaptuk a kivételt");
				
					
				}
			
			} while (rosszAdat);
		
		}
	
			beolvasas.close();
	
		System.out.println("A beolvasott ertekek:");

		for (int i : tomb) {
			System.out.println(i);
		}

		}
}
