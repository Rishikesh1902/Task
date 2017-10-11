//NUMBER IS EVEN OR NOT WITHOUT USING PREDEFINED FUNCTION OR % OR /

package task;
import java.util.Scanner;

public class even_no 
{
	public static void main(String[] args) 
	{
		//INITALIZATION
		char j;
		String num; 
		int  i;
		
		//INPUT
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number to know whether number is even or not :");
		num=sc.nextLine();
		i = num.length()-1;
		j=num.charAt(i);
		System.out.println();
		
		//LOGIC & OUTPUT
		if(j == '0' || j == '2' || j == '4' || j == '6' || j == '8')
		{
			System.out.println(num+" is even");
		}
		else
		{
			System.out.println(num+" is odd");
		}
		
		sc.close();
	}

}