import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
    @FindBy(xpath = "//*[@id=\"doc\"]/div/div[1]/div[1]/div[2]/div[1]/a")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[1]/input")
    private WebElement userNameTxt;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[2]/input")
    private WebElement passTxt;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/form/div[2]/button")
    private WebElement loginButton;

    public void signIn(){
        loginBtn.click();
    }

    public void logingIn(){
        userNameTxt.sendKeys("cliche214");
        passTxt.sendKeys("FuckLove13");
        passTxt.submit();
       // loginButton.click();
    }


}
