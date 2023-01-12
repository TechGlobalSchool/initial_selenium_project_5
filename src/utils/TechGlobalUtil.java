package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TechGlobalUtil {

    public static void getFrontendTesting(){
        WebDriver driver = Driver.getDriver();

        driver.get("https://techglobal-training.netlify.app/");
        Waiter.pause(1);

        driver.findElement(By.id("dropdown-button")).click(); //
        Waiter.pause(1);

        driver.findElement(By.id("frontend-option")).click();
        Waiter.pause(1);
    }

    public static void clickOnCard(int cardNumber){
        Driver.getDriver().findElement(By.id("card-" + cardNumber)).click();
    }
}
