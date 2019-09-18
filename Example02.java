class Animal{
	void shout(){
		System.out.println("dongwufachudejiaosheng");
	}
}
class Dog extends Animal{
	void shout(){
		System.out.println("wangwang.....");
	}
}
public class Example02{
	public static void main(String[] args){
		Dog dog=new Dog();
		dog.shout();
	}
}