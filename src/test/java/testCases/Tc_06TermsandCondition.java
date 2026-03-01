package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class Tc_06TermsandCondition extends BaseClass{

	@Test
public void Terms() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		hp.Entername();
		hp.LetShop();
		
		ProductPage pg=new ProductPage(driver);
		
		pg.GenericScroll("Jordan 6 Rings");
		pg.jordanClick();
		pg.clickViewCart();
		
		CartPage cp=new CartPage(driver);
		String JordanVerify= cp.jordanVerify();
		
		cp.longpress();
		
		String AlertText=cp.alertText();
		
		Assert.assertEquals(AlertText, "Terms Of Conditions");
		
}
}