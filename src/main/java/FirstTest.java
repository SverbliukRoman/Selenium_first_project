import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class FirstTest {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://v3.qalight.com.ua/login");
        webDriver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("Students");
        webDriver.findElement(By.xpath("//*[@id='password']")).sendKeys("90909");
        webDriver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[2]/button")).click();
        //webDriver.findElement(By.)

    }
}
