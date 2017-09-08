//Program to Remove a Specific Element from Array

package Task6Sep;

import java.util.Scanner;			//importing Scanner file

public class RemoveElementArray_609
{
	public static void main(String [] args)
	{
		//DECLARATION
		int len, del, i, c=0;		//Initializing variables 
		
		//INPUT
		Scanner in = new Scanner(System.in);		//creating object of Scanner to take input from user
		System.out.println("Enter number of elements you want in array : ");
		len = in.nextInt();			//assigning input from user to the len
		
		int arr[] = new int[len];	//initializing array of size len
		
		//reading input from user and assigning it to the array elements
		System.out.println("Enter the elements of the array : ");		 
		for(i=0;i<len;i++)
		{
			arr[i]=in.nextInt();
		}
		
		//displaying array entered by user
		System.out.println("Your entered array is : ");
		for (i=0; i<len; i++)
		{
			System.out.println(arr[i]);
		}
		
		//LOGIC
		System.out.println("Enter the element you want to delete : ");
		del = in.nextInt();				//assigning element to delete from user to del
		
		for(i=0; i<len; i++)
		{
			if(arr[i]==del)				//checking if the array element is same as element to be deleted
			{
				for(int j=i; j<(len-1); j++)
				{
					arr[j] = arr[j+1];		//shifting elements to position just before
				}
				c++;
				break;
			}
		}
		
		//OUTPUT
		if(c==0)			//if element to be deleted isn't found
		{
			System.out.println("Entered element not found !!!");
		}
		else
		{
			System.out.println("Entered element Deleted Successfully !!");
			System.out.println("\n Now the New Array is :\n");
			for(i=0; i<(len-1);i++)
			{
				System.out.println(arr[i]+" ");
			}
		}
	}
}