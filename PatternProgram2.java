package PatternProgram;

public class PatternProgram2 
{
	public static void main(String []args)
	{
		int num=5;
		for(int i=1; i<=num; i++)/// outer loop
		{
			for(int j=num; j>=i; j--)// inner loop
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
