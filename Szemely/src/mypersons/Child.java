package mypersons;

public class Child extends Person {
	private String iskola;

	public Child(String nev, int kor, String iskola) {
		super(nev, kor); //super- õs meghívása, elõl kell lennie
		this.iskola = iskola;
	}

	@Override
	public String toString() {
		return "Child [iskola=" + iskola + ", toString()=" + super.toString() + "]";
	}

	public String getIskola() {
		return iskola;
	}
	
	
	

}
