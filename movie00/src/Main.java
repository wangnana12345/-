import movie.*;
import customer.*;
import rental.*;
import java.util.*;
public class Main {
  public static void main(String [] args) {
	  Movie movie1 = new Movie("我就是喜欢，你看不惯我，又干不掉我的样子",0);
	  Movie movie2 = new Movie("世界这么大，你就是眼瞎看不了   ",1); 
	  Movie movie3 = new Movie("气死你，就问你气不气！^_^    ",2); 
	  Rental rental1 = new Rental(movie1,10); 
	  Rental rental2 = new Rental(movie2,5);
	  Rental rental3 = new Rental(movie3,6);
	  Customer customer = new Customer("张三"); 
	  customer.addRental(rental1);
	  customer.addRental(rental2);  
	  customer.addRental(rental3);  
	  System.out.println(customer.statment());
  }
}
