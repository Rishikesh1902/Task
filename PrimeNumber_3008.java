//Prime number or not

package pack3;
import java.util.Scanner;		//Importing Scanner Class

public class PrimeNumber_3008		//Defining Class
{
	public static void main(String [] arg)		//Defining void main
	{
		//input
		int n, m=0;			//Defining variables
		boolean Prime=true;
		System.out.println("Enter any Number to check whether it is prime no or not: ");
		Scanner sc = new Scanner(System.in);		//Creating object from  Scanner
		n = sc.nextInt();				//Assigning input from user to the variable
		
		//logic 
		for(int i=2; i<=n/2; i++)
		{
			m=n%i;
			if(m==0)
			{
				Prime=false;
				break;
			}
		}
		
		//output
		if(Prime)
			System.out.println(n+ " is Prime Number");
		else
			System.out.println(n+ " is not a Prime Number");
	}
}