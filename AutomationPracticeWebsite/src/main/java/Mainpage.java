import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class Mainpage {

    @FindBy(id = "search_query_top")
    private WebElement searchBox;

    @FindBy(id = "block_top_menu")
    private WebElement nav;

    public void searchBar(String test){
        searchBox.sendKeys(Keys.chord(Keys.SHIFT, test));
        searchBox.submit();
    }


}
