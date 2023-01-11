import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _09_getText_getAttribute {
    public static void main(String[] args) {
        /*
        Go to https://www.techglobalschool.com/
        Scroll down to the bottom of the page

        Validate the Subscribe form
        Validate “Subscribe” heading2 with its text
        Validate ”Stay up to date!” paragraph with its text
        Validate “Enter your first name” input box with its placeholder
        Validate “Enter your last name” input box with its placeholder
        Validate “Add your email” input box with its placeholder
        Validate “SUBSCRIBE” button with its text

        driver.findElement(By....).getAttribute("placeholder")
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement heading = driver.findElement(By.id("comp-keehv7pd1"));
        WebElement text = driver.findElement(By.id("comp-keei0711"));
        WebElement firstNameInputText = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lastNameInputText = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement emailInputText = driver.findElement(By.id("input_comp-khwb0zsz"));
        WebElement subscribeButton = driver.findElement(By.cssSelector("#comp-khwayqh22>button"));

        System.out.println(heading.isDisplayed()); // true
        System.out.println(heading.getText()); // Subscribe

        System.out.println(text.isDisplayed()); // true
        System.out.println(text.getText()); // Stay up to date!

        System.out.println(firstNameInputText.isDisplayed()); // true
        System.out.println(firstNameInputText.getAttribute("placeholder")); // Enter your first name

        System.out.println(lastNameInputText.isDisplayed()); // true
        System.out.println(lastNameInputText.getAttribute("placeholder")); // Enter your last name

        System.out.println(emailInputText.isDisplayed()); // true
        System.out.println(emailInputText.getAttribute("placeholder")); // Add your email


        System.out.println(subscribeButton.isDisplayed()); // true
        System.out.println(subscribeButton.isEnabled()); // true
        System.out.println(subscribeButton.getText()); // SUBSCRIBE


        //HOW TO VALIDATE STYLES
        System.out.println(subscribeButton.getCssValue("color"));
        System.out.println(subscribeButton.getCssValue("background-color"));
        System.out.println(subscribeButton.getCssValue("font-size"));
        System.out.println(subscribeButton.getCssValue("font-family"));
        System.out.println(subscribeButton.getCssValue("margin"));

        System.out.println(subscribeButton.getTagName());

        Driver.quitDriver();
    }
}
