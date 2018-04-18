package termekeim;

public class Aru {
	private String nev;
	private int ar;
	
	public Aru(String nev, int ar) {
		this.nev = nev;
		this.ar = ar;
	}
	@Override
	public String toString() {
		return "Aru [nev=" + nev + ", ar=" + ar + ", toString()=" + super.toString() + "]";
	
	}
	public int getAr() {
		return ar;
	}
	
	
	
}
