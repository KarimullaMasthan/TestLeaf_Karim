package testleaf.java.loops;

public class PracticeForLoops {

	public void forLoop() {
		// Normal for loop , when you know the number of iteration to iterate
		// Use when you are not handling with Collection of objects
		// Syntax => for(int variable=startingCount; variable < max count to
		// iterate; increment variable after count){ }
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

	public void forEachLoop() {

		String[] sArray = { "A for Apple", "B for ball", "C for Cat" };
		// for each loop , when you dpn't know the number of iteration to
		// iterate
		// Use when you are handling with Collection of objects
		// Syntax => for(Object Type you are using : alias name / obj :
		// Collection Object) { }

		for (String sObj : sArray) {

			System.out.println(sObj);

		}
	}

	public void whileLoop() {
		int noOfAttempts = 0;
		// Check the condition and start execution of block
		while (noOfAttempts < 3) {

			System.out.println(" while loops : noOfAttempts");

			noOfAttempts++;

		}

	}

	public void doWhileLoops() {
		// Check the condition at last and run your login at least one time
		boolean isATMPinMatches = true;
		do {
			System.out.println("do While Loops : Give one time option to enter ATM Pin");
		} while (isATMPinMatches = false);

	}

	public static void main(String[] args) {

		PracticeForLoops oPracticeFor = new PracticeForLoops();
		oPracticeFor.forEachLoop();
		oPracticeFor.whileLoop();
		oPracticeFor.doWhileLoops();
	}

}
