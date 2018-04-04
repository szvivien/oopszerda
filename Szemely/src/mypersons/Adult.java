package mypersons;

public class Adult extends Person {
	private String munkahely;
	
	public Adult(String nev, int kor, String munkahely) {
		super(nev, kor);
		this.munkahely = munkahely;
	}



	@Override
	public String toString() {
		return "Adult [munkahely=" + munkahely + ", toString()=" + super.toString() + "]";
	}



	public String getMunkahely() {
		return munkahely;
	}
	
	

}
