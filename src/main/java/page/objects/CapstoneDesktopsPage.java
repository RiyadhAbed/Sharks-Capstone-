package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;

public class CapstoneDesktopsPage extends Base {

	public CapstoneDesktopsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement ShowAllDesktops;

	@FindBy(tagName = "img")
	private List<WebElement> items;

	@FindBy(xpath = "//a[normalize-space()='HP LP3065']")
	private WebElement addToCartHP;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantityField;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addTOCartButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;

	@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[1]//span[1]")
	private WebElement addToCartCanon;

	@FindBy(xpath = "//select[@id='input-option226']//child::option[@value='15']")
	private WebElement dropdownRed;

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement ClickOnCanonEOS5D;

	@FindBy(xpath = "//a[normalize-space()='Write a review']")
	private WebElement clickOnWriteAReviewLink;

	@FindBy(id = "input-name")
	private WebElement yourName;

	@FindBy(xpath = "//*[@id='input-review']")
	private WebElement reviewTextBox;

	@FindBy(xpath = "//input[@name='rating' and @value='5']")
	private WebElement ratingRadionButton;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement clickOncontunioButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewmessageisdisplay;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addtocart;

	public void clickOnDesktopTab() {
		Actions action = new Actions(driver);
		action.moveToElement(desktopTab).build().perform();
	}

	public void clickOnShowAllDesktops() {
		ShowAllDesktops.click();
	}

	public List<WebElement> elements() {
		List<WebElement> DesktopsItems = items;
		return DesktopsItems;
	}

	public void clickOnHPAddToCart() {
		addToCartHP.click();
	}

	public void selectQuantity(String input) {
		quantityField.clear();
		quantityField.sendKeys(input);
	}

	public void clickOnQuantityButton() {
		addTOCartButton.click();
	}

	public boolean validateSucessMessage() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnCanonAddToCard() {
		addToCartCanon.click();
	}

	public void selectColor() {
		dropdownRed.click();
	}

	public void ClickOnCanon() {
		ClickOnCanonEOS5D.click();
	}

	public void clickOnWriteAReviewLink() {
		clickOnWriteAReviewLink.click();
	}

	public void SelectName(String string) {
		yourName.sendKeys("Riyadh Abed");

	}

	public void sendReview(String review) {
		reviewTextBox.sendKeys(review);
	}

	public void selectRatingRadioButton() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		ratingRadionButton.click();
	}

	public void clickOncontunioButton() {
		clickOncontunioButton.click();
	}

	public void reviewmessageisdisplay() {
		reviewmessageisdisplay.isDisplayed();
	}

	public void addtocart() {
		addtocart.click();
	}
}
