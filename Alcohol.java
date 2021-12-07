
public class Alcohol extends Beverage{
	
	//Additional instance variables
	private boolean isWeekend;
	private final double WEEKEND_COST = 0.60;
	
	//Parametrized constructor
	public Alcohol(String n, SIZE s, boolean w){
		super(n, TYPE.ALCOHOL, s);
		this.isWeekend = w;
	}
	
	//An Overridden toString method
	public String toString() {
		
		return getBevName() + ", " + getSize() + " " + this.isWeekend + calcPrice();
	}
		
	//An Overridden equals method
	public boolean equals(Alcohol a) {
		if (super.equals(a) && isWeekend==a.getWeekend()) {
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
		
		if(super.getSize() == SIZE.MEDIUM) {
			price += super.getSizePrice();
		}
		else if (super.getSize() == SIZE.LARGE){
			price += 2 * super.getSizePrice();
		}

		if (isWeekend) {
			price += WEEKEND_COST;
		}
		
		return price;
	}
	
	//Getters and Setters
	public boolean getWeekend() {
		return this.isWeekend;
	}
	public void setWeekend(boolean w) {
		this.isWeekend = w;
	}
	
	public double getWeekendFee() {
		return WEEKEND_COST;
	}
}
