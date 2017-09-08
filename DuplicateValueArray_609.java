//Program to find Duplicate values of an Array Integer Array
package Task6Sep;

import java.util.Arrays;			//importing Arrays file
import java.util.Scanner;			//importing Scanner file

public class DuplicateValueArray_609 
{
	public static void main(String [] args)
	{
		//DECLARATION
		int len=0, i, j;		//Initializing variables
		
		//INPUT
		System.out.println("Enter the array size : ");
		Scanner in = new Scanner(System.in);		//Creating object of Scanner
		len = in.nextInt();			//assigning value given by user to len
		
		int arr[] = new int[len];		//initializing array of size len
		
		System.out.println("Enter the elements of the array : ");
		for(i=0; i<len; i++)
		{
			arr[i] = in.nextInt();
		}
		
		System.out.print("Entered array is : ");
		for(i=0; i<len; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		//LOGIC & OUTPUT
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
	}
}