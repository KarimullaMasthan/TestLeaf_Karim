package testleaf.java.exceptionhandling;

public class UserDefinedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public  UserDefinedException(){
		System.out.println("default exception ");
	}
	
	public  UserDefinedException(String exceptionName){
		System.out.println("default exception -  "+exceptionName);
	}
	
	
}
