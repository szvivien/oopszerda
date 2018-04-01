package hanglemez;

public class Hanglemez {
	private String eloado;
	private String cim;
	private int hossz;
	public Hanglemez(String bejeloado, String bejcim, int bejhossz) {
		eloado=bejeloado;
		cim=bejcim;
		hossz=bejhossz;
	}
	@Override
	public String toString() {
		return "Eloado:"+eloado+"cim:"+cim+"hossz:"+hossz;
	}
	public String getCim(){
		return cim;
	}
	public String getEloado() {
		return eloado;
	}
	public int getHossz() {
		return hossz;
	}
	public int comparelemez(Hanglemez lemez1) {
	if (lemez1.getHossz() < hossz) {
		return 1;
	}
	if(lemez1.getHossz()==hossz) {
		return 0;
	}
	else { 
		return -1;}
	}
	
	import java.util.Scanner;
	public class Lemeztest{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Mennyi erteket szeretne beolvasni?");
			int param1=Integer.parselnt(sc.nextLine());
			String tempEloado;
			String tempCim;
			int tempHossz;
			int i;
			Hanglemez[] hanglemezek = new Hanglemez[param1];
			for(i=0;i<param1;i++){
				System.out.print(" ");
				tempEloado=sc.nextLine();
				System.out.println("");
				temp Cim=sc.nextLine();
				System.out.println("");
				tempHossz=Integer.parselnt(System.in);
				hanglemezek[i]=new Hanglemez(tempEloado, tempCim, tempHossz);
			}
			
			String choosen Artist;
			System.out.println("Adjon meg egy eloadot!");
			Choosen Artist=sc.nextLine();
			System.out.println("Az eloado lemezei:");
			for (int i = 0; i < param1; i++) {
				if(hanglemezek[i].getEloado().equals(choosenArtist))
					System.out.println(lemez[i].getCim());
			}
			
		}
		
	}
	




