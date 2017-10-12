// PROGRAM TO DELETE DUPLICATE ELEMENT IN ARRAY

package task;

import java.util.Scanner;

public class RemoveDuplicateArray 
{
	public static void main(String[] args) 
	{
		//DECLARATION
		int len=0, i, j;		//Initializing variables
		
		System.out.print("===============================================================================\n");
		System.out.print("			ARRAYS PROGRAM - © RISHIKESH SHUKLA			 						 \n");
		System.out.print("===============================================================================\n");
				
		//INPUT
		System.out.println("Enter the array size : ");
		Scanner in = new Scanner(System.in);		//Creating object of Scanner
		len = in.nextInt();			//assigning value given by user to len
				
		int arr[] = new int[len];		//declaring array of size len
		
		//TAKING THE ELEMENTS FROM THE USER
		System.out.println("Enter the elements of the array : ");
		for(i=0; i<len; i++)
		{
			arr[i] = in.nextInt();
		}
		
		//DISPLAYING THE ARRAY ENTERED BY THE USER
		System.out.print("Entered array is : ");
		for(i=0; i<len; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
				
		//LOGIC 
		
		//Printing the Repeated Elements in Arrays
		System.out.println("Repeated elements in array are: " );
		for(i=0; i<len; i++)
		{
			for(j=i+1; j<len; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
		
		int len1 = arr.length;		//Initializing new variable with array length to make manipulation
		
		
		//Checking and Deleting Duplicate Elements in array
		for(i=0; i<len1;i++)
		{
			for(j=i+1; j<len1; j++)
			{
				if(arr[i] == arr[j])
				{
					arr[i] = arr[len1-1];
					len1--;
					j--;
				}
			}
		}
		
		int arr1[] = new int [len1];		//Creating new array of length with unique number of elements
		
		//Initializing arr1 with unique number of elements
		for(i=0; i<len1; i++)
		{
			arr1[i] = arr[i];
		}
		
		//OUTPUT
		
		//Printing Array with Unique Elements
		System.out.println("\nArray after deleting Duplicate values : ");
		for(i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		in.close();		//closing the Scanner class
	}
}