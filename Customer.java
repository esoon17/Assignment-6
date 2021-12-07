
public class Customer {
	
	//Instance variable 
	private String name;
	private int age;
	
	//Parametrized constructor
	public Customer(String n, int a){
		this.name = n;
		this.age = a;
	}
	public Customer(Customer c) {
		this.name = c.getName();
		this.age = c.getAge();
	}
	
	//Overridden toString
	public String toString() {
		return this.name + this.age;
	}
	
	//Getters and Setters
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int a) {
		this.age = a;
	}
	
}
