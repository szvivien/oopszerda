package polinom;

import matematika.Polinom;

public class LinearisPolinom implements Polinom {
	private double a;
	private double b;

	
	
	public LinearisPolinom(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		//return "y=" + a + "x" + ( b<0 ? "": "+" ) + b;
		return "y=" + a + "x" + b;
	}





	public double szamol(double x) {
		// Képlete: y= ax + b;
		return a*x+b;
	}

	public int polinomFoka() {
		// return 1;
		if ( a==0){
			return 0;
		} else {
			return 1;
		}
	}

}
