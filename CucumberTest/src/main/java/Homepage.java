import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

    @FindBy(id="lst-ib")
    private WebElement searchTxt;

    public void search(String keyword){
        searchTxt.sendKeys(keyword);
        searchTxt.submit();
    }

}
