import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by BSKC3505 on 06/06/2016.
 */
public class HomePageSteps extends BaseMain {


    @Given("^I have open the browser$")
    public void i_have_open_the_browser() throws Throwable {
        System.out.println("Opening Browser");

    }

    @When("^I enter the web address of the website$")
    public void i_enter_the_web_address_of_the_website() throws Throwable {

    }

    @Then("^I am able to see the homepage$")
    public void i_am_able_to_see_the_homepage() throws Throwable {

    }

    @Given("^I am on homepage$")
    public void i_am_on_homepage() throws Throwable {
        HomePage objHP= new HomePage();
        objHP.onHOmePage();

    }

    @When("^I go to the hotel option$")
    public void i_go_to_the_hotel_option() throws Throwable {


    }

    @Then("^I successfully navigate to hotel search page$")
    public void i_successfully_navigate_to_hotel_search_page() throws Throwable {

    }

    @Then("^I successfully navigate to Flight search page$")
    public void i_successfully_navigate_to_Flight_search_page() throws Throwable {

    }

    @Then("^I successfully navigate to Flight and Hotel package search page$")
    public void i_successfully_navigate_to_Flight_and_Hotel_package_search_page() throws Throwable {

    }

    @Then("^I successfully navigate to Car search page$")
    public void i_successfully_navigate_to_Car_search_page() throws Throwable {

    }

    @Then("^I successfully navigate to Deal search page$")
    public void i_successfully_navigate_to_Deal_search_page() throws Throwable {

    }


}
