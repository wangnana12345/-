class Student{
	final String name;
	public void introduce(){
		System.out.println("woshiyigexuesheng,woshi"+name);
	}
}
public class Example09{
	public static void main(String[] args){
		Student stu=new Student();
		stu.introduce();
	}
}