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
   // String LoginData = "/Users/Aisha/Downloads/Automated Testing Exercises/DemoSiteDDT.xlsx";

    @BeforeClass
    public static void beforeClass(){

    }

    @Before
    public void setup() throws Exception{
        ExcelUtils.setExcelFile(Contants.pathTestData + Contants.fileTest, 0);

        System.setProperty("webdriver.chrome.driver", "/Development/web_driver/chromedriver");
        driver = new ChromeDriver();
    }

    /*
        This method will contain the test method which will have the data that is being pulled
        from an excel file for the username and password. Making use of other classes which molds
        that page, such as Loginpage and Adduserpage which contains the xpath. Making the code
        easier to read.
     */
    @Test
    public void testMethod() throws IOException {
        //Getting the file path of the report which takes in two parameters, the file path and a boolean value which makes it possible
        //for the test to be re-written
        report = new ExtentReports("/Users/Aisha/deletethisagain/Reporting/Test.html", true);
        //This line starts the test which takes in a String parameter which will be the details about the test that's
        //going to be started
        test = report.startTest("Verify application title");
        //This is just logging in the information about the test
        test.log(LogStatus.INFO, "Browser started");

        //Accessing the file, creating a link which connects to an excel file. Think of it as a sandwich,
        //this acts as a jam which connects both burger sandwich together
        FileInputStream file = new FileInputStream(Contants.pathTestData + Contants.fileTest);
        //XSSFWorkbook is used when working with spreadsheets
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        //Getting the spreadsheet sheet, at the bottom of spreadsheet, you normally get
        //multiple sheets which starts at 0
        XSSFSheet sheet = workbook.getSheetAt(0);

        //Creating a loop which will loop through the rows in the excel file
        for(int i = 0; i<sheet.getPhysicalNumberOfRows(); i++) {
            //test.log(LogStatus.INFO, "Looping through each cell");
            Cell username = sheet.getRow(i).getCell(0);
            Cell password = sheet.getRow(i).getCell(1);

            //test.log(LogStatus.INFO, "Creating a variable to enter the username and password");
            String user = username.getStringCellValue();
            String pass = password.getStringCellValue();

            //Maximizing the window screen
            driver.manage().window().maximize();
            //Getting the website page
            driver.get(Contants.homepageURL);
            //Storing the title of the page
            String title = driver.getTitle();

            //Just a test logging in the test, this will come out as pass or fail visually
            test.log(LogStatus.INFO, "Testing if the title matches te test");
            //This is testing if the title is equals to the actual title of the page
            if (title.equals("FREE example PHP code and online MySQL database - example username password protected site")) {
                //This is passing the test
                test.log(LogStatus.PASS, "Verified name");
            } else {
                //Failing the test and creates a visual representation of it
                test.log(LogStatus.FAIL, "Failed");
            }

            //PageFactory is like an extension to page object. This is used as a means to communicate with
            //the HTML files. So instead of using findByElement, you can access it using page.clickAdd()
            //similar to how objects are being accessed after instantiating them. So all the connections
            //to the HTML files are done the classes.
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

            String title1 = driver
                    .findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"))
                    .getText();
            String expected = "**Successful Login**";


            if (!title1.equals(expected)) {
                test.log(LogStatus.FAIL, "Demo Site Login Test");
                report.endTest(test);
                report.flush();
                ExcelUtils.setCellData("Fail", i, 2);
            }


            assertEquals(expected, title1);
            ExcelUtils.setCellData("Pass", i, 2);
            test.log(LogStatus.PASS, "Demo Site Login Test");

        }

        //Checking if the login is successful by using the assertEquals and the text that's supposed to show up.
      //  assertEquals("**Successful Login**",
             //   driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());
    }

    /*
        Executed after the test which ends the test, closes the report and then closes the driver, in which in this instance
        is the website.
     */
    @After
    public void tearDown(){
        report.endTest(test);
        report.flush();
        driver.quit();

    }
}
