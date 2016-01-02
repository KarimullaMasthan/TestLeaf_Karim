package testleaf.java.differentpackModifiers;

import testleaf.java.modifiers.Holidays;

public class PrintHolidayByExtends extends Holidays{

	public static void main(String[] args) {
		// Print public, protected , default holiday
		PrintHolidayByExtends holiday = new PrintHolidayByExtends();

		// print public modifiers
		System.out.println(holiday.publicHolidays);
		// print protected modifiers
		System.out.println(holiday.floatingHolidays);
		// print default modifiers
		System.out.println(holiday.defaultHoliday);
		// print private modifiers -- Compile time error
		System.out.println(holiday.personalLeave);
	}

}
