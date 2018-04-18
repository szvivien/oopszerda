package termekeim;

import java.awt.Color;

import sajat.Szinezheto;

public class Toll extends Aru implements Szinezheto {
	private Color szin;
	private String markanev;
	
	public Toll(String nev, int ar, Color szin, String markanev) {
		super(nev, ar);
		this.szin = szin;
		this.markanev = markanev;
	}

	@Override
	public String toString() {
		return "Toll [markanev=" + markanev + ", toString()=" + super.toString() + "]";
	}

	@Override
	public Color getSzin() {
		return szin;
	}

	public void setSzin(Color szin) {
		this.szin = szin;
	}

	
	
	
}
