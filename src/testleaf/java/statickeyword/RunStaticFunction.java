package testleaf.java.statickeyword;

public class RunStaticFunction extends StaticWrapper {

	public static void main(String[] args) {
		StaticBlocks staticObj = new StaticBlocks();

		// Bad Approach
		staticObj.showStaticMethod();
		// Good Approach
		StaticBlocks.showStaticMethod();
		
	}
 
	public     void isTextVerified(String text) {
		System.out.println("RunStaticFunction");
	}
}
