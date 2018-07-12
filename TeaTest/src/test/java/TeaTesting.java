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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;

public class TeaTesting {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest tests;

    @Before
    public void setup(){
        System.setProperty(Constants.STRING, Constants.DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        reports = new ExtentReports("/Users/Aisha/deletethisagain/Reporting/TeaTest.html", true);
        tests = reports.startTest("Test if the address is correct");
    }

    @Given("^the correct web address$")
    public void the_correct_web_address() {
        driver.navigate().to(Constants.HOMEPAGE);

        tests.log(LogStatus.INFO, "Testing if the url is matching");
        if(driver.getCurrentUrl().equals(Constants.HOMEPAGE)){
            tests.log(LogStatus.PASS, "Correct web address");
        } else {
            tests.log(LogStatus.FAIL, "Invalid web address");
        }

       assertEquals( "http://www.practiceselenium.com/",
               driver.getCurrentUrl());
    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page()  {
        // Write code here that turns the phrase above into concrete actions
        //driver.navigate().to(Constants.MENU);
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.clicking();
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Actions action = new Actions(driver);
        action.clickAndHold().moveByOffset(40,40).release().perform();
       // action.moveToElement(sl)

    }

    @When("^I click the checkout button$")
    public void i_click_the_checkout_button() {
        // Write code here that turns the phrase above into concrete actions
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.checkOutClick();
    }

    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().to(Constants.CHECK_OUT);

        CheckOutPage check = PageFactory.initElements(driver, CheckOutPage.class);
        check.clickMenuCheckout("asdasd", "asdasdasd", "asdasds",
                "asdasd", "asdasdasd");
    }

    @After
    public void tearDown() throws InterruptedException {
        reports.endTest(tests);
        reports.flush();
        driver.quit();
        Thread.sleep(3000);
    }
}
