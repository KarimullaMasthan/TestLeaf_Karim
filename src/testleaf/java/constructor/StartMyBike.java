package testleaf.java.constructor;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartMyBike {

	public static void main(String[] args) {

		// BikeBasicsCheck checkBike = new BikeBasicsCheck();
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").click();
		List<WebElement> listOfElement = driver.findElementsById("");
		for (WebElement googleList : listOfElement) {

			if (googleList.isDisplayed()) {
				System.out.println("Print the list :  " + googleList.getText());
			}

		}
	}

}
