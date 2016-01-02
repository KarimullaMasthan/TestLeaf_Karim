package testleaf.java.modifiers;



/**
 * @author Karim
 * We can't access private modifiers 
 * from other class in same package
 *
 */
public class PrintHolidays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print public, protected , default holiday
		Holidays holiday = new Holidays();
		
		// print public modifiers
		System.out.println(holiday.publicHolidays);
		// print protected modifiers 
		System.out.println(holiday.floatingHolidays);
		// print default modifiers
		System.out.println(holiday.defaultHoliday);
		//print private modifiers -- Compile time error
//		System.out.println(holiday.personalLeave);
		

	}

} 
