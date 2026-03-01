package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class Tc_02Letshop extends BaseClass {
	
	@Test
	public void LetsShop() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		
		hp.Entername();
		hp.LetShop();
		
		ProductPage pp=new ProductPage(driver);
		
	
		
		String verifyproduct=pp.verifyProduct();
		System.out.println(verifyproduct);
		
		Assert.assertEquals(verifyproduct, "Products");
	}

	
}
