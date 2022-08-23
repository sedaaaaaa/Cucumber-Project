package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class TechfiosStepDefinitons extends TestBase {

	
	LoginPage loginPage;
	DatabasePage databasePage;

	@Before
	public void beforeRun() {

		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}

	@Given("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {
		driver.get("https://techfios.com/test/billing/?ng=admin/");

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String userName) {

		loginPage.enterUserName(userName);

	}

	@When("^User enters \"([^\"]*)\" from techfios database$")
	public void user_enters_from_techfios_database(String loginData) {
		switch (loginData) {
		case "username":
			loginPage.enterUserName(databasePage.getData("username"));
			System.out.println("username from DB:" + databasePage.getData("username"));
			break;
		case "password":
			loginPage.enterPassword(databasePage.getData("password"));
			   System.out.println("password from DB:" + databasePage.getData("password"));
			System.out.println("password from DB:" + databasePage.getData("password"));

			break;

		default:
			System.out.println("Unable to enter login data from DB!");

		}
	}

	@When("^User enters password as \"([^\"]*)\"$") 
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() {
		loginPage.signIn();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws IOException {
		// Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
		takeScreenshot(driver);
	}

	@Then("^User should not land on dashboard page$")
	public void user_should_not_land_on_dashboard_page() {
		Assert.assertNotSame("Login- iBilling", loginPage.getPageTitle());
	}
	
	@After
	public void TearDown() {
		driver.close();
		driver.quit();

	}

}