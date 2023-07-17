package base;


import pages.PageManager;

import java.io.IOException;

public class BaseUtils {
    public static PageManager pageManager;
    public WebDriverManger webDriverManger;
    public BaseUtils() throws IOException {
        webDriverManger = new WebDriverManger();
        pageManager = new PageManager(webDriverManger.getDriver());
    }
}