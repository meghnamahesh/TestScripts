import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsMouseHover {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MeghnaMahesh\\Desktop\\meghna\\Driver files\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();	
    //Launching the site.				
        driver.get("http://www.bookmeds.com");			
//    driver.manage().window().maximize();		
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;   
   
   WebElement element= driver.findElement(By.xpath(".//*[@id='headerMenuParent']/div/ul[1]/li[2]/span"));
   Actions action =new Actions(driver);
   action.moveToElement(element).build().perform();
   Thread.sleep(3000);
   
  // WebDriverWait wait = new WebDriverWait(driver, 10);
   
   //WebElement productsMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Home Care']")));
   driver.findElement(By.xpath("//a[@title='Show products in category Home Care']")).click();
   
   //driver.findElement(By.xpath(".//*[@id='headerMenuParent']/div/ul[1]/li[2]/div/div/div[1]/div[2]/ul/li[1]/a/span")).click();

   
	}

}
