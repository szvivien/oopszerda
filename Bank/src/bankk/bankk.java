package bankk;

public class bankk {
	private String tulaj;
	private int egyenleg;
	private int limit;

	private bankk() {
		this.limit = 100000;
	}

	public bankk(String tulaj, int egyenleg, int limit) {
		this.tulaj = tulaj;
		this.egyenleg = egyenleg;
		this.limit = limit;
	}

	public bankk(String tulaj, int egyenleg) {
		this(); //private konstruktor hívása, paraméterlista
		this.tulaj = tulaj;
		this.egyenleg = egyenleg;
	}

	public boolean penzFelvet(int osszeg) {
		if (osszeg > this.limit) {
			return false;
		} else if (osszeg <= this.limit) {
			this.egyenleg = this.egyenleg - osszeg;
			return true;
		}
		return false;
	}

	public String getTulaj() {
		return tulaj;
	}

	public int getEgyenleg() {
		return egyenleg;
	}

	public int getLimit() {
		return limit;
	}

	@Override
	public String toString() {
		return "bankk [tulaj=" + tulaj + ", egyenleg=" + egyenleg + ", limit=" + limit + "]";
	}
	
	
}
