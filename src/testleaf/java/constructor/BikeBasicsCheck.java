package testleaf.java.constructor;

public class BikeBasicsCheck {

	boolean isSideStandOn = false;
	boolean isWarningLightGlows = false;

	BikeBasicsCheck() {
		if (isSideStandOn || isWarningLightGlows) {
			System.out.println("Don't all to start the bike");
		} else {
			startBike();
		}

	}

	BikeBasicsCheck(String browser) {
		if (browser.contains("")) {
			this.isSideStandOn = true;
		}

	}

	public void startBike() {
		System.out.println("Bike started by self");
	}
	
	public void submitForm(){
		System.out.println(isSideStandOn);
	}

}
