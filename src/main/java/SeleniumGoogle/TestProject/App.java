package SeleniumGoogle.TestProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       // FirefoxDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Users/etigupta/workspace/TestProject/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
      //Maximize window
      //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        WebElement searchbox = driver.findElementByCssSelector("#lst-ib");
        searchbox.sendKeys("word of the day");
        WebElement searchresult = driver.findElementByCssSelector("#ires>div>div:nth-child(1)>div:nth-child(2)>div>.r>a");
        searchresult.click();
    }
}
