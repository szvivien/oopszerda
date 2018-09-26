package bankk;

public class bankTest {

	public static void main(String[] args) {
		bankk[] bk = new bankk[3];
		
		bk[0] = new bankk("Tomi1", 1000, 500);
		bk[1] = new bankk("Tomi2", 6000, 1500);
		bk[2] = new bankk("Tomi3", 5500, 2500);
		
		
		for(bankk b: bk) {
			System.out.println(b.toString());
			
			System.out.println("Az egyenleg:" + b.getEgyenleg() + "\n");
		}
	}

}
