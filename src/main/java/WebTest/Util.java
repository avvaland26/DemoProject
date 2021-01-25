package WebTest;


import org.openqa.selenium.By;
import org.testng.Assert;

public class Util extends BasePage
{
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    public static String getTextElements(By by)
    {
        return driver.findElement(by).getText();
    }
    public void assertTextMessage(String actual,String expected,String message){
        Assert.assertEquals(actual,expected,"");
    }
     public static void typeText(By by,String text)
     {
         driver.findElement(by).sendKeys(text);
     }
}
