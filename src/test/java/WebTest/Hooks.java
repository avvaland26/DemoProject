package WebTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Util{

        BrowserManager browserManager = new BrowserManager();
        @Before
        public void openBrowser(){
            browserManager.openBrowser();
       }
        @After
        public void CloseBrowser(){
            //browserManager.closeBrowser();
    }
}
