package test;

import java.util.Scanner;
import javax.swing.JOptionPane; 

public class test {

	public static void main(String[] args) {
		/*
		Scanner rd = new Scanner(System.in);
		String s;
		int i;
	
		System.out.print("Add meg a számot:");
		i = rd.nextInt();
		System.out.println("A szám: " + Integer.toString(i));
		rd.nextLine();
		
		System.out.println("Adj meg egy stringet:");
		s = rd.nextLine();
		System.out.println("A szöveg: " + s);
*/
		JOptionPane.showMessageDialog(null, "üzenet", "ablak neve", 
				JOptionPane.ERROR_MESSAGE);
	}

}
