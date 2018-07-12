import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MenuPage {
    @FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
    private WebElement navigateToMenu;

    @FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
    private WebElement checkOut;

    public void clicking(){
        navigateToMenu.click();
     //   checkOut.click();
    }

    public void checkOutClick(){
        checkOut.click();
    }
}
