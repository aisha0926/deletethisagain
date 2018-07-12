import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    WebDriver driver;

    @Before
    public void setup(){
        System.setProperty( Constant.WEBDRIVER , Constant.DRIVERPATHH);
        driver = new ChromeDriver();
    }





}
