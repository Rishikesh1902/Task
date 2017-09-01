//Calculator using Switch 

package pack3;
import java.util.Scanner;		//Importing Scanner Class

public class Calculator_Switch_3008		//Defining Class 
{
	public static void main(String []arg)		//Defining void main
	{
		//input
		int num1, num2;			//Declaration of Variable	
		double result=0.0;		//Declaration of Variable
		char op;				//Declaration of Variable
		
		//output
		do						//do-while loop
		{
			System.out.println("----------CALCULATOR----------");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("Enter the number of operation you want to perform: ");
			Scanner s = new Scanner(System.in);			//Creating Scanner object
			op = s.next().charAt(0);			//Assigning input from user to variable
			
			switch(op)		//switch case
			{
				case '1':	//ADDITION
							System.out.print("Enter First Number:");
							num1=s.nextInt();
							System.out.print("Enter Second Number:");
							num2=s.nextInt();
							result = num1 + num2;
							System.out.print("Result: "+result);
							break;
							
				case '2':	//SUBTRACTION
							System.out.print("Enter First Number:");
							num1=s.nextInt();
							System.out.print("Enter Second Number:");
							num2=s.nextInt();
							result = num1 - num2;
							System.out.print("Result: "+result);
							break;
							
				case '3':	//MULTIPLICATION
							System.out.print("Enter First Number:");
							num1=s.nextInt();
							System.out.print("Enter Second Number:");
							num2=s.nextInt();
							result = num1 * num2;
							System.out.print("Result: "+result);
							break;
							
				case '4':	//DIVISION
							System.out.print("Enter First Number:");
							num1=s.nextInt();
							System.out.print("Enter Second Number:");
							num2=s.nextInt();
							result = num1 / num2;
							System.out.print("Result: "+result);
							break;
							
				case '5':	//EXIT
							break;
							
				default:	//INVALID INPUT
							System.out.println("You have entered invalid input.");
							System.out.println("PLEASE USE YOUR EYES AND BRAIN !! THANKYOU!!");
							break;
			}
		}while(op!=5);
	}
}