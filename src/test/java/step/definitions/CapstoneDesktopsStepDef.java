package step.definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import Core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.CapstoneDesktopsPage;
import utilities.Util;

public class CapstoneDesktopsStepDef extends Base {
	CapstoneDesktopsPage desktopsPage = new CapstoneDesktopsPage();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() throws InterruptedException {
		desktopsPage.clickOnDesktopTab();
		logger.info("user clicked on Desktops tab");
		Thread.sleep(2000);

	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() throws InterruptedException {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("user clicked on Show all Desktops");
		Thread.sleep(2000);
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws InterruptedException {

		List<WebElement> items = desktopsPage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + " is present in this page");
			Thread.sleep(2000);
			Util.takeScreenShot();
		}
		
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String quantityValue) throws InterruptedException {
		desktopsPage.selectQuantity(quantityValue);
		logger.info("user enter quantity " + quantityValue);
		Thread.sleep(2000);
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String expectedmessageValue) throws InterruptedException {

		Assert.assertTrue(desktopsPage.validateSucessMessage());
		Thread.sleep(2000);

	}

	@When("User click  ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() throws InterruptedException {
		desktopsPage.clickOnHPAddToCart();
		logger.info("User clicked on add to card Option on HP LP3065");
		Thread.sleep(2000);

	}

	@When("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() throws InterruptedException {
		desktopsPage.clickOnCanonAddToCard();
		logger.info("User click  ADD TO CART option on Canon EOS 5D item");
		Thread.sleep(2000);
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() throws InterruptedException {
		desktopsPage.selectColor();
		logger.info("User select color from dropdown Red");
		Thread.sleep(2000);
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() throws InterruptedException {
		desktopsPage.ClickOnCanon();
		logger.info("User click on Canon EOS 5D item");
		Thread.sleep(2000);

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() throws InterruptedException {
		desktopsPage.clickOnWriteAReviewLink();
		logger.info("User click on write a review link");
		Thread.sleep(2000);
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<Map<String, String>> infoList = dataTable.asMaps(String.class, String.class);
		desktopsPage.SelectName(infoList.get(0).get("youname"));
		desktopsPage.sendReview(infoList.get(0).get("reviewtext"));
		desktopsPage.selectRatingRadioButton();
		Thread.sleep(2000);

	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() throws InterruptedException {
		desktopsPage.clickOncontunioButton();
		logger.info("user click on continue Button");
		Thread.sleep(2000);

	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) throws InterruptedException {
		desktopsPage.reviewmessageisdisplay();
		logger.info("user can see the message");
		Thread.sleep(2000);
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() throws InterruptedException {
		desktopsPage.addtocart();
		logger.info("User clicked on Add to cart Button");
		Thread.sleep(2000);
	}

}
