import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class TestingFeatures {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest tests;

    @Before
    public void setup(){
        System.setProperty(Constants.STRING_DRIVER, Constants.DRIVER_PATH);
        driver = new ChromeDriver();

        reports = new ExtentReports(Constants.FILE_PATH, true);
        tests = reports.startTest("Starting the test for OrangeHRM");
    }


    @Given("^the login page$")
    public void the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().to(Constants.WEB_URL);

        tests.log(LogStatus.INFO, "Testing if the webpage is correct");
        if(driver.getCurrentUrl().equals(Constants.WEB_URL)){
            tests.log(LogStatus.PASS, "Correct URL");
        } else {
            tests.log(LogStatus.FAIL, "Incorrect web url");
        }

        assertEquals("https://qa-trials641.orangehrmlive.com/auth/login", driver.getCurrentUrl());

    }

    @When("^I login$")
    public void i_login() {
        // Write code here that turns the phrase above into concrete actions
        Login logingIn = PageFactory.initElements(driver, Login.class);
        logingIn.login("Admin" , "AdminAdmin");

        tests.log(LogStatus.INFO, "Testing if the username and password is entered correctly");
        if(Constants.SUCCESSFUL_URL != Constants.UNSUCCESSFUL){
            tests.log(LogStatus.PASS, "Correct details entered");
        } else {
            tests.log(LogStatus.FAIL, "Incorrect details");
        }

        //Testing if it has proceeded to the next page
        assertEquals("https://qa-trials641.orangehrmlive.com/client/#/dashboard", driver.getCurrentUrl());

    }

    @When("^I click the PIM tab$")
    public void i_click_the_PIM_tab() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Sidebar pimTab = PageFactory.initElements(driver, Sidebar.class);
        pimTab.pimTab();
       // Thread.sleep(10000);

    }

    @When("^then the Add Employee Tab$")
    public void then_the_Add_Employee_Tab() throws InterruptedException {
       // Thread.sleep(10000);
        Sidebar addTab = PageFactory.initElements(driver, Sidebar.class);
        addTab.addEmployeeTab();
    }

    @When("^I fill out the Employee Details correctly$")
    public void i_fill_out_the_Employee_Details_correctly()  {
        // Write code here that turns the phrase above into concrete actions
        WebElement dynamicElement = (new WebDriverWait(driver, 300)).until
                (ExpectedConditions.presenceOfElementLocated(By.id("firstName")));

        // Write code here that turns the phrase above into concrete actions
        EmployeeList employeeList = PageFactory.initElements(driver, EmployeeList.class);
        employeeList.addingEmployee("Sittie","Aisha","Amate" ,"85844");

    }

    @When("^I choose to create Login Details by clicking the appropriate button$")
    public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() {
        // Write code here that turns the phrase above into concrete actions

        EmployeeList rdl = PageFactory.initElements(driver, EmployeeList.class);
        rdl.radialClick();

    }

    @When("^I fill out the Login Details correctly$")
    public void i_fill_out_the_Login_Details_correctly() {
        // Write code here that turns the phrase above into concrete actions
        EmployeeList addingUser = PageFactory.initElements(driver, EmployeeList.class);
        addingUser.addUser(   "tlsosk3",
                "appleipod0926", "appleipod0926");


    }

    @When("^I click the Save button$")
    public void i_click_the_Save_button()  {
        // Write code here that turns the phrase above into concrete actions
        EmployeeList saveBtn = PageFactory.initElements(driver, EmployeeList.class);
        saveBtn.saveBtnMethod();
    }

    @Then("^I can search for the Employee I have just created$")
    public void i_can_search_for_the_Employee_I_have_just_created()  {
        // Write code here that turns the phrase above into concrete actions
        EmployeeList searching = PageFactory.initElements(driver, EmployeeList.class);
        searching.searchEmployee("Aisha");

        String title = driver.findElement(By.xpath("//*[@id=\"employee_name_quick_filter_employee_list_dropdown\"]/div[2]")).getText();
        String expected = "User Name Exists";

        if(title.equals(expected)){
            tests.log(LogStatus.FAIL, "Failure");
        }

        assertEquals(expected, "ssdsdw2111");
        tests.log(LogStatus.PASS, "");


    }

    @Then("^select them for inspection$")
    public void select_them_for_inspection() {
        // Write code here that turns the phrase above into concrete actions
    }

    @After
    public void tearDown() throws InterruptedException {
        reports.endTest(tests);
        reports.flush();
        driver.quit();
        Thread.sleep(3000);
    }


}
