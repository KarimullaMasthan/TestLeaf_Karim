package testleaf.java.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RunTimeException {
	
	@CustomizedException(getName = "KARIM", getAge = "26")
	public static void returnMoney(String i) throws UserDefinedException, InterruptedException, FileNotFoundException     {
		
		try {
			FileInputStream fileObj = new FileInputStream("");
			Thread.sleep(800);
			throw new UserDefinedException();
		} finally{
			
		}
		
		
		 
			 
	}

	public static void printRecipt() {
		System.out.println("Print recipt !! ");
	}

	public static void main(String[] args) throws FileNotFoundException, UserDefinedException, InterruptedException  {

		 
			returnMoney(null);

		 
		printRecipt();
	}

}
