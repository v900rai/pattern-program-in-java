package pattern.Java.Program;

public class mainClass {
	public static void main(String args[])
	{
		person p1=new person();
		p1.age=23;
		p1.name="vishal rai";// wwhen i was created multiple object no problem
		person p2=new person();
		p2.age=5;
		p2.name="aranv rai";
		System.out.println(p1.age+" "+p1.name);
		System.out.println(p2.age+" "+p2.name);
		p1.vishal(10, 10);
	}
	
}
class person{
	int age;
	String name;
	// i created method 
	public static void vishal(int a, int b)
	{
		System.out.println(a+b);
		
		
	}
	
}
