package java20190915;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDriver {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    SeleniumDriver(){
        this.init();
    }

    private void init() {
        if ("firefox".equals(Config.Browser)){
            driver = new FirefoxDriver();
        }else if ("ie".equals(Config.Browser)){
            driver = new InternetExplorerDriver();
        }else if ("chrome".equals(Config.Browser)){
            driver = new ChromeDriver();
        }else {
            System.out.println("´íÎóµÄä¯ÀÀÆ÷");
        }
    }
}
