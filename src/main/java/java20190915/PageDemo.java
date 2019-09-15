package java20190915;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageDemo extends Page {
    WebDriver driver;
    public static By input = By.id("user");

    PageDemo(WebDriver driver) {
        super(driver);
    }

    public void input(){
        WebElement element = this.getElement(input);
        element.sendKeys("abcdssss");
    }
}
