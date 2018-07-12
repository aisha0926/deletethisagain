import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy()
    private WebElement genderRadial;

    @FindBy()
    private WebElement firstNameTxt;

    @FindBy()
    private WebElement lastNameTxt;

    @FindBy()
    private WebElement houseNoTxt;

    @FindBy()
    private WebElement addressTxt;

    @FindBy()
    private WebElement numberTxt;

    @FindBy()
    private WebElement dayDropDown;

    @FindBy()
    private WebElement monthDropDown;

    @FindBy()
    private WebElement yrDropDown;

    @FindBy()
    private WebElement countryDropDown;

    public void signUp(String fname, String lname, String address){
        genderRadial.click();
        firstNameTxt.sendKeys(fname);
        lastNameTxt.sendKeys(lname);
        addressTxt.sendKeys(address);
        dayDropDown.click();
        monthDropDown.click();
        yrDropDown.click();
        countryDropDown.click();
    }



}
