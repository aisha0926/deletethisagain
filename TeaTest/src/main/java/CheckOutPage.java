import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage {

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "address")
    private WebElement address;

    @FindBy(id = "card_type")
    private WebElement card;

    @FindBy(id = "card_number")
    private WebElement cardNum;

    @FindBy(id = "cardholder_name")
    private WebElement cardholderName;

    @FindBy(id = "verification_code")
    private WebElement verCode;

    @FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")
    private WebElement placeOrder;


    public void clickMenuCheckout(String eMail, String nAme, String aDdress, String cardNumber, String verificationCode){
       email.sendKeys(eMail);
       name.sendKeys(nAme);
       address.sendKeys(aDdress);
       card.click();
       card.sendKeys(Keys.ARROW_DOWN);
       card.submit();
       cardNum.sendKeys(cardNumber);
       verCode.sendKeys(verificationCode);
       placeOrder.click();
    }
}
