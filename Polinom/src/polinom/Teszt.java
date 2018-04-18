package polinom;

import java.util.Scanner;

import matematika.Polinom;

public class Teszt {
	
	public static void fgvTablazat(Polinom polinom) {
		System.out.println("x\ty");
		for (double i = 0; i <=1; i+=0.1){
		System.out.print(i + "\t");
		System.out.println(polinom.szamol(i));
			
		}
		
	}
	
	public static void main(String[] args) {
		
		//LinearisPolinom egyenesEgyenlete = new LinearisPolinom(2, 3);
		LinearisPolinom egyenesEgyenlete = new LinearisPolinom(2, -3);
		
		System.out.println(egyenesEgyenlete);
		
		int polinomokSzama = 5;
		LinearisPolinom[] polinomok = new LinearisPolinom[polinomokSzama];
		double a, b = 0;
		Scanner beolvasas = new Scanner(System.in);
		for (int i = 0; i < polinomok.length; i++) {
			System.out.println("Kerem az a egyutthatot");
			a = beolvasas.nextDouble();
			beolvasas.nextLine();
			polinomok[i]= new LinearisPolinom(a, b);
			}
		for (int i = 0; i < polinomok.length; i++)
			 System.out.println(polinomok[i]);
		beolvasas.close();
		
		fgvTablazat(polinomok[polinomokSzama - 1]);

	}
}
	
