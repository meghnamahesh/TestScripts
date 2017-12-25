

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class after_RightClick_action {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\MeghnaMahesh\\\\Desktop\\\\meghna\\\\Driver files\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement link = driver.findElement(By.xpath("//a[.='Gmail']"));
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
		}

	/*public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MeghnaMahesh\\Desktop\\meghna\\Driver files\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\MeghnaMahesh\\Desktop\\meghna\\Driver files\\geckoDriver 0.19V\\geckodriver.exe");
    //	WebDriver driver=new FirefoxDriver();	
    //Launching the site.				
        driver.get("http://www.google.com");		
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;  
        WebElement element1=driver.findElement(By.linkText("About"));
   try
   {
   Actions action =new Actions(driver);

   action.moveToElement(element1);
   Thread.sleep(3000);
   action.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

   }
   catch (Exception e)
   {
	   System.out.println(e);
   }
   
	}
*/
	

}
