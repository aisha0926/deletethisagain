import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class StepDefinition {
    WebDriver driver;
    String url;

    @Before
    public void setup(){
        System.setProperty(Constants.WEBTHING, Constants.DRIVERPATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Given("^I go to \"([^\"]*)\" website$")
    public void i_go_to_website(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        driver.get(arg1);
        url = driver.getCurrentUrl();
    }

    @When("^I search for \"([^\"]*)\" keyword$")
    public void i_search_for_keyword(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        Homepage a = PageFactory.initElements(driver, Homepage.class);
        a.search(arg1);
    }

    @Then("^I am taken to the page$")
    public void i_am_taken_to_the_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        int i = 30;
        do {
            i--;
            driver.navigate().to("https://en.wikipedia.org/wiki/Mamamoo");
            Thread.sleep(30000);
            driver.navigate().to(Constants.WEBURL);
           driver.navigate().to("https://www.youtube.com/watch?v=pHtxTSiPh5I");
            Thread.sleep(80000);
        } while (i!=0);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
