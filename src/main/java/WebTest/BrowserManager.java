package WebTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util{
    public void openBrowser(){
       LoadProp loadProp = new LoadProp();
       String BrowserName = loadProp.getProperty("chrome");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://phptravels.com/demo/");
    }
    public void closeBrowser(){
        driver.close();
    }
}
