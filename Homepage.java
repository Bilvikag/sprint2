
package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Homepage {
	WebDriver driver = null;
	WebDriverWait wait = new WebDriverWait(driver, 10);
	Actions action = new Actions(driver);

	@Given("launch the browser")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "./src/test/java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");

	}

	@When("scroll down and scroll up")
	public void scroll_down_and_scroll_up() throws InterruptedException {

		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();

		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).build().perform();

		action.sendKeys(Keys.PAGE_UP).build().perform();
	}

	@When("click on the profile")
	public void click_on_the_profile() {
		driver.findElement(By.xpath("//span[text()='Profile']")).click();
	}

	@When("Mouseover on sign up")
	public void mouseover_on_sign_up() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign Up']")));
		driver.findElement(By.xpath("//span[text()='Sign Up']"));
	}

	@When("mouseover on every category")
	public void mouseover_on_every_category() throws InterruptedException {
		WebElement a = driver.findElement(By.xpath("//span[text()='Women Ethnic']"));

		action.moveToElement(a).build().perform();
		Thread.sleep(2000);

		WebElement b = driver.findElement(By.xpath("//span[text()='Women Western']"));
		action.moveToElement(b).build().perform();
		Thread.sleep(2000);

		WebElement c = driver.findElement(By.xpath("//span[text()='Men']"));
		action.moveToElement(c).build().perform();
		Thread.sleep(2000);

		WebElement d = driver.findElement(By.xpath("//span[text()='Kids']"));
		action.moveToElement(d).build().perform();
		Thread.sleep(2000);

		WebElement z = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		action.moveToElement(z).build().perform();
		Thread.sleep(2000);

		WebElement e = driver.findElement(By.xpath("//span[text()='Beauty & Health']"));
		action.moveToElement(e).build().perform();
		Thread.sleep(2000);

		WebElement f = driver.findElement(By.xpath("//span[text()='Jewellery & Accessories']"));
		action.moveToElement(f).build().perform();
		Thread.sleep(2000);

		WebElement g = driver.findElement(By.xpath("//span[text()='Bags & Footwear']"));
		action.moveToElement(g).build().perform();
		Thread.sleep(2000);

		WebElement h = driver.findElement(By.xpath("//span[text()='Electronics']"));
		action.moveToElement(h).build().perform();
		Thread.sleep(2000);
	}

	@When("mouseover on downloading")
	public void mouseover_on_downloading() throws InterruptedException {
		WebElement r = driver.findElement(By.xpath("//span[text()='Download App']"));
		action.moveToElement(r).build().perform();
		Thread.sleep(2000);
	}

	@When("after clicking on the any product")
	public void after_clicking_on_the_any_product() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Gorgeous Men Caps']")));
		driver.findElement(By.xpath("//p[text()='Gorgeous Men Caps']")).click();
	}

}
