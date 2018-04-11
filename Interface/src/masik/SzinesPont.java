package masik;

import java.awt.Color;

import sajat.Szinezheto;

public class SzinesPont extends Pont implements Szinezheto {
	
	private Color szin;
	
	public SzinesPont(int x, int y, Color szin) {
		super(x, y);
		this.szin = szin;
	}
	
	public SzinesPont(Color szin) {
		super(0, 0);
		this.szin = szin;
	}

	@Override
	public String toString() {
		return "SzinesPont [szin=" + szin + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public Color getAlapertelmezett() {
		// TODO Auto-generated method stub
		return alapertelmezett;
	}

	@Override
	public void setAlapertelmezett(Color szin) {
		// TODO Auto-generated method stub
		this.szin=szin;
	}

}
