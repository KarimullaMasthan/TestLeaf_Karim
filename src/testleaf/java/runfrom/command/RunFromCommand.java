package testleaf.java.runfrom.command;

public class RunFromCommand {

	// Step 1 : Create any folder in C driver
	// Step 2: Type java code and save it as .java file note not as .java.txt or
	// .txt
	// Step 3: Go to C driver and folder you have created, then type cmd in
	// address bar
	// Step 4: Command prompt will be open then type below command ( Check where
	// your jdk reside and use that path
	// set path=%Path%;C:\Program Files\Java\jdk1.8.0_40\bin
	// Step 5: Type javac <javaFileName which you have saved in step 2> e.g javac RunFromCommand.java
	// Step 6: Verify .class file has been created with same java file name

	public static void main(String[] args) {

		System.out.println("Cool !  I got executed from command prompt ");

	}

}
