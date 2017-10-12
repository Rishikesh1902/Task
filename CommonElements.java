//COMMMON ELEMENTS BETWEEN TWO ARRAYS

package task;

import java.util.Scanner;

public class CommonElements 
{
	public static void main(String[] args) 
	{
		//DECLARATION
		int len1=0, len2=0, i, j;		//Initializing variables
		

		System.out.print("===============================================================================\n");
		System.out.print("			ARRAYS PROGRAM - © RISHIKESH SHUKLA			 						 \n");
		System.out.print("===============================================================================\n");
				
		//INPUT
		
		Scanner in = new Scanner(System.in);		//Creating object of Scanner
		System.out.println("Enter the size of array 1: ");
		len1 = in.nextInt();			//assigning value given by user to len1
		
		System.out.println("Enter the size of array 2: ");
		len2 = in.nextInt();			//assigning value given by user to len2
				
		int arr1[] = new int[len1];		//declaring array 1 of size len1
		
		int arr2[] = new int[len2];		//declaring array 2 of size len2
		
		//TAKING THE ELEMENTS FROM THE USER
		System.out.println("Enter the elements of the array 1 : ");
		for(i=0; i<len1; i++)
		{
			arr1[i] = in.nextInt();
		}
		
		//DISPLAYING THE ARRAY ENTERED BY THE USER
		System.out.print("Entered array 1 is : ");
		for(i=0; i<len1; i++)
		{
			System.out.print(arr1[i]+"  ");
		}
		System.out.println();
		
		//TAKING THE ELEMENTS FROM THE USER
		System.out.println("Enter the elements of the array 2 : ");
		for(i=0; i<len2; i++)
		{
			arr2[i] = in.nextInt();
		}
		
		//DISPLAYING THE ARRAY ENTERED BY THE USER
		System.out.print("Entered array 2 is : ");
		for(i=0; i<len2; i++)
		{
			System.out.print(arr2[i]+"  ");
		}
		System.out.println();
					
		//LOGIC & OUTPUT
		System.out.println("\nCommon elements in array 1 and array 2 are: " );
		for(i=0; i<len1; i++)
		{
			for(j=0; j<len2; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print("\n"+arr1[i]+" at index number "+i+" of array 1 and at index number "+j+" of array 2");
				}
			}
		}
		in.close();
	}
}