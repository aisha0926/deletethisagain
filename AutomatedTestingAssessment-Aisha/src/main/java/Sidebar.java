import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sidebar {
    @FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
    private WebElement PIM;

    @FindBy(xpath = "//*[@id=\"menu_pim_addEmployee\"]")
    private WebElement addEmployee;

    @FindBy(xpath = "//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]")
    private WebElement employeeList;

    public void pimTab(){
        PIM.click();

    }

    public void addEmployeeTab(){
        addEmployee.click();
    }

    public void employeeList(){
        employeeList.click();
    }


}
