package tartalyos;

public class Tartaly extends Tarolo {
	
	private double nyomas;
	
	
	
	public Tartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas = nyomas;
	}



	@Override
	public boolean veszelyesE() {
		// TODO Auto-generated method stub
		if (getTerfogat() * nyomas > 100) {
			return true;
		} else return false;

		}



	@Override
	public String toString() {
		return "Tartaly [nyomas=" + nyomas + ", veszelyesE()=" + veszelyesE() + ", getTerfogat()=" + getTerfogat()
				+ ", toString()=" + super.toString() + "]";
	}

	
	private boolean nagyobbNyomasuMint(Tartaly masik){
		if (nyomas > masik.nyomas) {
			return true ;
		} else return false;

		} 
	private static Tartaly NagyobbTerfogatuMint(Tartaly egyik, Tartaly masik){
		if (egyik.getTerfogat()>masik.getTerfogat()) {
			return egyik;
		} else return masik;

		
	}
	}
	
	


