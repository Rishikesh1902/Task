/*
=================================================

	  AGE CALCULATOR - © RISHIKESH SHUKLA

=================================================
*/

package task;

//IMPORTING CALSSES 
import java.util.Scanner;
import java.util.Calendar;

public class AgeCalculator 
{
	/*
	 	MAIN CLASS
	 */
	public static void main(String [] args)
	{
		
		//INITIALISATION
		int b_yr=0, b_m=0, b_d=0;						//INITIALISING BIRTH YEAR, MONTH, DATE
		int yr=0, m=0, d=0;								//INITIALISING CURRENT YEAR, MONTH, DATE

		String age_l="", age ="";						//Defining String to get the Age which are in String form
		
		int m_d[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		//Respective number of days in each month for non-leap years
		int m_d_l[]={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//Respective number of days in each month for leap years
	
		Scanner sc = new Scanner(System.in);			//Creating Object of Scanner Class 
		
		System.out.print("===============================================================================\n");
		System.out.print("			AGE CALCULATOR - © RISHIKESH SHUKLA			 						 \n");
		System.out.print("===============================================================================\n");
		
		//TAKING BIRTHDATE FROM USER
		System.out.println("\nPlease, Enter the Birthdate as Asked \n");
		
		System.out.print("Enter your Birth Date : ");
		b_d = sc.nextInt();
		
		System.out.print("\nEnter your Birth Month : ");
		b_m = sc.nextInt();
		
		System.out.print("\nEnter your Birth Year : ");
		b_yr = sc.nextInt();
		
		//DISPLAYING BIRTHDATE PROVIDED BY THE USER
		System.out.println("\nBirthdate Entered by You is : "+b_d+"/"+b_m+"/"+b_yr);
		
		//CREATING INSTANCE OF CALENDAR TO GET CURRENT DATE
		Calendar cal = Calendar.getInstance();
		
		yr = cal.get(Calendar.YEAR);			//Initializing the "yr" variable with Current Year
		m = cal.get(Calendar.MONTH)+1;			//Initializing the "m" variable with Current Month
									//Adding 1 to "m" because in development January is taken as '0'
		d = cal.get(Calendar.DAY_OF_MONTH);		//Initializing the "d" variable with Current Date
		
		//DATE VALIDATION 
		if(valid_date(b_d, b_m, b_yr, d, m, yr))	
		{
			//PRINTING TODAYS DATE 
			System.out.println("\nToday's date is : "+d+"/"+m+"/"+yr);
			
			if(leap_yr(yr))						//LEAP YEAR
			{
				age = cal_age(d, b_d, m, b_m, yr, b_yr, m_d);				// OUTPUT IN FORM STRING 
				
				System.out.println("\nYour Age is :"+age);					//PRINTING AGE
				
			}
			else								//NON-LEAP YEAR
			{
				age_l = cal_age_leap(d, b_d, m, b_m, yr, b_yr, m_d_l);		// OUTPUT IN FORM STRING
								
				System.out.println("\nYour age is : "+age_l);				//PRINTING AGE
			}
		}
		else
		{
			if((yr < b_yr) || (m < b_m) || (d < m_d[b_m-1]) || ((d < m_d_l[b_m-1]) && ((b_yr % 400 == 0) || ((b_yr % 4 == 0) && (b_yr % 100 != 0)))))
			{
				System.out.println("\nThis is NOT a TIME MACHINE !!!\nPlease, Enter a VALID DATE !!!!");
			}
			else
			{
				System.out.println("\nPlease, Enter a VALID DATE !!!!");		// INVALID INPUT MESSAGE
			}
		}
			
		sc.close();
	}
	
	/*
	 	DATE VALIDATION CLASS
	*/
	public static boolean valid_date(int birth_date, int birth_month, int birth_year, int date, int month, int year)
	{
		if(year > birth_year)		//Checking Current Year is greater than Birth Year
		{
			if((birth_month>=1) && (birth_month<=12))		//Checking Month Number is between 1 and 12
			{
				//Checking Date of Month with 31 days
				if((birth_date>=1)&&(birth_date<=31) && (birth_month == 1 || birth_month == 3 || birth_month == 5 || birth_month == 7 || birth_month == 8 || birth_month == 10 || birth_month == 12))
					return true;
				//Checking Date of Month with 30 days
				if((birth_date>=1)&&(birth_date<=30) && (birth_month == 4 || birth_month == 6 || birth_month == 9 || birth_month == 11))
					return true;
				//Checking Date of Month February with 28 days
				if((birth_date>=1)&&(birth_date<=28) && (birth_month == 2))
					return true;
				//Checking Date of Month February with 29 days (Leap Year)
				if((birth_date>=1)&&(birth_date<=29) && (birth_month == 2) && ((birth_year % 400 == 0) || ((birth_year % 4 == 0) && (birth_year % 100 != 0))))
					return true;
				else
					return false;
			}
			else
				return false;
		}
		else if(year == birth_year)		//Checking Current Year is equal to Birth Year  
		{
			if((birth_month>=1) && (birth_month<=12))			//Checking Month Number is between 1 and 12
			{
				if((birth_month == month) && (birth_date <= date))		//Checking Birth Month is same as Current Month with Birth Date less than equal to Current Date 
				{
					//Checking Date of Month with 31 days
					if((birth_date>=1)&&(birth_date<=31) && (birth_month == 1 || birth_month == 3 || birth_month == 5 || birth_month == 7 || birth_month == 8 || birth_month == 10 || birth_month == 12))
						return true;
					//Checking Date of Month with 30 days
					if((birth_date>=1)&&(birth_date<=30) && (birth_month == 4 || birth_month == 6 || birth_month == 9 || birth_month == 11))
						return true;
					//Checking Date of Month February with 28 days
					if((birth_date>=1)&&(birth_date<=28) && (birth_month == 2))
						return true;
					//Checking Date of Month February with 29 days (Leap Year)
					if((birth_date>=1)&&(birth_date<=29) && (birth_month == 2) && ((birth_year % 400 == 0) || ((birth_year % 4 == 0) && (birth_year % 100 != 0))))
						return true;

					else
						return false;
				}
				else if (birth_month < month)			//Checking whether Birth Month is less than Current Month
				{
					//Checking Date of Month with 31 days
					if((birth_date>=1)&&(birth_date<=31) && (birth_month == 1 || birth_month == 3 || birth_month == 5 || birth_month == 7 || birth_month == 8 || birth_month == 10 || birth_month == 12))
						return true;
					//Checking Date of Month with 30 days
					if((birth_date>=1)&&(birth_date<=30) && (birth_month == 4 || birth_month == 6 || birth_month == 9 || birth_month == 11))
						return true;
					//Checking Date of Month February with 28 days
					if((birth_date>=1)&&(birth_date<=28) && (birth_month == 2))
						return true;
					//Checking Date of Month February with 29 days (Leap Year)
					if((birth_date>=1)&&(birth_date<=29) && (birth_month == 2) && ((birth_year % 400 == 0) || ((birth_year % 4 == 0) && (birth_year % 100 != 0))))
						return true;
					else
						return false;
				}
				else
				{
					return false;
				}
			}
			else 
				return false;
		}
		else
			return false;
	}
	
	/*
	 	LEAP YEAR CHECKING CLASS
	*/
	public static boolean leap_yr(int y)
	{
		boolean a = (y % 4)==0;
		boolean b = (y % 100) != 0;
		boolean c = (((y % 100) == 0) && ((y % 400) == 0));
			
		return a && (b || c);
	}

	/*
	 	CALCULATION CLASS
	*/
	public static String cal_age(int date, int birth_date, int month, int birth_month, int year, int birth_year, int[] m_dm)
	{
		String cal_age="";										//To get the Age in form of String
		
		int cal_days=0 , cal_month=0 , cal_years=0  ;			//Initializing Variables to hold Age Years, month and days
		
		//BIRTH YEAR LESS THAN CURRENT YEAR
		if(year > birth_year)			
		{
			//CHECKING DATE, so that we can manipulate the Month and Year Values accordingly
			if(date < birth_date)
			{
				date = date + m_dm[month-1];			// As the current date is less than birth date we have to convert current month in number of days 
				month = month - 1;						// As the current month is converted into dates we have to decrease the value of month
				
				cal_days = (date - birth_date)-1;		//Calculating the days of the user
				
				if(month < birth_month)					//Checking month is less than birth month
				{	
					/*
					 As this condition is true we have to convert single year into months, i.e., 12 months
					 And, then we have to decrease the year value as 1 year is converted into 12 months
					 And then simply we have to calculate the User age months and years 
					 */
					month = month + 12;
					year = year - 1;
					
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else if(month == birth_month)			//Checking month is equal to birth month
				{
					/*
					 If the months are same the age month of user will be 0 and simply we can calculate the value of user age year
					 */
					cal_month = 0;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else									//Checking month is greater than birth month
				{
					/*
					 If this condition comes then we have to simply subtract and get the months and years
					 */
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
			}
			else if(date > birth_date)			//Checking the Current Date is Greater than Birth Date
			{
				/*
				 As the current date is greater than birth date then to calculate the age in days we simply calculate by subtracting dates
				 And then as above we will calculate month and age 
				 */
				
				cal_days = date - birth_date;		
				
				if(month < birth_month)						//Current Month is less than Birth month
				{
					month = month + 12;
					year = year - 1;
					
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else if(month == birth_month)				//Current Month is equal to Birth Month
				{
					cal_month = 0;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else										//Current Month is greater than Birth Month
				{
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
			}
			else						//Current Date is equal to Birth Date
			{
				cal_days = 0;
				
				if(month < birth_month)			
				{
					month = month + 12;
					year = year - 1;
					
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else if(month == birth_month)
				{
					cal_month = 0;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else
				{
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
			}
		}
		
		/*
		 As we had checked the condition for Birth Year less than Current Year, and, the condition Current Year greater than Birth Year is not applicable
		 So, now we have to check condition for Birth Year equal to Current Year
		 And, then, we have to calculate the month and year 
		 */
		else if(year == birth_year)
		{
			cal_years=0;
			
			if(month == birth_month)
			{
				cal_month = 0;
				
				if(date > birth_date)
				{
					cal_days = date - birth_date;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else
				{
					cal_days =0;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
			}
			else
			{
				if(date == birth_date)
				{
					cal_month = month - birth_month;
					
					cal_days = 0;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else if(date > birth_date)
				{
					cal_month = month - birth_month;
					
					cal_days = date - birth_date;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else
				{
					date = date + m_dm[month-1];
					month = month - 1;
					
					cal_days = date - birth_date;
					
					cal_month = month - birth_month;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
			}
		}
		
		return cal_age;
	}
	
	/*
	 	CALCULATION WITH LEAP YEAR
	*/
	
	/*
	 The while logic is same as above, i.e., for non-leap year, only the difference is that the array used for getting total number of days 
	 of respective months is changed. Otherwise, whole program is same.
	 */
	public static String cal_age_leap(int date, int birth_date, int month, int birth_month, int year, int birth_year, int[] m_dm_l)
	{
		String cal_age="";
		
		int cal_days , cal_month , cal_years ;
		if(year > birth_year)
		{
			if(date < birth_date)
			{
				date = date + m_dm_l[month-1];
				month = month -1;
				
				cal_days = (date - birth_date)-1;
				
				if(month < birth_month)
				{
					month = month + 12;
					year = year - 1;
					
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else if(month == birth_month)
				{
					cal_month = 0;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else
				{
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
			}
			else if(date > birth_date)
			{
				cal_days = date - birth_date;
				
				if(month < birth_month)
				{
					month = month + 12;
					year = year - 1;
					
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else if(month == birth_month)
				{
					cal_month = 0;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else
				{
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
			}
			else
			{
				cal_days = 0;
				
				if(month < birth_month)
				{
					month = month + 12;
					year = year - 1;
					
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else if(month == birth_month)
				{
					cal_month = 0;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else
				{
					cal_month = month - birth_month;
					
					cal_years = year - birth_year;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
			}
		}
		else if(year == birth_year)
		{
			cal_years=0;
			
			if(month == birth_month)
			{
				cal_month = 0;
				
				if(date > birth_date)
				{
					cal_days = date - birth_date;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else
				{
					cal_days =0;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days \n\nWelcome to this INCREDIBLE WORLD !!!\n\nBut! It really SUCKS !";
				}
			}
			else
			{
				if(date == birth_date)
				{
					cal_month = month - birth_month;
					
					cal_days = 0;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else if(date > birth_date)
				{
					cal_month = month - birth_month;
					
					cal_days = date - birth_date;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
				else
				{
					date = date + m_dm_l[month-1];
					month = month - 1;
					
					cal_days = date - birth_date;
					
					cal_month = month - birth_month;
					
					//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
					cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
				}
			}
		}
		//RETURNING THE AGE VIA CAL_AGE TO MAIN FUNCTION
		return cal_age;
	}
}
