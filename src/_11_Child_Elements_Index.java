import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class _11_Child_Elements_Index {
    public static void main(String[] args) {
        /*
        TEST CASE
        Go to https://techglobal-training.netlify.app/
        Select “Frontend Testing” from the “Practices” dropdown
        Select the “Xpath-CSS Locators” card
        Validate the header "Automation Tools"
         */

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontendTesting();
        TechGlobalUtil.clickOnCard(2);

        Waiter.pause(2);

        System.out.println(driver.findElement(By.xpath("(//h3[@class='Xpath_subheader__VOtsU'])[2]")).getText());


        //Looping both headings
        for (WebElement element : driver.findElements(By.cssSelector(".Xpath_subheader__VOtsU"))) {
            System.out.println(element.getText());
        }

        Driver.quitDriver();
    }
}
