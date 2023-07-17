package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriverManger {
    public WebDriver driver;
    public WebDriver getDriver() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/global.properties");
        Properties prop = new Properties();
        prop.load(fileInputStream);

        if (driver == null) {
            if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                //options.setHeadless(true);
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
            }
           else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--remote-allow-origins=*");
                //options.setHeadless(true);
                driver = new FirefoxDriver(options);
                driver.manage().window().maximize();
            }
           else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--remote-allow-origins=*");
                //options.setHeadless(true);
                driver = new EdgeDriver(options);
                driver.manage().window().maximize();
            }
        }
            return driver;
    }

}
