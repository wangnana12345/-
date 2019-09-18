class Animal{
	public Animal(String name){
		System.out.println("woshiyizhi"+name);
	}
}
class Dog extends Animal{
	public Dog(){
	super("shapigou");
}
}
public class Example04{
	public static void main(String[] args){
		Dog dog=new Dog();
	}
}
	