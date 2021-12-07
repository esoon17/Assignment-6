
abstract class Beverage {
	
	//Instance variables
	private String name;
	private TYPE type;
	private SIZE size;
	private final double BASE_PRICE = 2.0;
	private final double SIZE_PRICE = 1.0;
	
	//Parametrized Constructor
	public Beverage(String n, TYPE t, SIZE s){
		this.name = n;
		this.type = t; 
		this.size = s;
	}
	
	//An abstract methods called calcPrice that calculates and returns the beverage price. 
	abstract double calcPrice();
	
	//An Overridden  toString method
	public String toString() {
		return this.name + this.size;
	}
	
	//An Overridden equals method
	public boolean equals(Beverage b) {
		if (this.name.equals(b.getBevName()) && this.type==b.getType() && this.size==b.getSize()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Getters and Setters
	public String getBevName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	
	public TYPE getType() {
		return this.type;
	}
	public void setType(TYPE t) {
		this.type = t;
	}
	
	public SIZE getSize() {
		return this.size;
	}
	public void setSize(SIZE s) {
		this.size = s;
	}
	
	public double getBasePrice() {
		return this.BASE_PRICE;
	}
	
	public double getSizePrice() {
		return this.SIZE_PRICE;
	}
	
}
