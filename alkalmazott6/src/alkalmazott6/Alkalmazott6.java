package alkalmazott6;

public class Alkalmazott6 {
	private String nev;
	private int kor;
	private long fizetes;
	
	private static int nyugdijkorhatar = 65;

	public Alkalmazott6(String nev, int kor, long fizetes) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}

	public Alkalmazott6(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = 10000*kor;
	}
	public int hanyEv() {
		return nyugdijkorhatar-kor;
	}

	@Override
	public String toString() {
		return "Alkalmazott6 [nev=" + nev + ", kor=" + kor + ", fizetes=" + fizetes + ", hanyEv()=" + hanyEv() + "]";
	
		
	}

	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott6.nyugdijkorhatar = nyugdijkorhatar;
		
	}
	
	
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}

	public static Alkalmazott6 tobbEveVanHatraNyugdijig(Alkalmazott6 elsoAlkalmazott, Alkalmazott6 masodikAlkalmazott) {
		if (elsoAlkalmazott.hanyEv()>masodikAlkalmazott.hanyEv()) {
			return elsoAlkalmazott;
		} else {
			return masodikAlkalmazott;
		}
		
	}
	
}
