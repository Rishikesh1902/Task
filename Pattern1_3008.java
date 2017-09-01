/*	1
	12
	123
	1234
	12345 */

package pack3;
import java.util.Scanner;		//Importing Scanner Class 

public class Pattern1_3008		//Defining Class
{
	public static void main(String [] arg)			//Defining void main
	{	
		//input
		int n;			//Declaration of Variable
		System.out.print("Enter maximum number for pattern (less than 10):");
		Scanner sc = new Scanner(System.in);		//Creating object of Scanner
		n = sc.nextInt();
		
		//logic and output
		for(int i=1; i<=n; ++i)
		{
			if(i!=4)
			{
				for(int j=1; j<=i; ++j)
				{
					System.out.print(j);
				}
				System.out.println("");
			}
		}
	}
}