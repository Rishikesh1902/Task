//Fibonacci Series using 2 variables only

package pack3;

public class FibonacciSeries_2var		//Defining Class
{
	public static void main(String [] arg)		//Defining void main 
	{
		//input
					//Initializing variables 
		System.out.println("Fibonacci Series");
		//System.out.print("0 1 ");
		int x = 0;
		int y = 1;
		
		//logic and output
		while(true)
		{	if(y>=200)
		{	System.out.print(" " +x);
				break;
		}
		else
		{		System.out.print(" "+x+" "+y);
				x += y;
				y += x;
		}
		}
	}
}