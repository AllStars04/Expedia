import org.junit.Assert;

import java.io.IOException;

/**
 * Created by BSKC3505 on 03/06/2016.
 */
public class HomePage extends BaseMain
{
    public void onHOmePage() throws IOException {
        //this.openBrowser();
        //openBrowser();
        String expectedUrl = "https://www.expedia.co.uk/";
        driver.get(expectedUrl);
        try {
            Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
            System.out.println("Navigated to correct webpage");
        } catch (Throwable pageNavigationError) {
            System.out.println("Didn't navigate to correct webpage");
        }
    }

}
