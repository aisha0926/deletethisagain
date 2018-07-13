import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sidebar {
    @FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
    private WebElement PIM;

    @FindBy(xpath = "//*[@id=\"menu_pim_addEmployee\"]/span[2]")
    private WebElement addEmployee;

    public void pimTab(){
        PIM.click();

    }

    public void addEmployeeTab(){
        addEmployee.click();
    }


}
