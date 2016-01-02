package testleaf.java.exceptionhandling;

public class RuntimeExceptionPractice {

	 public static void main(String[] args) throws ArithmeticException {
		try {
			int a = 10;
			System.out.println(a / 0);
		}catch (ArithmeticException e) {
			System.out.println("am in catch");
		}finally {
			System.out.println("am in final");
		}
		
		System.out.println("Exception done");
	}
	 
	 public static void main(String[] args, int aq) throws ArithmeticException {
			try {
				int a = 10;
				System.out.println(a / 0);
			}catch (ArithmeticException e) {
				System.out.println("am in catch 2 ");
			}finally {
				System.out.println("am in final 2");
			}
			
			System.out.println("Exception done 2");
		}

}
