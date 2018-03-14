package teglalap;

public class TeglalapTomb {
	public static void main(String[] args) {
		int meret = 10;
		
		Teglalap teglalapok[] = new Teglalap[meret];
		
		for (int i = 0; i < teglalapok.length; i++) {
			teglalapok[i]= new Teglalap((int)(Math.random() * 9) +2);
			
			System.out.println(teglalapok[i]);
			
		}
		int min = 0;
		
		for (int i = 1; i < teglalapok.length; i++) {
			if (teglalapok[min].nagyobbTeruletuMint(teglalapok[i]));
			min = i;
			
		}
		System.out.println(teglalapok[min]);
	}
	

}
