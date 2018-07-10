import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheDemoSite {
    ChromeDriver driver;
   // WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Development/web_driver/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
      // driver.quit();
    }

    @Test
    public void methodTest(){
        driver.manage().window().maximize();
        driver.get("http://thedemosite.co.uk/");
       // checkElement.sendKeys("");
        WebElement btnAdd = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
       // assertEquals("Add a user", checkElement.click());
        btnAdd.click();

        WebElement userName = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
        userName.click();
        userName.sendKeys("Aisha");

        WebElement pass = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
        pass.click();
        pass.sendKeys("laptop");

        WebElement btnSave = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
        btnSave.click();


    }


}
