package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class finalPurchase extends Basepage{

	public finalPurchase(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

 //locator
	
	@FindBy(name="q")
	WebElement button;
	
	
	
//action
	
	public void sendText() {
		button.sendKeys("owl");
		button.sendKeys(Keys.ENTER);
	}
}
