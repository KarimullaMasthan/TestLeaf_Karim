package testleaf.java.finalkeywore;

public final class PanCardDetails {
	
	public final String panCardNumber = "A1B2C3XX";
	
	public final String spouseName = "Nayanthara";
	
	//We can keep final values as Application URL, User name, Password etc

	
	public String getPandCardDetails(String panCardNumber) {
		System.out.println("PanCardDetails : getPanCardDetails() ");
		return panCardNumber;
		
	}
	
	public final String getPandCardDetailsFinal() {
		System.out.println("PanCardDetails : getPanCardDetailsFianl() ");
		return this.panCardNumber;
		
	}
	
	public final String getSpouceDetails(){
		System.out.println("PanCardDetails : getSpouceDetails() ");
		return panCardNumber;
	}
	
	
	/**
	 * Final Variable can't be override 
	 */
	public void updateMyPanNumber(){
		// this.panCardNumber = "XXXXXXXX";
	}
	
	
}
