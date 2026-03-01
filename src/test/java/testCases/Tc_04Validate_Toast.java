package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class Tc_04Validate_Toast extends BaseClass {
	@Test
	public void Toast() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.LetShop();
		Thread.sleep(1000);
		String Toast=hp.Toast();
		Assert.assertEquals(Toast, "Please enter your name");
				
	}

}
