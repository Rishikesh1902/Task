//Check whether number is Armstrong or not

package pack3;
import java.util.Scanner;		//Importing Scanner Class

public class Armstrong_3008 	//Class Declaration
{
	public static void main(String [] args)		//Start of void main
	{
		//input
		int n, m, r, sum=0;			//Initialization of variables
		System.out.print("Enter number to check whether it is Armstrong or not: ");		
		Scanner sc = new Scanner(System.in);		//Creating object of Scanner to get Input from User
		n = sc.nextInt();			//Assigning Input to variable	
		
		//logic and output
		m = n;
		while(m != 0)			//While condition
		{
			r = m % 10;			//getting Single digit 
			sum += Math.pow(r, 3);		//Getting cube of single digit and adding it to the sum
			m /= 10;
		}
		if(sum == n)			//Armstrong Condition
			System.out.println(n+" is Armstrong number.");
		else
			System.out.println(n+" is not a Armstrong number.");
	}
}