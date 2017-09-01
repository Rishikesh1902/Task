//Fibonacci Series using 2 variables only

package pack3;

public class FibonacciSeries_3008		//Defining Class
{
	public static void main(String [] arg)		//Defining void main 
	{
		//input
		int nxt = 0;				//Initializing variables 
		System.out.println("Fibonacci Series");
		System.out.print("0 1 ");
		int x = 0;
		int y = 1;
		
		//logic and output
		for(int i = 1; i<200; i++)
		{
			nxt = x + y;
			if(nxt<200)
			{
				System.out.print(nxt+ " ");
				x = y;
				y = nxt;
			}
		}
	}
}