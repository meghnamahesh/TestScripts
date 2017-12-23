import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MeghnaMahesh\\Desktop\\meghna\\Driver files\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();	
    //Launching the site.				
        driver.get("http://www.freecrm.com");			
//    driver.manage().window().maximize();		
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;   
    driver.findElement(By.name("username")).sendKeys("naveenk");
    driver.findElement(By.name("password")).sendKeys("test@123");
   
    driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
    
// Switch To Frame by Name 
    driver.switchTo().frame("mainpanel");
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//*[@id='navmenu']/ul/li[4]/a")).click();
	}
}
