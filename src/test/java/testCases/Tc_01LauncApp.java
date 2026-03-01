package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class Tc_01LauncApp extends BaseClass  {
	@Test
	public void launchTest() {
		
		HomePage pp=new HomePage(driver);
		String getname=pp.namefieldVerify();
		System.out.println(getname);
		Assert.assertEquals(getname, "Enter name here");
		
	}
	
}
