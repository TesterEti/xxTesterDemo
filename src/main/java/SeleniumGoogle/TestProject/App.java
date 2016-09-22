package SeleniumGoogle.TestProject;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:/Users/etigupta/workspace/TestProject/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
      //Maximize window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        WebElement searchbox = driver.findElementByCssSelector("#lst-ib");
        searchbox.sendKeys("word of the day");
        List<WebElement> searchresult1 = driver.findElementsByCssSelector(".r");
        for (WebElement result : searchresult1) 
        {
        	String a = result.getText();
        	if  (a == "Merriam-Webster")
        		{
        			a.click();
        		}
        }
        //WebElement searchresult = driver.findElementByCssSelector("#ires>div>div:nth-child(1)>div:nth-child(1)>div>.r>a");
        //searchresult.click();
        //Collecting all list elements
        List<WebElement> allList = driver.findElementsByCssSelector(".more-wod-items>li>h2>a");
        for (WebElement option : allList) 
        {
        	//collecting WebElement values
        	String atext = option.getText();
        	System.out.println("list is here: "+ atext);
        }
        
        
    }
}
