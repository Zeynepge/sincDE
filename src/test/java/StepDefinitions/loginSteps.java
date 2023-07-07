package StepDefinitions;

import Pages.items;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginSteps {
    items item=new items();

    @Given("Navigate to Webseite")
    public void navigateToWebseite() {
        GWD.getDriver().get("https://www.sinc.de/");
    }


    @When("Cookies Accept")
    public void cookiesAccept()
    {
        item.accept.click();
    }
}
