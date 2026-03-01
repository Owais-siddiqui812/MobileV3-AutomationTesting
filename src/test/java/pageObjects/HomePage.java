package pageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends Basepage{
	
	public HomePage(AndroidDriver driver) {
		super(driver);
	}
	
	//locators
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	WebElement Namefield;
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	WebElement Letshop;
	
	@AndroidFindBy(xpath="(//android.widget.Toast)[1]")
	WebElement Toast;
	
	//actionMethods
	public String namefieldVerify() {
		return Namefield.getText();
	}
	
	public void Entername() {
		Namefield.sendKeys("owais");
	}
	public void LetShop() throws InterruptedException {
		Thread.sleep(1000);
		Letshop.click();
	}
	public  String Toast() {
		return Toast.getText();
	}

}
