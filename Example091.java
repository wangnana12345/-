class Student{
	final String name="lifang";
	public void introduce(){
		System.out.println("woshiyigexuesheng,woshi"+name);
	}
}
public class Example091{
	public static void main(String[] args){
		Student stu=new Student();
		stu.introduce();
	}
}