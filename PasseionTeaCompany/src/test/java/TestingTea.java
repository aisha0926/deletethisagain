import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestingTea {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest tests;

    @Before
    public void setup(){
        System.setProperty(Constants.STRING_DRIVER, Constants.DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        reports = new ExtentReports(Constants.FILE_PATH, true);
        tests = reports.startTest("Starting test");
    }

    @Given("^the correct web address$")
    public void the_correct_web_address() {
        driver.get(Constants.WEB_URL);
        Landingpage a = PageFactory.initElements(driver, Landingpage.class);
        a.click();
        // Write code here that turns the phrase above into concrete actions
        driver.getCurrentUrl().equals(Constants.WEB_URL);

        if( driver.getCurrentUrl().equals(Constants.WEB_URL)){
            tests.log(LogStatus.PASS, "Pass");
        } else{
            tests.log(LogStatus.FAIL, "Failed");
        }
    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page() {
        // Write code here that turns the phrase above into concrete actions
        Menu a = PageFactory.initElements(driver, Menu.class);
        a.click();
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I click the checkout button$")
    public void i_click_the_checkout_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().to("http://www.practiceselenium.com/menu.html");
        Menu b = PageFactory.initElements(driver, Menu.class);

        b.click();
        Checkout a = PageFactory.initElements(driver, Checkout.class);
        a.signUp("asdasd", "asdasd" , "asdasdasd" , "asdasdasd", "asdasdas",
                "asdasdasd");

    }

    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page() {
        // Write code here that turns the phrase above into concrete actions
    }

    @After
    public void tearDown(){
        reports.endTest(tests);
        reports.flush();
        driver.quit();
    }

}
