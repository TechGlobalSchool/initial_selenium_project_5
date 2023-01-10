import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Recap_02_Validate_Google {

    public static void main(String[] args) {
        /*
        TEST CASE 3
        Go to https://www.google.com/
        Validate the page title is "Google"
        Validate the page url is "https://www.google.com/"
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle().equals("Google") ? "Title Validation PASSED" : "Title Validation FAILED");

        System.out.println(driver.getCurrentUrl().equals("https://www.google.com/") ?
                "URL Validation PASSED" : "URL Validation FAILED");


        /*
        TEST CASE 4
        Go to https://www.google.com/
        Enter "Software Engineer in Test" to search input box
        Click the search button
        Validate the first result contains the text "Software Engineer in Test" (edited)
         */
        WebElement searchInput = driver.findElement(By.className("gLFyf"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchInput.sendKeys("Software Engineer in Test");
        searchButton.click();

        if(driver.findElement(By.xpath("(//div[@class='yuRUbf']//h3)[1]")).getText().contains("Software Engineer in Test"))
            System.out.println("PASSED");
        else System.out.println("FAILED");

        Driver.quitDriver();
    }
}
