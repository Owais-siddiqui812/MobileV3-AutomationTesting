package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Basepage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class Tc_03Us_Select extends BaseClass {

	@Test
	public void Tc_03() throws InterruptedException {
		Basepage p = new Basepage(driver);

		p.GenericScrollclick("United States");
		HomePage hp = new HomePage(driver);

		hp.Entername();
		hp.LetShop();

		ProductPage pp = new ProductPage(driver);

		String verifyproduct = pp.verifyProduct();
		System.out.println(verifyproduct);

		Assert.assertEquals(verifyproduct, "Products");
	}

}
