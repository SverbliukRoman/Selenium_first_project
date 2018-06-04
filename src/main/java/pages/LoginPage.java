package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ParenPage {

    @FindBy(name = "_username")
    WebElement email;

    @FindBy(name = "_password")
    WebElement pass;

    @FindBy(xpath = "/html/body/div/div[2]/form/div[3]/div[2]/button")
    WebElement btn;

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void putEmail(String emailStr) {
        email.sendKeys(emailStr);
    }

    public void putPass(String passStr) {
        pass.sendKeys(passStr);

    }

    public void clickBtn() {
        btn.click();

    }

    public void fullLogin(String url, String emailStr, String passStr) {
        initDriver();
        openPage(url);
        putEmail(emailStr);
        putPass(passStr);
        clickBtn();
    }

    public void initDriver() {
        PageFactory.initElements(driver, this);
    }
}
