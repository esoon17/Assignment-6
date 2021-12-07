
public class Smoothie extends Beverage{
	
	//Instance variables
	private int numFruit;
	private boolean protein;
	private final double PROTEIN_COST = 1.50;
	private final double FRUIT_COST = 0.50;
	
	//Parametrized Constructor
	Smoothie(String n, SIZE s, int fruit, boolean protein){
		super(n, TYPE.SMOOTHIE, s);
		this.numFruit = fruit;
		this.protein = protein;
	}
	
	//An Overridden  toString method
	public String toString() {
		return getBevName() + getSize() + this.protein + this.numFruit + calcPrice();
	}
		
	//An Overridden equals method
	public boolean equals(Smoothie s) {
		if (super.equals(s) && getNumOfFruits()==s.getNumOfFruits() && protein==s.getAddProtien()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Overridden calcPrice method
	public double calcPrice(){
		double price = 0;
		price += super.getBasePrice();
		  
		if (super.getSize() == SIZE.MEDIUM) {
		price += super.getSizePrice();
		}
		else if (super.getSize() == SIZE.LARGE) {
		price += 2 * super.getSizePrice();
		}
		  
		price += getNumOfFruits() * FRUIT_COST;
		if (protein) {
		price += PROTEIN_COST;
		}
		  
		return price;
	}
	
	//Setters and getters	
	public int getNumOfFruits() {
		return this.numFruit;
	}
	public void setNumFruit(int f) {
		this.numFruit = f;
	}
	
	public boolean getAddProtien() {
		return this.protein;
	}
	public void setProtein(boolean p) {
		this.protein = p;
	}
	
	public double getFruitCost() {
		return FRUIT_COST;
	}
	public double getProteinCost() {
		return PROTEIN_COST;
	}

}
