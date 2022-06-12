package step.definitions;

import Core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.CapstoneHomePage;
import utilities.Util;

public class CapstoneHomePageStepDef extends Base {
	CapstoneHomePage homePage1 = new CapstoneHomePage();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws InterruptedException {
		homePage1.userOnHomepage();
		logger.info("user on homePage");
		Thread.sleep(5000);
	}

	@When("User click on Currency")
	public void user_click_on_currency() throws InterruptedException {
		homePage1.clickOnCurrncy();
		Thread.sleep(3000);
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() throws InterruptedException {
		homePage1.clickOnEuro();
		logger.info("user click on euro");
		Thread.sleep(3000);
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws InterruptedException {
		homePage1.euroCurrency();
		logger.info("User See The Euro Currency");
		Thread.sleep(3000);
	}
	// *************Shopping Cart************///

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() throws InterruptedException {
		homePage1.clickOnShoppingCart();
		logger.info("user click on shopping cart");
		Thread.sleep(3000);

	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws InterruptedException {
		homePage1.shoppCartIsEmpty();
		Thread.sleep(3000);
		Util.takeScreenShot();

	}
}
