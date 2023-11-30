package pattern.Java.Program;

public class countTheOject 
{
	
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
			
			System.out.println(person.count);
		}
		
	}
	class person{
		int age;
		String name;
		 static int  count;
		// i created method 
		public  person()
		{
			
			count++;
			System.out.println("hello vishal rai");	
		}
		
	}



