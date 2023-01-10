import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;

import java.util.List;

public class _07_findElements {
    public static void main(String[] args) {
        /*
        Go to https://techglobal-training.netlify.app/
        Select “Frontend Testing” from the “Practices” dropdown
        Select the “Locators” card
        Validate the “Red Apple”, “Green Apple” and “Pineapple” links and displayed, enabled and their text is correct
         */

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontendTesting();

        driver.findElement(By.id("card-1")).click();

        List<WebElement> items = driver.findElements(By.xpath("//ul/li/a"));

        for (WebElement item : items) {
            System.out.println(item.getText());
            System.out.println(item.isDisplayed());
            System.out.println(item.isEnabled());
        }

        Driver.quitDriver();
    }
}
