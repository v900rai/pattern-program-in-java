package PatternProgram;
import java.util.Scanner;
public class PatternProgram4
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int sp=0;
		int st=num;
		for(int i=0;i<=num; i++)
		{
			for(int j=0; j<=sp; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=st; j++)
			{
				System.out.print("*");
			}
			sp++;
			st--;
			System.out.println();
		}
		
		
	}

}
