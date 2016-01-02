package testleaf.java.composition;

public class matrimoneyConfig {

	private CustomerDetails customerDetails;

	public matrimoneyConfig() {
		this.customerDetails = new CustomerDetails();
		customerDetails.setName("Pavithra");
		customerDetails.setPhotoUrl("www.matiero/server/...");
	}

	public String getName() {
		return customerDetails.getName();
	}

	public String getPhoto() {
		return customerDetails.getPhotoUrl();
	}
}
