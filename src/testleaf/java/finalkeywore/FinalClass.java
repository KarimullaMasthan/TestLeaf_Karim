package testleaf.java.finalkeywore;

/**
 * @author Karim Final Class, which can't be extend / inherited
 *
 */
public  class FinalClass {

	public final String panCardNumber = "A1B2C3XX";
	public void nonFinalMetod() {
		System.out.println("I am in FinalClass : finalMetod()  ");
	}
	
	
	public  final void finalMetod() {
		System.out.println("I am in FinalClass : finalMetod()  ");
	}

}
