import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestClass {
    ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Development/web_driver/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
         driver.quit();
    }

    @Test
    public void methodTest() {
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        Mainpage page = PageFactory.initElements(driver, Mainpage.class);
        page.searchBar("Dress");

        //Adding double quotes around a string by adding \" \" around the string you want it to be added
        assertEquals("\"DRESS\"", driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText());
    }
}
