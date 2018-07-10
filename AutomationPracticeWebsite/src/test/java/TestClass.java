import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestClass {
    ChromeDriver driver;
    ExtentReports report;
    ExtentTest test;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Development/web_driver/chromedriver");
        driver = new ChromeDriver();

        report = new ExtentReports("/Users/Aisha/deletethisagain/Reporting/Clothingreport.html", true);
        test = report.startTest("Testing the title");
        test.log(LogStatus.INFO, "Verifying searched word");
    }

    @Test
    public void methodTest() {

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        Mainpage page = PageFactory.initElements(driver, Mainpage.class);
        page.searchBar("Dress");

        test.log(LogStatus.INFO, "Testing the keyword");
        if(driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText().equals("\"DRESS\"")){
            test.log(LogStatus.PASS, "Matched keyword");
        } else {
            test.log(LogStatus.FAIL, "Not matched word");
        }
        //Adding double quotes around a string by adding \" \" around the string you want it to be added
        assertEquals("\"DRESS\"", driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText());
    }

    @After
    public void tearDown(){
        report.endTest(test);
        report.flush();
        driver.quit();
    }
}
