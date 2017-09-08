//Sorting 

package Task6Sep;

import java.util.Scanner;
import java.util.Arrays;

public class NumStringArray_609 
{
	public static void main(String [] arg)
	{
		//DECLARATION
		int i, j, len1, len2;
		Scanner in = new Scanner(System.in);		//creating object of Scanner to take input from user
		
		
		//INPUT
		//Integer Array 
		System.out.println("Enter the size of Integer Array : ");
		len1 = in.nextInt();				//assigning input number to len1
		
		int arr1[] = new int[len1];		//Initializing array with size len1 for Integer
		
		System.out.print("Enter elements for Integer array : ");
		for(i=0; i<len1; i++)
		{
			arr1[i] = in.nextInt();
		}
		System.out.println();
		
		System.out.println("Original numerical array : "+Arrays.toString(arr1));
		System.out.println("\n");
		
		//String Array
		System.out.println("Enter the size of String Array : ");
		len2 = in.nextInt();				//assigning input number to len2
		
		String arr2[] = new String[len2];		//Initializing array with size len2 for String
		
		System.out.print("Enter elements for String array : ");
		for(i=0; i<len2; i++)
		{
			arr2[i] = in.nextLine();
		}
		System.out.println();
		System.out.println("Original String Array : "+Arrays.toString(arr2));
		
		System.out.println("\n");
		
		//LOGIC & OUTPUT
		Arrays.sort(arr1);
		System.out.println("Sorted numerical array : "+Arrays.toString(arr1));
		System.out.println();
		Arrays.sort(arr2);
		System.out.println("Sorted String Array : "+Arrays.toString(arr2));
	}
}