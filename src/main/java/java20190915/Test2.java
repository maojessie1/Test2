package java20190915;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

    WebDriver driver;

    @BeforeMethod
    public void start(){
        SetPro.firefoxPro();
        SeleniumDriver sd = new SeleniumDriver();
        driver = sd.getDriver();
        driver.navigate().to("file:///C:/Users/123/Desktop/demo.html");
        driver.manage().window().maximize();
    }

    @Test
    public void testMain(){
    PageDemo pd = new PageDemo(driver);
    ScreenShot ss = new ScreenShot(driver);
    ss.takeScreenShot();
    pd.input();
    ss.takeScreenShot();
    }

    @AfterMethod
    public void testend(){
        driver.close();
        driver.quit();
    }

}
