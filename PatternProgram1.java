package PatternProgram;

public class PatternProgram1 
{
	public static void main(String []args)
	{
		int num=5;
		for(int i=1; i<=num; i++) /// outer loop hota h roww k liye 
		{
			for(int j=1; j<=i; j++) /// coloum k liye hota h 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

