import movie.*;
import customer.*;
import rental.*;
import java.util.*;
public class Main {
  public static void main(String [] args) {
	  Movie movie1 = new Movie("�Ҿ���ϲ�����㿴�����ң��ָɲ����ҵ�����",0);
	  Movie movie2 = new Movie("������ô���������Ϲ������   ",1); 
	  Movie movie3 = new Movie("�����㣬��������������^_^    ",2); 
	  Rental rental1 = new Rental(movie1,10); 
	  Rental rental2 = new Rental(movie2,5);
	  Rental rental3 = new Rental(movie3,6);
	  Customer customer = new Customer("����"); 
	  customer.addRental(rental1);
	  customer.addRental(rental2);  
	  customer.addRental(rental3);  
	  System.out.println(customer.statment());
  }
}
