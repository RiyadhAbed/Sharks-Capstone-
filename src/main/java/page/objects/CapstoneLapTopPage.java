package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;

public class CapstoneLapTopPage extends Base {
	public CapstoneLapTopPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement clickeOnTestEnvironment;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickOnlaptopNotebooksTab;

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement clickeOnMacBookitem;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clickToAddToCart;

	@FindBy(xpath = "//*[text()='Success: You have added ']")
	private WebElement theSuccessMassage;

	@FindBy(xpath = "//*[text()=' 1 item(s) - $602.00']")
	private WebElement SeeOneItemInItemsOption;

	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement ClickOnCartOption;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement clickOnRemovetheitems;

	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement noItemsAddtothecart;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement macBookCompareButton;

	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
	private WebElement makBookAirCompareButton;

	@FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
	private WebElement succesAddMacBookAirtoProductCompare;

	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement clickOnproductComprison;

	@FindBy(xpath = "/html/body/div[2]")
	private WebElement productCompareItem;

	@FindBy(xpath = "//div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement clickOnwishbutton;

	@FindBy(xpath = "//*[text()=' You must ']")
	private WebElement youMustLogin;

	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement clickOnMacBookPro;

	@FindBy(xpath = "//h2[normalize-space()='$2,000.00']")
	private WebElement userCanSeeThePrice$2000;

	public void clickeOnTestEnvironment() {
		clickeOnTestEnvironment.click();
	}

	public void clickOnlaptopNotebooksTab() {
		clickOnlaptopNotebooksTab.click();
	}

	public void clickOnshowAllLaptopsNoteBooks() {
		showAllLaptopsAndNotebooks.click();

	}

	public void clickeOnMacBookitem() {
		clickeOnMacBookitem.click();
	}

	public void clickToAddToCart() {
		clickToAddToCart.click();

	}

	public boolean theSuccessMassage() {
		if (theSuccessMassage.isDisplayed())
			return true;
		else
			return false;
	}

	public void SeeOneItemInItemsOption() {
		SeeOneItemInItemsOption.isDisplayed();
	}

	public void ClickOnCartOption() {
		ClickOnCartOption.click();
	}

	public void clickOnRemovetheitems() {
		clickOnRemovetheitems.click();
	}

	public void noItemsAddtothecart() {
		noItemsAddtothecart.isDisplayed();
	}

	public void clickOnProductComparisonMacBook() {
		macBookCompareButton.click();
	}

	public void clickOnProductComparisonMacBookAir() {
		makBookAirCompareButton.click();
	}

	public void succesAddMacBookAirtoProductCompare() {
		succesAddMacBookAirtoProductCompare.isDisplayed();
	}

	public void clickOnproductComprison() {
		clickOnproductComprison.click();
	}

	public void productCompareItem() {
		productCompareItem.isDisplayed();
	}

	public void clickOnwishbutton() {
		clickOnwishbutton.click();
	}

	public void youMustLogin() {
		youMustLogin.isDisplayed();
	}

	public void clickOnMacBookPro() {
		clickOnMacBookPro.click();
	}

	public void userCanSeeThePrice$2000() {
		userCanSeeThePrice$2000.isDisplayed();
	}

}
