//Program to Reverse an Array 

package Task6Sep;

import java.util.Scanner;			//importing Scanner file

public class ReverseArrayInt_609 
{
	public static void main(String [] args)
	{
		//DECLARATION
		int len, i, j, temp;			//declaration of variables
		Scanner in = new Scanner(System.in);		//creating object of Scanner to take input from user
		System.out.println("Enter the size of Array : ");
		len = in.nextInt();				//assigning input number to len
		
		int arr[] = new int[len];		//Initializing array with size len
		
		//INPUT
		System.out.print("Enter elements for array : ");
		for(i=0; i<len; i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.println();
		
		System.out.println("Array entered by you : ");
		for(i=0; i<len; i++)
		{
			System.out.print(arr[i]+" \t");
		}
		System.out.println("\n");
		
		//LOGIC
		j = i-1;		// j is pointing at last element
		i = 0;			// i is pointing at first element
		
		while(i<j)					//checking for array is ended or not
		{
			temp = arr[i];			//assigning the element from starting to temp
			arr[i] = arr[j];		//reassigning the element from ending to element from starting
			arr[j] = temp;			//reassigning the temp to element from last
			i++;
			j--;
		}
		
		//OUTPUT
		System.out.println("The Reversed Array is : ");
		for(i=0; i<len; i++)
		{
			System.out.print(arr[i]+" \t");
		}
	}
}