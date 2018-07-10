import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {
    ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Development/web_driver/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        // driver.quit();
    }

    @Test
    public void methodTest() {
        driver.manage().window().maximize();
     //   int i = 10;
       // do {
         //   i++;
            driver.get("http://automationpractice.com/index.php");
            WebElement search = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
            search.sendKeys(Keys.SHIFT,"Dress");
            WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
            searchBtn.click();
            WebElement first = driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/h4/a"));
            first.click();
            WebElement second = driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[3]/a/img"));
            second.click();
     //   } while(i != 10);


       // System.out.println(search.getText());

       // assertEquals("Blouse", search.getText());
    }
}
