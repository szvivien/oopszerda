package veletlenszam;

import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Veletlenszam {

	public static void main(String[] args) {
		int tomb[] = new int [10];
		Random veletlenobjektum = new Random();
		
		System.out.println("A tomb elemei:");
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = veletlenobjektum.nextInt(50) + 1;
			//tomb[i] = (int) (Math.random() * 50) +1;
			System.out.println(tomb[i]);
			
		}
		System.out.println("A tomb elemei forditott sorrendben:");
		for (int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[9-i]);
			
		}
		
		//legnagyobb paros szam megkeresese
		
		int maxindex = 0;
		for (int i = 0; i < tomb.length; i++) {
			
			if(tomb[i]>tomb[maxindex]) {
				maxindex = i;
			}
		}
		System.out.println("a legnagyobb ertek:");
		System.out.println(tomb[maxindex]);	
			
	}

  }

