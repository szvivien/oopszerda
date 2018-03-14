package kalkulator;

import java.util.Scanner;

public class Kalkulator {
	
	public static void main(String[] args) {
		Scanner bemenet = new Scanner(System.in);
		
		System.out.println("Kerem adja meg az 1.operandust!");
		System.out.print("1.operandus:");
		double elso_operandus = bemenet.nextDouble();
		
		System.out.println("Kerem adja meg a 2.operandust!");
		System.out.print("2.operandus:");
		double masodik_operandus = bemenet.nextDouble();
		
		System.out.println("Kerem adja meg az operatort!");
		System.out.print("operator:");
		String operator = bemenet.nextLine();
		operator = bemenet.nextLine();
		
		
		
		switch (operator) {
		case "+":
			System.out.println("az osszeadas eredmenye:");
			System.out.println(elso_operandus + masodik_operandus);
			break;
			
		case "-":
		
			System.out.println("a kivonas eredmenye:");
			System.out.println(elso_operandus - masodik_operandus);
			break;
			
		case "*":
			System.out.println("a szorzas eredmenye:");
			System.out.println(elso_operandus * masodik_operandus);
			break;
			
		case "/":
			System.out.println("az osztas eredmenye:");
			System.out.println(elso_operandus / masodik_operandus);
			break;
			
			default: System.out.println("A negy alapmuveletet hasznalja!");
				break;

		}
		System.out.println("Kerem adja meg a kifejezest!");
		System.out.print("kifejezes:");
		String kifejezes = bemenet.nextLine(); 
		// 3 + 2
		String[] eredmenytomb = kifejezes.split(" ");
		
		
		switch (eredmenytomb[1]) {
		case "+":
			System.out.println("az osszeadas eredmenye:");
			System.out.println(Double.parseDouble(eredmenytomb[0]) + Double.parseDouble(eredmenytomb[2]));
			break;
			
		case "-":
			//Integer.parseInt(s);
			System.out.println("a kivonas eredmenye:");
			System.out.println((Double.parseDouble(eredmenytomb[0]) - Double.parseDouble(eredmenytomb[2])));
			break;
	
			
			default: 
				break;

		
	}
	

}
	
}
