package generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import generic.Base_Test;



public class HomePAgeMeesho {
		
		WebDriver driver=null;
		@BeforeTest
		public void start()
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		      
		}
		@Test()
		public void test(String emailOrPhone) throws InterruptedException
		{
			
	        driver.manage().window().maximize();
	        driver.get("https://www.meesho.com/");
	        
	        WebDriverWait wait = new WebDriverWait(driver,10);
	        
	        Actions action=new Actions(driver);
	        
	        action.sendKeys(Keys.PAGE_DOWN).build().perform();
	    
	        action.sendKeys(Keys.PAGE_DOWN).build().perform();
	        Thread.sleep(2000);
	        action.sendKeys(Keys.PAGE_UP).build().perform();
	        
	        action.sendKeys(Keys.PAGE_UP).build().perform();
	        
	        
	       driver.findElement(By.xpath("//span[text()='Profile']")).click();
	       
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign Up']")));
	       driver.findElement(By.xpath("//span[text()='Sign Up']"));
	      
	      
	       WebElement a=driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
	       action.moveToElement(a).build().perform();
	       Thread.sleep(2000);
	      
	       WebElement b=driver.findElement(By.xpath("//span[text()='Women Western']"));
	       action.moveToElement(b).build().perform();
	       Thread.sleep(2000);
	       
	       WebElement c=driver.findElement(By.xpath("//span[text()='Men']"));
	       action.moveToElement(c).build().perform();
	       Thread.sleep(2000);
	     
	       WebElement d=driver.findElement(By.xpath("//span[text()='Kids']"));
	       action.moveToElement(d).build().perform();
	       Thread.sleep(2000);
	       
	       
	       WebElement z=driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
	       action.moveToElement(z).build().perform();
	       Thread.sleep(2000);
	       
	       WebElement e=driver.findElement(By.xpath("//span[text()='Beauty & Health']"));
	       action.moveToElement(e).build().perform();
	       Thread.sleep(2000);
	       
	       WebElement f=driver.findElement(By.xpath("//span[text()='Jewellery & Accessories']"));
	       action.moveToElement(f).build().perform();
	       Thread.sleep(2000);
	       
	       WebElement g=driver.findElement(By.xpath("//span[text()='Bags & Footwear']"));
	       action.moveToElement(g).build().perform();
	       Thread.sleep(2000);
	       
	       WebElement h=driver.findElement(By.xpath("//span[text()='Electronics']"));
	       action.moveToElement(h).build().perform();
	       Thread.sleep(2000);
	       //Download App
	       
	       WebElement r=driver.findElement(By.xpath("//span[text()='Download App']"));
	       action.moveToElement(r).build().perform();
	       Thread.sleep(2000);
	       
	       JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,1000);");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Gorgeous Men Caps']")));	
			driver.findElement(By.xpath("//p[text()='Gorgeous Men Caps']")).click();

		}
		
		
		/*@DataProvider(name="testData")
		public String[][]getTestData() throws IOException{
			String[][]testdata=  read_excel.getMultipleData("Sheet1");
			return testdata;
			}*/
		
		
		@AfterTest
		public void close()
		{
			driver.quit();
		}
	
}
