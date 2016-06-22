import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseMain {
    public static WebDriver driver;

    public BaseMain openBrowser() throws IOException
    {
        Properties prop= new Properties();
        FileInputStream fs= new FileInputStream("src/test/resources/config.properties");
        prop.load(fs);
        String url= prop.getProperty("url");

       // System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return this;
    }
    public void closeBrowser()
    {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
