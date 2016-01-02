package testleaf.java.finalkeywore;



/**
 * @author Karim
 * Alt + Shif + J // Will help to add doc comments
 * extends FinalClass Not Allowed
 * 
 */
public class RunMyFinalClass extends FinalClass {
	
	 
	/**
	 * @param args
	 * We can directly use final method but can't override it
	 */
	public static void main(String[] args) {
		
		FinalClass finalObj = new FinalClass();
		
		PanCardDetails panObj = new PanCardDetails();
		
		finalObj.nonFinalMetod();
		
		finalObj.finalMetod();
		
		System.out.println(panObj.getPandCardDetails("XXXXX"));
		
		panObj.getSpouceDetails();

	}
	
	
	/* (non-Javadoc)
	 * @see testleaf.java.finalkeywore.FinalClass#finalMetod()
	 * Compiletime exception since we are trying to override it
	 */
/*	public   void finalMetod() {
		System.out.println("I am in FinalClass : finalMetod()  ");
	}*/
	
	
	

}
