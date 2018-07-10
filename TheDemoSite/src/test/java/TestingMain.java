import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;
import java.io.FileInputStream;
import java.io.IOException;


public class TestingMain {
    ChromeDriver driver;
    ExtentTest test;
    ExtentReports report;
    String LoginData = "/Users/Aisha/Downloads/Automated Testing Exercises/DemoSiteDDT.xlsx";

    @BeforeClass
    public static void beforeClass(){

    }

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Development/web_driver/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testMethod() throws IOException {
        report = new ExtentReports("/Users/Aisha/deletethisagain/Reporting/Test.html", true);
        test = report.startTest("Verify application title");
        test.log(LogStatus.INFO, "Browser started");

        FileInputStream file = new FileInputStream(LoginData);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);

       // test.log(LogStatus.INFO, "Creating a loop which will loop through the rows in the excel file");
        for(int i = 0; i<sheet.getPhysicalNumberOfRows(); i++) {
            //test.log(LogStatus.INFO, "Looping through each cell");
            Cell username = sheet.getRow(i).getCell(0);
            Cell password = sheet.getRow(i).getCell(1);

            //test.log(LogStatus.INFO, "Creating a variable to enter the username and password");
            String user = username.getStringCellValue();
            String pass = password.getStringCellValue();

            driver.manage().window().maximize();
            driver.get("http://thedemosite.co.uk/index.php");
            String title = driver.getTitle();

            test.log(LogStatus.INFO, "Testing if the title matches te test");
            if (title.equals("FREE example PHP code and online MySQL database - example username password protected site")) {
                test.log(LogStatus.PASS, "Verified name");
            } else {
                test.log(LogStatus.FAIL, "Failed");
            }

            Mainpage page = PageFactory.initElements(driver, Mainpage.class);
            AddUserPage addPage = PageFactory.initElements(driver, AddUserPage.class);
            LoginPage login = PageFactory.initElements(driver, LoginPage.class);
            page.clickAdd();

            test.log(LogStatus.INFO, "Adding the username and password which is taken from the excel file");
            addPage.addUsername(user);
            addPage.addPassword(pass);

            test.log(LogStatus.INFO, "Testing the username and password that's been added");
            login.loginUser(user);
            login.logingPass(pass);

        }


        assertEquals("**Successful Login**",
                driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());


    }

    @After
    public void tearDown(){
        report.endTest(test);
        report.flush();
        driver.quit();

    }
}
