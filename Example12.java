interface Animal{
	int ID=1;
	void breathe();
	void run();
}
interface LandAnimal extends Animal{
	void liveOnland();
}
class Dog implements LandAnimal{
	public void breathe(){
		System.out.println("gouzaihuxi");
	}
	public void run()
	{
		System.out.println("gouzaopao");
	}
	public void liveOnland(){
		System.out.println("goushenghuozailudishang");
	}
}
public class Example12{
	public static void main(String[] args){
		Dog dog=new Dog();
		dog.breathe();
		dog.run();
		dog.liveOnland();
	}
}