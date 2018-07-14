import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountSearch {
    Actions action;

    @FindBy(id = "search-query")
    private WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"tweet-box-reply-to-1018152872486334465\"]")
    private WebElement inputTxt;

    @FindBy(xpath = "//*[@id=\"permalink-overlay-dialog\"]/div[3]/div/div/div[1]/div[2]/div/form/div[3]/div[2]/button/span[2]")
    private WebElement twtReply;

    public void search(String msg){
//        searchBar.sendKeys(name);
//        searchBar.submit();
//        action.sendKeys(Keys.chord(Keys.CONTROL) + action.sendKeys("f"));
        inputTxt.click();
        inputTxt.sendKeys(msg);
        twtReply.click();
    }

}
