package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CartPage extends Basepage {
	
	public CartPage(AndroidDriver driver) {
		super(driver);
	}
	
	//Loactors
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/productName")
	WebElement Jordanname;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/termsButton")
	WebElement longPress;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/alertTitle")
	WebElement alertText;
	
	@AndroidFindBy(className = "android.widget.CheckBox")
	WebElement CheckboxClick;
	
	
	@AndroidFindBy(className = "android.widget.Button")
	WebElement visitweb;
	
	//Action methods
	
	public String jordanVerify() throws InterruptedException {
		Thread.sleep(1000);
		return Jordanname.getText();
	}
	
	public void longpress() {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) longPress).getId(), "duration", 2000));
	}
	
	public String alertText() {
		return alertText.getText();
	}
	
	public void CheckboxClick() {
		CheckboxClick.click();
	}
	
	public void webVisit() {
		visitweb.click();
	}
	
	
}
