// FIND PAIR OF ELEMENTS IN AN ARRAY WHOSE SUM IS EQUAL TO SPECIFIED NUMBER

package task;

import java.util.Scanner;

public class SumEqualToElement 
{
	public static void main(String[] args) 
	{
		//DECLARATION
		int len=0, i, j, no;		//Initializing variables
		

		System.out.print("===============================================================================\n");
		System.out.print("			ARRAYS PROGRAM - © RISHIKESH SHUKLA			 						 \n");
		System.out.print("===============================================================================\n");
		
		//INPUT
		Scanner sc = new Scanner(System.in);		//Creating object of Scanner
		
		System.out.print("Enter the size of array : ");
		len = sc.nextInt();							//assigning value given by user to len
		
		int arr[] = new int[len];					//declaring arr with size of len
		
		//TAKING THE ELEMENTS FROM THE USER
		System.out.println("\nEnter the Array Elements : ");
		for(i=0; i<len; i++)
		{
			arr[i] = sc.nextInt();
		}
		//DISPLAYING THE ARRAY ENTERED BY THE USER
		System.out.print("Entered array  is : ");
		for(i=0; i<len; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
		//Taking the number which is to be compared with the sum of pair of elements
		System.out.print("\nEnter the number to which the Sum of Pair of Elements has to same : ");
		no = sc.nextInt();
		
		//LOGIC & OUTPUT
		System.out.println("\nPair of Elements whose Sum is equal to Specified Element are :\n");
		for(i=0; i<len; i++)
		{
			for(j=i+1; j<len; j++)
			{
				if((arr[i] + arr[j]) == no)
				{
					System.out.println(arr[i]+" at index "+i+" and "+arr[j]+"at index "+j+" are equal to "+no);
				}
			}
		}
		sc.close();			//closing the Scanner class
	}
}
