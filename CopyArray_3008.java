//Copy one Array into another

package pack3;

public class CopyArray_3008 		//Class declaration
{
	public static void main(String [] args)		//Declaration of void main
	{
		//input
		int a[] = {6, 3, 4, 2, 4, 5, 8};		//Initialization of variable

		System.out.print("Contents of a[] ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
		//logic and output
		//Method 1 - Simple
		int b[] = new int[a.length];
		for(int i=0; i<a.length; i++)
			b[i] = a[i];
		System.out.print("Contents of b[] ");
		for(int i=0; i<b.length; i++)
			System.out.print(b[i]+" ");
		System.out.println();
		
		//Method 2 - Clone
		int c[] = a.clone();
		System.out.print("Contents of c[] ");
		for(int i=0; i<c.length; i++)
			System.out.print(c[i]+" ");
	}
}