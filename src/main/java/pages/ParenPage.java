package pages;

import org.openqa.selenium.WebDriver;

public class ParenPage {

    WebDriver driver;

    public ParenPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url){
        driver.get(url);
    }

    public void quitBrowser(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
