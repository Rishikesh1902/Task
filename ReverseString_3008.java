//Reverse the String

package pack3;
import java.util.Scanner;			//Importing Scanner Class

public class ReverseString_3008 	//Defining Class
{
	public static void main(String []args)		//Defining void main
	{	
		//input
		String a, rev="";		//Defining String 
		int i,l;				//Defining variables
		Scanner sc = new Scanner(System.in);		//Creating Scanner object
		System.out.println("Enter the String to be Reversed:");
		a = sc.nextLine();				//Assigning input from user to the variable
		
		//logic
		l = a.length();					//Counting length of variable to variable 'l'
		for(i=l-1; i>=0; i--)
			rev += a.charAt(i);
		
		//output
		System.out.println("Reverse of Entered String is : "+rev);
	}
}