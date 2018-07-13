import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
    @FindBy(id = "txtUsername")
    private WebElement userNameTxt;

    @FindBy(id = "txtPassword")
    private WebElement passTxt;

    @FindBy(id = "btnLogin")
    private WebElement loginBtn;



    public void login(String name, String pass){
        userNameTxt.sendKeys(name);
        passTxt.sendKeys(pass);
        passTxt.submit();
    }
}
