package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import pageObjects.finalPurchase;
import testBase.BaseClass;

public class Tc_07CompletePurchase extends BaseClass {
	
	@Test
	
	public void Complete() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.Entername();
		hp.LetShop();
		
		ProductPage pg=new ProductPage(driver);
		
		pg.GenericScroll("Jordan 6 Rings");
		pg.jordanClick();
		pg.clickViewCart();
		
		CartPage cp=new CartPage(driver);
		
		cp.CheckboxClick();
		cp.webVisit();
		Thread.sleep(3000);
		
		Set <String>context=driver.getContextHandles();
		
		for(String contextName:context) {
			System.out.println(contextName);
		}
		
		finalPurchase fp=new finalPurchase(driver);
		
		fp.switchWEbApp("WEBVIEW_com.androidsample.generalstore");
		fp.sendText();
		fp.pressBack();
		Thread.sleep(1000);
		
		hp.switchWEbApp("NATIVE_APP");
		
		String verify=hp.namefieldVerify();

		Assert.assertEquals(verify, "Enter name here");
	}

}
