package testBase;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {

	public AndroidDriver driver;
	
	
	@BeforeClass
	public void Appiumconfig() throws MalformedURLException, URISyntaxException {
		
		UiAutomator2Options options=new UiAutomator2Options();
		
		options.setDeviceName("emulator-5554");
		options.setApp("C://Workspace//Jan2026Batch//MobileV3ow//resources//General-Store.apk");
		//"C:\Users\Owais\Downloads\Tools\chromedriver-win641\chromedriver.exe"
		
		options.setChromedriverExecutable("C://Users//Owais//Downloads//Tools//chromedriver-win641//chromedriver.exe");
		driver  = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
