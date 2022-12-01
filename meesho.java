package pom_scripts;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class meesho extends BasePage{

	public meesho(WebDriver driver) {
		super(driver);
	}
	/*Actions action=new Actions(driver);
	
    public void() {
    	
    action.sendKeys(Keys.PAGE_DOWN).build().perform();

    action.sendKeys(Keys.PAGE_DOWN).build().perform();
   Thread.sleep(2000);
    action.sendKeys(Keys.PAGE_UP).build().perform();
    
    action.sendKeys(Keys.PAGE_UP).build().perform();
    }*/
    
	@FindBy(xpath="//span[text()='Profile']")
	WebElement profile;
	public void profile() {
		clickAction(profile);
	}
	

	
	
	@FindBy(xpath="//span[text()='Women Ethnic']")
	WebElement WomenEthnic;
	public void WomenEthnic() {
		clickAction(WomenEthnic);
	}
	
	@FindBy(xpath="//span[text()='Women Western']")
	WebElement WomenWestern;
	public void WomenWestern() {
		clickAction(WomenWestern);
	}
	
	@FindBy(xpath="//span[text()='Men']")
	WebElement Men;
	public void Men() {
		clickAction(Men);
	}
	
	@FindBy(xpath="//span[text()='Kids']")
	WebElement Kids;
	public void Kids() {
		clickAction(Kids);
	}
	
	@FindBy(xpath="//span[text()='Home & Kitchen']")
	WebElement HomeKitchen;
	public void HomeKitchen() {
		clickAction(HomeKitchen);
	}
	
	@FindBy(xpath="//span[text()='Beauty & Health']")
	WebElement BeautyHealth;
	public void BeautyHealth() {
		clickAction(BeautyHealth);
	}
	
	@FindBy(xpath="//span[text()='Jewellery & Accessories']")
	WebElement JewelleryAccessories ;
	public void JewelleryAccessories() {
		clickAction(JewelleryAccessories);
	}
	
	@FindBy(xpath="//span[text()='Bags & Footwear']")
	WebElement BagsFootwear ;
	public void BagsFootwear() {
		clickAction(BagsFootwear);
	}
	
	@FindBy(xpath="//span[text()='Electronics']")
	WebElement  Electronics;
	public void Electronics() {
		clickAction(Electronics);
	}
	
	@FindBy(xpath="//span[text()='Download App']")
	WebElement  Download;
	public void Download() {
		clickAction(Download);
	}
	
	@FindBy(xpath="//p[text()='Gorgeous Men Caps']")
	WebElement  Gorgeous;
	public void Gorgeous() {
		clickAction(Gorgeous);
	}
	
}
