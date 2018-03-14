package atlagszamolas;

import java.util.Scanner;

public class Atlagszamolas {

	public static void main(String[] args) {
		double[] valostomb = new double[10];
		Scanner bemenet = new Scanner(System.in);
		
		for (int i = 0; i < valostomb.length; i++) {
			System.out.println("Kerem adja meg a(z)" + (i+1) + "elem erteket!");
			valostomb[i] = bemenet.nextDouble();
		}
		//double mertani_atlag = 1;
	}

}
