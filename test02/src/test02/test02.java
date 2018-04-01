package test02;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		
		p = new Person("Géza","Kiss");
		p.setAge(45);
		p.setSalary(180000.0);
		

		System.out.println(p.NameHU());
		System.out.println(p.getAge());
	}

}
