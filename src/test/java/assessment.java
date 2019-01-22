import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class assessment  {

    private String expected = "test";
    WebDriver driver = new FirefoxDriver();

    @Test
   public void test(){

        System.out.println("Navigate to WebPage");
        driver.navigate().to("https://the-internet.herokuapp.com/");

        List<WebElement> linkValues =
                driver.findElements(By.tagName("li"));
        List<String> text = new ArrayList();
        //Iterates the list of link values
            for (org.openqa.selenium.WebElement element : linkValues) {
                text.add(element.getText());
        }
        System.out.println(String.valueOf(text));

        if(text.contains(expected)) {
            System.out.println("Link's name is found");

        } else {
            System.out.println("Link's name not found");

        }
        //quits the browser window
        driver.quit();
   }

}
