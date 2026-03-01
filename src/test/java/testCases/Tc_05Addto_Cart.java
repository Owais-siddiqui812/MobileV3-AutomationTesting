package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class Tc_05Addto_Cart extends BaseClass {
	
	@Test
	public void Addto_Cart() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		hp.Entername();
		hp.LetShop();
		
		ProductPage pg=new ProductPage(driver);
		
		pg.GenericScroll("Jordan 6 Rings");
		pg.jordanClick();
		pg.clickViewCart();
		
		CartPage cp=new CartPage(driver);
		String JordanVerify= cp.jordanVerify();
		
		
		Assert.assertEquals(JordanVerify, "Jordan 6 Rings");
	}

}
