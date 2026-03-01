package pageObjects;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Basepage {
	
	AndroidDriver driver;
	
	public Basepage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}
	
	//Scrooling to the items
	
	public void GenericScroll(String Text)
	{
	driver.findElement(
		    AppiumBy.androidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		        ".scrollIntoView(new UiSelector().text(\""+ Text +"\"))"
		    )
		);
	}
	
	//Scrolling and click
	public void GenericScrollclick(String Text)
	{
	driver.findElement(
		    AppiumBy.androidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		        ".scrollIntoView(new UiSelector().text(\""+ Text +"\"))"
		        
		    )
		    
		);
	driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\""+Text+"\")")).click();
	}

	//pressback
	public void pressBack() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	//switchingContextToWebview/native
	
	public void switchWEbApp(String context) {
	driver.context(context);
	}
	
	

}
