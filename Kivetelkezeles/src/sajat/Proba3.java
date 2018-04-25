package sajat;

import java.io.*;
import java.util.*;

public class Proba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int meret = 5;
		int tomb[] = new int[meret];

		// Scanner beolvasas = new Scanner(System.in);

		for (int i = 0; i < tomb.length; i++) {

			try {
				InputStreamReader bemenetOlvaso = new InputStreamReader(System.in);
				BufferedReader beolvasas = new BufferedReader(bemenetOlvaso);
				

				boolean rosszAdat = true;

				do {

					System.out.println("Kerem adja meg a(z)" + (i + 1) + ". egesz szamot!");
					System.out.println("szam:");

					try {
						tomb[i] = Integer.valueOf(beolvasas.readLine()).intValue();
						rosszAdat = false;

					} catch (NumberFormatException e) {
						System.out.println("nem egesz szamot kaptunk");

				}

				} while (rosszAdat);

			} catch (IOException e) {
				// TODO: handle exception
			}

		}

		//beolvasas.close();

		System.out.println("A beolvasott ertekek:");

		for (int i : tomb) {
			System.out.println(i);
		}

	}
}
