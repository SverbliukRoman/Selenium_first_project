import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class TestJunit{

    LoginPage loginPage;

    @Before
    public void start(){

    }

    @Test
    public void testJunit(){
        loginPage = new LoginPage(new ChromeDriver());
        loginPage.fullLogin("http://v3.qalight.com.ua/login","1", "909090");
    }

    @After
    public void end(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.quitBrowser();
    }

}
