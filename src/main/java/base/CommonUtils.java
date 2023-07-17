package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class CommonUtils {
    public void waitForElementToLoad(WebElement element,WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public Properties readProperties(String path) throws IOException {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+path);
        p.load(fis);
        return p;
    }
}
