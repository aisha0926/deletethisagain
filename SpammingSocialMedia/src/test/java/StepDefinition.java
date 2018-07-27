import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinition {
    WebDriver driver;
    Actions action;

    @Before
    public void setup(){
        System.setProperty(Constants.DRIVER_STRING, Constants.DRIVER_PATH);
        driver = new ChromeDriver();
       // driver.manage().window().maximize();
        action = new Actions(driver);
    }

    @When("^I find the haters account$")
    public void i_find_the_haters_account() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().to(Constants.WEB_URL);
        Thread.sleep(500);
        Login log = PageFactory.initElements(driver, Login.class);
        log.signIn();
        log.logingIn();

    }

    @When("^I click on it$")
    public void i_click_on_it() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	
        int i = 0;
        do {
            i++;
//            WebElement dynamicElement = (new WebDriverWait(driver, 300)).until
//                    (ExpectedConditions.presenceOfElementLocated(By.id("firstName")));
            AccountSearch src = PageFactory.initElements(driver, AccountSearch.class);
//        src.search("allkpop");
        Thread.sleep(3000);
            driver.navigate().to(Constants.WEB_HATER);
            src.search("MAMAMOO IS COMING BACK!" + i);
            Thread.sleep(300);
        } while(i!=10);

    }

    @Then("^I spam messages$")
    public void i_spam_messages(){
        // Write code here that turns the phrase above into concrete actions
    }

    @After
    public void tearDown(){
      //  driver.quit();
    }

}
