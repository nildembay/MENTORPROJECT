package ui.stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonWebElements;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;


public class TC01StepDefinitions {
    AmazonWebElements pages =new AmazonWebElements();

    @When("user goes to Amazon Home Page")
    public void user_goes_to_amazon_home_page() {
        Driver.getDriver().
                get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("user clicks signin button")
    public void user_clicks_signin_button() throws InterruptedException {
        Thread.sleep(1000);
        Actions actions=new Actions(Driver.getDriver()) ;

        actions.moveToElement(pages.mainMenu).
                click(pages.signInButton).perform();


    }

    @Then("user enters invalid email")
    public void users_enters_invalid_email() {

        pages.emailtextbox.sendKeys(ConfigReader.getProperty("invalidemail"));

    }

    @Then("clicks continue button")
    public void clicks_continue_button() {
        pages.continueButton.click();

    }

    @Then("checks that the error message is displayed")
    public void checks_that_the_error_message_is_displayed() {

        Assert.assertTrue(pages.errorMessage.isDisplayed());

    }
}
