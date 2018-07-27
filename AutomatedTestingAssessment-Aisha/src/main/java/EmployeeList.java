import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class EmployeeList {
    WebDriver driver;
   // Actions actions;

    @FindBy(id = "firstName")
    private WebElement first;

    @FindBy(id = "middleName")
    private WebElement midName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "employeeId")
    private WebElement employeeID;

    @FindBy(xpath = "//*[@id=\"location_inputfileddiv\"]/div/input")
    private WebElement location;


    @FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
    private WebElement radial;

    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"status_inputfileddiv\"]/div/input")
    private WebElement status;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "confirmPassword")
    private WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"essRoleId_inputfileddiv\"]/div/input")
    private WebElement inputSelection;

    @FindBy(xpath = "//*[@id=\"supervisorRoleId_inputfileddiv\"]/div/input")
    private WebElement supervisorRole;

    @FindBy(xpath = "//*[@id=\"adminRoleId_inputfileddiv\"]/div/input")
    private WebElement adminRole;

    @FindBy(xpath = "//*[@id=\"systemUserSaveBtn\"]")
    private WebElement saveBtn;

    @FindBy(id = "employee_name_quick_filter_employee_list_value")
    private WebElement searchTxt;

    @FindBy(xpath = "//*[@id=\"employeeListTable\"]/tbody/tr/td[1]")
    private WebElement employeePicture;


    public void addingEmployee(String name, String mid, String last,String empID){


        first.sendKeys(name);
        first.sendKeys(Keys.TAB);
        midName.sendKeys(mid);
        midName.sendKeys(Keys.chord(Keys.TAB));
        lastName.sendKeys(last);
        lastName.sendKeys(Keys.TAB);
        employeeID.sendKeys(empID);
        employeeID.sendKeys(Keys.TAB);
            for(int i=0; i < 12; i++){
                location.sendKeys(Keys.ARROW_DOWN);
                location.sendKeys(Keys.chord(Keys.ENTER));
            }
    }

    public void radialClick(){
        radial.click();
    }

    public void addUser(String userNAME, String pass,
                        String confirmPass){
        userName.sendKeys(userNAME);
        userName.sendKeys(Keys.TAB);
        status.sendKeys(Keys.ENTER);
        status.sendKeys(Keys.TAB);
        password.sendKeys(pass);
        password.sendKeys(Keys.TAB);
        confirmPassword.sendKeys(confirmPass);
        confirmPassword.sendKeys(Keys.TAB);
        inputSelection.sendKeys(Keys.ARROW_DOWN);
        inputSelection.sendKeys(Keys.ENTER);
        inputSelection.sendKeys(Keys.TAB);
        supervisorRole.sendKeys(Keys.ARROW_DOWN);
        supervisorRole.sendKeys(Keys.ENTER);
        supervisorRole.sendKeys(Keys.TAB);
        adminRole.sendKeys(Keys.ARROW_DOWN);
        adminRole.sendKeys(Keys.ENTER);
    }

    public void saveBtnMethod(){
        saveBtn.click();
    }

    public void searchEmployee(String name){
        searchTxt.sendKeys(name);

    }

    public void clickEmployee(){
        employeePicture.click();
    }




}
