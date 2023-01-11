import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

public class _08_sendKeys {
    public static void main(String[] args) {
        /*
        TEST CASE
        Go to https://www.wikipedia.org/
        Search for “Tesla”
        Validate the main title of the page is “Tesla”
        NOTE: Use xpath or cssSelector to locate the web elements
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.wikipedia.org/");
        Waiter.pause(3);

        driver.findElement(By.id("searchInput")).sendKeys("Tesla" + Keys.ENTER);
        Waiter.pause(3);

//        driver.findElement(By.cssSelector(".pure-button-primary-progressive")).click();
//        Waiter.pause(3);

        System.out.println(driver.findElement(By.cssSelector(".mw-page-title-main")).getText()); // Tesla

        Driver.quitDriver();
    }
}
