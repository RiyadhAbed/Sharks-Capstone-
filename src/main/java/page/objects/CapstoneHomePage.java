package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;

public class CapstoneHomePage extends Base {
	public CapstoneHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement userOnHomepage;
	@FindBy(xpath = "//*[text()='Currency']")
	private WebElement clickOnCurrncy;
	@FindBy(xpath = "//button[@type='button']")
	private WebElement clickOnEuro;
	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement euroCurrency;
	@FindBy(xpath = "//span[text()='Shopping Cart']")

	// *************Shopping Cart********//
	private WebElement clickOnShoppingCart;
	@FindBy(xpath = "//*[@id=\"content\"]/p")
	private WebElement shoppCartIsEmpty;

	public void userOnHomepage() {
		userOnHomepage.click();
	}

	public void clickOnCurrncy() {
		clickOnCurrncy.click();
	}

	public void clickOnEuro() {
		clickOnEuro.click();
	}

	public void euroCurrency() {
		euroCurrency.isDisplayed();
	}

	// *************Shopping Cart************///

	public void clickOnShoppingCart() {
		clickOnShoppingCart.click();
	}

	public void shoppCartIsEmpty() {
		shoppCartIsEmpty.isDisplayed();
	}

}
