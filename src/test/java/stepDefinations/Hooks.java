package stepDefinations;

import base.BaseUtils;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks {
    BaseUtils baseUtils;

    public Hooks(BaseUtils baseUtils) {
        this.baseUtils = baseUtils;
    }

    @After
    //executes after each scenerio
    public void closeBrowser(Scenario scenario) throws IOException {
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) baseUtils.webDriverManger.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        baseUtils.webDriverManger.getDriver().quit();
    }
}
