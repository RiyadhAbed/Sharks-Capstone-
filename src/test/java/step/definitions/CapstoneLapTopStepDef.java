package step.definitions;

import org.junit.Assert;

import Core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.CapstoneLapTopPage;
import utilities.Util;

public class CapstoneLapTopStepDef extends Base {
	CapstoneLapTopPage laptopPage = new CapstoneLapTopPage();

	@Given("User is on Retail website {string}")
	public void user_is_on_retail_website(String string) {
		laptopPage.clickeOnTestEnvironment();
		logger.info("user clicked on Retail website");
	}

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws InterruptedException {
		laptopPage.clickOnlaptopNotebooksTab();
		logger.info("user clicked on laptop &NoteBook tab");
		Thread.sleep(2000);
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws InterruptedException {
		laptopPage.clickOnshowAllLaptopsNoteBooks();
		logger.info("user click on show all Laptop &NoteBook option");
		Thread.sleep(2000);
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() throws InterruptedException {
		laptopPage.clickeOnMacBookitem();
		logger.info("user click on MacBook item");
		Thread.sleep(2000);
	}

	@When("User click add to Cart button for Mac Book")
	public void user_click_add_to_cart_button_for_mac_book() throws InterruptedException {
		laptopPage.clickToAddToCart();
		logger.info("user Add MacBook To Cart");
		Thread.sleep(2000);
	}

	@Then("User should see a messagee {string}")
	public void user_should_see_a_messagee(String string) throws InterruptedException {
		Assert.assertTrue(laptopPage.theSuccessMassage());
		Thread.sleep(2000);

	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) throws InterruptedException {
		laptopPage.SeeOneItemInItemsOption();
		logger.info("user can see one Item in the items");
		Thread.sleep(2000);
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() throws InterruptedException {
		laptopPage.ClickOnCartOption();
		logger.info("user click on item Button");
		Thread.sleep(2000);
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws InterruptedException {
		laptopPage.clickOnRemovetheitems();
		logger.info("user can click on remove button");
		Thread.sleep(2000);
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) throws InterruptedException {
		laptopPage.noItemsAddtothecart();
		logger.info("user see their is no items add to the cart");
		Thread.sleep(2000);
	}

	///////////// Scenario: Product Comparison////////////////
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
		laptopPage.clickOnProductComparisonMacBook();
		logger.info("macbook product comparison button clicked");
		Thread.sleep(2000);
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
		laptopPage.clickOnProductComparisonMacBookAir();
		logger.info("user click on macbookAir comparison button");
		Thread.sleep(2000);
	}

	@Then("User should see a message {string}'")
	public void user_should_see_a_message(String string) throws InterruptedException {
		laptopPage.succesAddMacBookAirtoProductCompare();
		logger.info("user can see add successfulle to product comparison");
		Thread.sleep(2000);
	}

	@When("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
		laptopPage.clickOnproductComprison();
		logger.info("user can click on product comparison");
		Thread.sleep(2000);
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws InterruptedException {
		laptopPage.productCompareItem();
		logger.info("user can see items in product compare chart");
		Thread.sleep(2000);
	}

	///////////// Adding an item to Wish list//////////////
	@When("User click on heart icon to add 'Sony VaIO' laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list() throws InterruptedException {
		laptopPage.clickOnwishbutton();
		logger.info("user add Sony VaIO to wish list");
		Thread.sleep(5000);
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list()
			throws InterruptedException {
		laptopPage.youMustLogin();
		logger.info("user need to login to his account");
		Thread.sleep(5000);
	}

	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) throws InterruptedException {
		laptopPage.clickOnwishbutton();
		Thread.sleep(5000);
	}
	/////// Scenario: Validate the price of MacBook Pro is '2000'/////

	@When("User click on {string} item")
	public void user_click_on_item(String string) throws InterruptedException {
		laptopPage.clickOnMacBookPro();
		logger.info("user click on macBook Pro");
		Thread.sleep(2000);
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) throws InterruptedException {
		laptopPage.userCanSeeThePrice$2000();
		logger.info("user can see the price is $2000");
		Thread.sleep(2000);
		Util.takeScreenShot();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
