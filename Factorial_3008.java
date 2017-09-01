//Factorial

package pack3;
import java.util.Scanner;		//Importing Scanner Class

public class Factorial_3008 	//Defining Class
{
	public static void main(String [] args)		//Defining void main
	{
		//input
		int n, fact=1;				//Defining variables
		System.out.print("Enter the number to find it's Factorial: ");
		Scanner g = new Scanner(System.in);		//Creating object of Scanner
		n = g.nextInt();
		
		//logic
		for(int i=1; i<=n; i++)
		{
			fact *= i;
		}
		
		//output
		System.out.println("The Factorial of "+n+" is "+fact);
	}
}