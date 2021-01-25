package WebTest;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class HomePage extends Util {
    private By _LoginButton = By.linkText("Login");

    public void userClickOnLoginButton() {
        clickOnElement(_LoginButton);


        String MainWindow = driver.getWindowHandle();

        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.id("inputEmail")).sendKeys("Anjali9+\"+System.currentTimeMillis()+\"@gmail.com");
                driver.findElement(By.xpath("//input[@id=\"inputPassword\"]")).sendKeys("Kavya2018");
                driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]")).click();

                // Closing the Child Window.
                driver.close();
            }
            // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);

        }
    }
}