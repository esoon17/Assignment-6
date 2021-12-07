import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order>{
	
	//Instance variables
	private int orderNum;
	private int orderTime;
	private DAY orderDay;
	private Customer customer;
	private ArrayList<Beverage> bevList;
	
	//Parametrized Constructor
	public Order(int t, DAY d, Customer c) {
		this.orderNum = getOrderNo();
		this.orderTime = t;
		this.orderDay = d;
		this.customer = c;
		bevList = new ArrayList<>();
	}
	
	//Random Number generator, range 10000-90000
	public int randomOrderNum() {
        Random rand = new Random();
        int randInt = rand.nextInt(90_000-10_000)+10_000;
        return randInt;
	}
	
	public boolean isWeekend() {
		if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY) {
			return true;
		}
		else 
			return false;
	}
	
	//An Overridden  toString method
	public String toString() {
		String s = getOrderNo() + getOrderTime() + getOrderDay().toString() + getCustomer().toString() + calcOrderTotal();
		for (Beverage b: bevList) {
			s+=b.toString();
		}
		return s;
	}
	
	//Overridden compareTo method
	public int compareTo(Order o) {
        if (orderNum == o.getOrderNo()) {
            return 0;
        }
        else if (orderNum > o.getOrderNo()) {
        	return 1;
        }
        else {
            return -1;
        }
	}
	
	public double calcOrderTotal() {
        double orderTotal = 0;
        
        for (Beverage b : bevList) {
                orderTotal += b.calcPrice();
        }
        
        return orderTotal;
	}
	
	//Adding beverages
    public void addNewBeverage(String name, SIZE size, boolean extraShot, boolean extraSyrup) {
        Coffee c = new Coffee(name, size, extraShot, extraSyrup);
        bevList.add(c);
    }
    public void addNewBeverage(String name, SIZE size, int numOfFruits, boolean proteinPowder) {
        Smoothie s = new Smoothie(name, size, numOfFruits, proteinPowder);
        bevList.add(s);
    }
    public void addNewBeverage(String name, SIZE size) {
        boolean isWeekend = false;
        if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY) {
                isWeekend = true;
        }
        Alcohol a = new Alcohol(name, size, isWeekend);
        bevList.add(a);
    }
    public int findNumOfBeveType(TYPE type) {
        int count = 0;
        for (Beverage b : bevList) {
        	if (b.getType() == type) {
        		count++;
        	}
        }
        return count;
    }
    public Beverage getBeverage(int itemNum) {
        return bevList.get(itemNum);
    }
	
	//Getters and Setters
    public int getOrderNo() {
        return orderNum;
    }
    public void setOrderNum(int n) {
    	this.orderNum = n;
    }
	
    public int getOrderTime() {
        return orderTime;
    }
    public void setOrderTime(int t) {
    	this.orderTime = t;
    }
	
    public DAY getOrderDay() {
        return orderDay;
    }
    public void setOrderDay(DAY d) {
    	this.orderDay = d;
    }
	
    public Customer getCustomer() {
        return this.customer;
    }
    public void setCustomer(Customer c) {
    	this.customer = c;
    }
	public int getTotalItems() {
        return bevList.size();
	}
	
	public ArrayList<Beverage> getBeverages() {
        return bevList;
	}

}
