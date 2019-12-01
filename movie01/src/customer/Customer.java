
//分解并重组statment()

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
			
			thisAmount = amountFor(each);
			
			
			frequentRenterPoints ++;
			if((each.getMovie().getPrinceCode()==Movie.NEW_RELEASE)&&
					each.getDaysRented()>1)frequentRenterPoints ++;
			
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		result += "Amount owed is " + String.valueOf(totalAmount)+"\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)+
				" frequent renter points";
		return result;
	}
private double amountFor(Rental aRental) {
	double result = 0;
	switch(aRental.getMovie().getPrinceCode()) {
	case Movie.REGULAR:
		result += 2;
		if(aRental.getDaysRented()>2)
			result +=(aRental.getDaysRented()-2) * 1.5;
		break;
	case Movie.NEW_RELEASE:
		result += aRental.getDaysRented() * 3;
		break;
	case Movie.CHILDRENS:
		result += 1.5;
		if(aRental.getDaysRented()>3)
			result += (aRental.getDaysRented()-3) * 1.5;
		break;
	}
	return result;
}
}