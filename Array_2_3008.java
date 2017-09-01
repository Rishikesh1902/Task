//Compare length of 2 arrays and display longer array

package pack3;					

public class Array_2_3008				//Class Declaration
{
	public static void main(String [] args)			//void main declaration 
	{
		//input
		int a[]={6, 3, 4, 2, 4, 5, 8};				//Initializing array 1 and assigning value to it
		int b[]={7, 4, 7, 4, 4, 5, 3, 7, 4};		//Initializing array 2 and assigning value to it
		int c, d;									//Initializing variable 
		c = a.length;								//assigning array 1 length to variable
		d = b.length;								//assigning array 2 length to variable
		
		//logic and output
		if(c>d)					//Checking the length of array
		{
			System.out.println("A is the longer array");
			for(int i=0; i<c; i++)
				System.out.print(a[i]+ " ");
		}
		else if(c<d)
		{
			System.out.println("B is the longer array");
			for(int i=0; i<d; i++)
				System.out.print(b[i]+ " ");
		}
		else
		{
			System.out.println("Both String are of same length");
			System.out.print("String a[]:");
			for(int i=0; i<c; i++)
				System.out.print(a[i]+ " ");
			System.out.println();
			System.out.print("String b[]:");
			for(int x=0; x<d; x++)
				System.out.print(b[x]+ " ");
		}
	}
}