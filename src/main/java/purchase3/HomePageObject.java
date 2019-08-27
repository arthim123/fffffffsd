package purchase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {
	

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dresses;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tshirt;
	
	@FindBy(xpath = "//*[@id=\"newsletter-input\"]")
	private WebElement newsletter;
	
	@FindBy(xpath = "//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	private WebElement clickemail;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]")
	private WebElement small;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]")
	private WebElement medium;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]")
	private WebElement large;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement dress;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
	private WebElement addcart;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	private WebElement successfull;
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getwomenTab() {
		return women;
	}
	public WebElement getdressTab() {
		return dresses;
	}
	public WebElement getTshirtTab() {
		return tshirt;
	}
	
	
	///-----tab navi
	
	public String womenPageNavi()  {
		women.click();
		return driver.getTitle();
	}
	public String dressesPageNavi()  {
		dresses.click();
		return driver.getTitle();
	}
	public String tshirtPageNavi()  {
		tshirt.click();
		return driver.getTitle();
	}
	
	public void newsletterBox( ) {
		int random = new Random().nextInt(0);
		String email= "arthivino86" +  random  + "@gmail.com";
		WebElement email_ID=clickemail;
		 email_ID.sendKeys(email);
	       clickemail.click();
	       System.out.println("The emailID is : \n"  +email);
	       }
	public void getClickEmailButton()  {
		clickemail.click();
	}
	
	
	///-----size of the dress
	
    public WebElement Ssize() {
	dresses.click();
	return small;
}
    public WebElement msize() {
    	dresses.click();
    	return medium;
    }
    public WebElement lsize() {
    	dresses.click();
    	return large;
    }
    public void getAddToCart()
    {
    	dresses.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(dress).build().perform();
    	addcart.click();
    }
    public String Success()
    {
    	return successfull.getText();
    }
	}
		
	
	
	
	
	
	
	


	
	
	
		
		
	
	
	