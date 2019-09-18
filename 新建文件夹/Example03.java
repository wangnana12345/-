class Animal{
	String name="dongwu";
	void shout(){
		System.out.println("dongwufachudejiaosheng");
	}
}
class Dog extends Animal{
	String name="quanlei";
	void shout(){
		super.shout();
	}
	void printName(){
		System.out.println("name="+super.name);
	}
}
public class Example03{
	public static void main(String[] args){
		Dog dog=new Dog();
		dog.shout();
		dog.printName();
	}
}