import java.time.Month;

/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class  Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
    static int countsunday = 0;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		int speyear = Integer.parseInt(args[0]);
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
 		
			while (year <= speyear){
				if(year == speyear){
					if(dayOfWeek == 1){
							if(dayOfMonth == 1){
						 		countsunday ++;
							}
							System.out.println(dayOfWeek + "/" + dayOfMonth + "/" + year + "sunday");
						}else{
						 System.out.println(dayOfWeek + "/" + dayOfMonth + "/" + year);
						}
					}
					debugDaysCounter ++;
					advance();
				}
	 			 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	}

	 	//// Write the necessary ending code here
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		dayOfWeek ++;
		dayOfMonth ++;
		if(dayOfWeek == 8){
			dayOfWeek = 1 ;
        } 
		if ((dayOfMonth > nDaysInMonth(month, year))){
			dayOfMonth = 1;
			month ++;
		}
		if (month == 13){
			month = 1;
			year ++;
		}
		// Replace this comment with your code
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		boolean isLeapYear;
	    // Replace the following statement with your code
		isLeapYear = ((year % 400)  == 0);
		isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0 ));
		return isLeapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		int days = 0;
		if((month == 4) || (month == 6) || (month == 9) || (month == 11)){
			days = 30;
		} 
		else if (month == 2){
			if (isLeapYear(year)){
				days = 29;
			}
			else{
				days = 28; 
			}
		}
		else{
			days = 31;
		}
		return days;
		}

		// Replace the following statement with your code
		
}	