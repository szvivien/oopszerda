package myproducts;

public class Aru {
	private String nev;
	private int netto_ar;
	private int afakulcs;
	
	
	public Aru(String nev, int netto_ar, int afakulcs) {
		this.nev = nev;
		this.netto_ar = netto_ar;
		this.afakulcs = afakulcs;
	}

	public int brutto_ar() {
		return (int) (netto_ar * (1+ afakulcs / 100.0));
	}

	@Override
	public String toString() {
		return "Aru [nev=" + nev + ", brutto_ar()=" + brutto_ar() + "]";
	}
	
	
	public int noveltNettoAr(){
		return netto_ar
	}
	
	
}
	
