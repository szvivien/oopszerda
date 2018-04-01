package test02;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private String Address;
	
	// constructor
	public Person(String fname, String lname) {
		firstName = fname;
		lastName = lname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAddress(String address) {
		this.Address = address;
	}
	
	public String Name() {
		return firstName+" "+lastName;
	}

	public String NameHU() {
		return lastName+" "+firstName;
	}
	
	public int getAge() {
		return this.age;
	}
}
