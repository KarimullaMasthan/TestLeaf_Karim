
// Package is the 1st most line of your class (Optional)
package testleaf.java.classstructure;

// import lines is the 2nd most line (Optional)

// variable can be declared here (Optional)

// Class name syntax is : Modifier Name Class <ClassName> (NOT Optional)
public class Karim {

	// Method name => Defines what it does
	// Syntax is : Modifier Name return type ( Void or Any Object) method name()
	// (Optional - but it should have at least one else no sense)

	// When the method return type is void nothing will return back
	// This method don't have any arguments to pass
	public void authomationTester() {

	}

	// When the method return type is void nothing will return back
	// This method has two arguments, there is no limit for arguments
	public void supportEngineer(int a, int b) {

	}

	// When the method return type in other than Void we should return something
	// like below
	public String collegeFresher() {

		return null;
	}

	// A single entry door to run your class - The syntax is fixed should not
	// change anything
	public static void main(String[] args) {

		// How to create object for your class and how to call your method

		Karim oKarim = new Karim();
		oKarim.collegeFresher();

	}

}
