/*	Print a Rhombus of Star */

package pack3;
import java.util.Scanner;			//Importing Scanner class

public class Pattern3_3008			//Defining Class
{
	public static void main(String [] arg)		//Defining void main
	{
		//input
		int n, i, j, k;		//Declaration of variables
		char c;
		System.out.print("Enter any number: ");
		Scanner sc = new Scanner(System.in);		//Creating object of Scanner
		n = sc.nextInt();			//Assigning input taken from user to the variable
		System.out.println("Enter an character:");
		Scanner sc1 = new Scanner(System.in);		//Creating object of Scanner
		c = sc1.next().charAt(0);		//Assigning input taken from user to the variable
		
		//logic and output
		
		for(i=1; i<=n; i++)
		{
			for(j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(k=1; k<=(i*2)-1; k++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		
		for(i=(n-1); i>=1; i--)
		{
			for(j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(k=1; k<=(i*2)-1; k++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}