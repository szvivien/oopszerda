package practise;

import java.util.Random;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.util.Random rand = new java.util.Random();
		
		//int random = rand.nextInt(50)+1;
		
		int tomb[] = new int[10];
		Random veletlenobjektum = new Random();
		
		System.out.println("A tomb elemei:");
		
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = veletlenobjektum.nextInt(50)+1;
			System.out.println(tomb[i]);
			
		}
		
		System.out.println();
		System.out.println("Fordított sorrend:");
		
		for (int i = tomb.length -1; i >= 0; i--) {
			System.out.println(tomb[i]);
		}
		
		int legnagyobb_index = 0;
		
		for (int i = 1; i < tomb.length; i++) {
				if (tomb[i] > tomb[legnagyobb_index]) {
					legnagyobb_index = i;
					
				}
			System.out.println();
			System.out.println("A legnagyobb szám:" + tomb[legnagyobb_index]);
			
			
			
			
			
		}
	}
	
	

}