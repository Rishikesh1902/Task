//Entered character is vowel or consonant

package pack3;
import java.util.Scanner;			//Importing Scanner Class 

public class VowelConsonant_3008 	//Defining Class
{
	public static void main(String [] args)		//Defining void main
	{
		//input
		char c;			//Declaration of variable
		System.out.println("Enter a character to check whether it is a Vowel or Consonant: ");
		Scanner g = new Scanner(System.in);		//Creating object from Scanner
		c = g.next().charAt(0);				//Assigning input from user to the object
		
		//logic and output
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			System.out.println("Entered character "+c+" is a Vowel.");
		else
			System.out.println("Entered character "+c+" is a Consonant.");
	}
}