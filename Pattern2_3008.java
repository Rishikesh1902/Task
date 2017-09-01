/*	54321
  	5432
  	543
  	54
  	5 */

package pack3;
import java.util.Scanner;			//Importing Scanner Class

public class Pattern2_3008			//Defining Class
{
	public static void main(String [] arg)		//Defining void main
	{
		//input
		int n;			//Declaration of Variable
		System.out.print("Enter maximum number for pattern (less than 10):");
		Scanner sc = new Scanner(System.in);		//Creating object of Scanner 
		n = sc.nextInt();			//Assigning input taken from user to the variable
		
		//logic and output
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}