import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TestClass {
    ChromeDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver" , "/Development/web_driver/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void methodTest(){

    }
}
