
public class AlkalmazottatHasznalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alkalmazott alkalmazottobj = new Alkalmazott();
		//statikus t�pus, dinamikus t�pus
		
		//private modosito meg nem volt
		//alkalmazottobj.nev = "Kiss Istvan";
		//alkalmazottobj.fizetes = 10;
		
		alkalmazottobj.setNev("Kiss Istvan");
		alkalmazottobj.setFizetes(10);
		
		System.out.println(alkalmazottobj.toString());
		System.out.println(alkalmazottobj);
		
		alkalmazottobj.fizetesNovelese(5);
		
		System.out.println(alkalmazottobj);
		
		System.out.println("Alkalmazott neve: " + alkalmazottobj.getNev());
		
		System.out.println(alkalmazottobj.getFizetes());
		
		System.out.println(alkalmazottobj.fizetesIntervallumokKozott(10, 50));
		
		System.out.println(alkalmazottobj.fizetendoAdo());
		
		Alkalmazott alkalmazott2 = new Alkalmazott();
		
		alkalmazott2.setNev("Kiss Klaudia");
		alkalmazott2.setFizetes(35);
		alkalmazott2.fizetesNovelese(11);
		
		System.out.println(alkalmazott2);
		
		System.out.println(alkalmazottobj.fizetesNagyobbMint(alkalmazott2));
		System.out.println(alkalmazott2.fizetesNagyobbMint(alkalmazottobj));
		
		//Alkalmazott[] alkalmazottak = new Alkalmazott[5];
		Alkalmazott alkalmazottak[] = new Alkalmazott[5];
		
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott();
			alkalmazottak[i].setNev("XY");
			alkalmazottak[i].setFizetes((long)(Math.random() * 50));
			System.out.println(alkalmazottak[i]);
			
		}
		
		int maxfizetesualindexe = 0;
		for (int i = 1; i < alkalmazottak.length; i++) {
			if(alkalmazottak[i].getFizetes() > alkalmazottak[maxfizetesualindexe].getFizetes()) {
				maxfizetesualindexe= i;
				}
		
			
				
		}
		System.out.println("A maximum fizetes:");
		System.out.println(alkalmazottak[maxfizetesualindexe]);

		
	}
	
};
