//Entered String is Palindrome or not

package pack3;
import java.util.Scanner;			//Importing Scanner Class 

public class Palindrome_3008 		//Defining Class
{
	public static void main(String [] args)		//Defining void main
	{
		//input
		String original, reverse = "";			//Defining String
		System.out.println("Enter any String to check it is or not Palindrome: ");
		Scanner sc = new Scanner(System.in);	//Creating object of Scanner
		original = sc.nextLine();
		
		//logic
		int l = original.length();		//length of string
		for(int i=l-1; i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		
		//output
		if(original.equals(reverse))
			System.out.println("Entered string "+original+" is palindrome");
		else
			System.out.println("Entered string "+original+" is not palindrome");
	}
}