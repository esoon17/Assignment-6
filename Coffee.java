
public class Coffee extends Beverage{
		
	//Instance variables
	private boolean extraShot;
	private boolean extraSyrup;
	private final double SHOT_COST = 0.5;
	private final double SYRUP_COST = 0.5;
	
	//Parametrized constructor  
	Coffee(String n, SIZE s, boolean extraS, boolean extraSy){
		super(n, TYPE.COFFEE, s);
		this.extraShot = extraS;
		this.extraSyrup = extraSy;
	}
	
	//Overridden toString method
	public String toString() {
		return this.getBevName() + this.getSize() + this.extraShot + this.extraSyrup + calcPrice();
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
        
        if (extraShot) {
                price += SHOT_COST;
        }
        if (extraSyrup) {
                price += SYRUP_COST;
        }
        
        return price;
	}
	
	//An Overridden equals method
	public boolean equals(Coffee c) {
		if (super.equals(c) && extraShot==c.getExtraShot() && extraSyrup==c.getExtraSyrup()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Getters and Setters
	public boolean getExtraShot() {
		return this.extraShot;
	}
	public void setExtraShot(boolean shot) {
		this.extraShot = shot;
	}
	
	public boolean getExtraSyrup() {
		return this.extraSyrup;
	}
	public void setExtraSyrup(boolean syrup) {
		this.extraSyrup = syrup;
	}
	
	public double getSyrupCost() {
		return SYRUP_COST;
	}
	public double getShotCost() {
		return SHOT_COST;
	}
}
