package java20190915;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Page {
    WebDriver driver;
    Page(WebDriver driver){
        this.driver = driver;
    }

    public boolean waitToDisplayed(final By key){
        boolean wait = new WebDriverWait(driver,Config.waitTime).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return driver.findElement(key).isDisplayed();
            }
        });
        return wait;
    }

    public WebElement getElement(By key){
        WebElement element = null;
        if (this.waitToDisplayed(key)){
            element = driver.findElement(key);
        }

        return element;

    }
}
