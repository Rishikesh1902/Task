//Program to sum values of Array

package Task6Sep;

import java.util.Scanner;		//importing Scanner class for input

public class SumValueArray_609 
{
	public static void main(String [] args)
	{
		//DECLARATION
		int len, sum=0;				//declaration of variables
		
		//INPUT
		Scanner in = new Scanner(System.in);		//creating object of Scanner to take input from user
		System.out.println("Enter number of elements you want in array : ");
		len = in.nextInt();			//assigning input from user to len 
		int Ar[] = new int [len];		//creating array of size len
		
		//LOGIC
		System.out.println("Enter all the Elements for Array");
		for(int i=0; i<len; i++)		//taking elements from user of array
		{
			Ar[i]=in.nextInt();		//assigning array elements from user 
			sum += Ar[i];			//calculating sum of each elements of array
		}
		
		//OUTPUT
		System.out.println("Sum values of Array : "+sum);
	}
}