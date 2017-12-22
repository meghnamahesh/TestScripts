import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDismiss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MeghnaMahesh\\Desktop\\meghna\\Driver files\\chromedriver.exe\\");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://anyaut.com/orange ");
		driver.findElement(By.id("username")).sendKeys("aaa.bbb@mail.com");
		driver.findElement(By.id("password")).sendKeys("AbcDef!23");
		driver.findElement(By.id("singlebutton")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.id("singlebutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div[1]/div[1]/a/div/div[1]")).click();
		//driver.findElement(By.xpath("//tbody/tr[7]/td[5]/a/i")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//tbody/tr[7]/td[5]/a/i")).click();
		//peach code Get Text alert message 

		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		
		//Orange code for Get text alert message 
		
		
	
		//peach Code
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		
		//Alert orange code
		//alert.dismiss();

}
