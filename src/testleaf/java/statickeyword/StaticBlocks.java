package testleaf.java.statickeyword;

public class StaticBlocks{
	
	/*
	 * 1. Static block with static { ... }
	 * 2. Static variables , Static string var = "";
	 * 3. Static blocks or methods
	 * 4. Empty block without static , even there is no static keyword
	 * 5. Constructors
	 * 6. Normal methods and variables
	 */
	
	/*
	 * Static is the 1st most runnable block
	 */
	static {
		System.out.println(" I am in static block ");
	}
	
	/*
	 * This is the 3rd most runnable block
	 */
	{
		System.out.println(" I am in empty block, this also consider as static block with priority 2 ");
	}
	
	/*
	 * This is the 2nd most runnable block
	 */
	public static String name = "I am static variable ";
	
	
	/*
	 * This is like normal method, the only
	 * difference can use without creating object
	 */
	public  static void showStaticMethod(){
		System.out.println("I am static method"); 
	}
	
	/*
	 * Constructor will be loaded only when creating / new object
	 */
	public StaticBlocks() {
		System.out.println(" I am in constructor , this will execute after all statics");
	}
	
	
	public static void main(String[] args) {
		StaticBlocks staticObj = new StaticBlocks();
		staticObj.showStaticMethod();
	}
}