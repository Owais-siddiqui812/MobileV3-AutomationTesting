package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductPage extends Basepage{
	
	
	public ProductPage(AndroidDriver driver) {
		super(driver);
	}
	
	//locator
	
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/toolbar_title\")")
	WebElement VerfiyProduct;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/productName")
	List<WebElement> items;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/productAddCart")
	List<WebElement> addtoCartButtons;
	
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	WebElement viewCart;
	
	//actionmethods
	
	public String verifyProduct() {
		return VerfiyProduct.getText();
	}
	public void jordanClick() {
		for(int i=0;i<=items.size();i++) {
			String ProductName=items.get(i).getText();
			if(ProductName.equalsIgnoreCase("Jordan 6 Rings")) {
				addtoCartButtons.get(i).click();
				break;
			}
		}
	}
	
	public void clickViewCart() {
		viewCart.click();

	}
}
