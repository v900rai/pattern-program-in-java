package PatternProgram;

public class  pyramidPattern
{
	public static void  pyramidPattern(int n)
	{
		int i,j;
		 for ( i=0; i<n; i++) 
         { 
             System.out.print(" "); //print space
         }  
         for ( j=0; j<=i; j++ ) //inner loop for number of columns
         { 
             System.out.print("* "); //print star
         } 

         System.out.println(); //ending line after each row
     }

	public static void pyramidPattern(String []args)
	{
		int n=5;
		pyramidPattern(5);
	}
}


