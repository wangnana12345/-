
//运用多态取代与价格相关的条件逻辑

package customer;
import java.util.*;
import movie.*;
import rental.*;
public class Customer {
	private String _name;
	private Vector _rentals = new Vector();
	
	public Customer (String name){
		_name = name;
	};
	
	public void addRental(Rental arg){
		_rentals.addElement(arg);
	}
	public String getName(){
		return _name;
	};
	public String statment() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while(rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each =(Rental)rentals.nextElement();
			
			frequentRenterPoints = each.getFrequentRenterPoints();
			
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(each.getCharge()) + "\n";
			totalAmount += each.getCharge();
		}
		result += "Amount owed is " + String.valueOf(getTotalCharge())+"\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())+
				" frequent renter points";
		return result;
	}
	//创建getTotalCharge()
	private double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	//创建getTotalFrequentRenterPoints()
	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
private double amountFor(Rental aRental) {
	return  aRental.getCharge();
	
}
}