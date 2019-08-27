package purchase4test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import purchase3.BasePage;
import purchase3.HomePageObject;

public class HomePageTest {
	
	HomePageObject homePage;
    BasePage bp;

	public HomePageTest() {
		bp = new BasePage();
		homePage = new HomePageObject();
	}

	@Test
	public void ToVerifyWomenTab() {
		AssertJUnit.assertTrue(homePage.getwomenTab().isDisplayed());
	}
	@Test
	public void ToVerifydressesTab() {
		AssertJUnit.assertTrue(homePage.getdressTab().isDisplayed());
	}
	@Test
	public void ToVerifytshirtTab(){
		AssertJUnit.assertTrue(homePage.getTshirtTab().isDisplayed());
	}
	@Test
	public void AllThree()  {
		System.out.println(homePage.womenPageNavi());
		System.out.println(homePage.dressesPageNavi());
		System.out.println(homePage.tshirtPageNavi());
	}
	@Test
	public void navigateToDressPage() {
		System.out.println(homePage.dressesPageNavi());
	}
	@Test
     public void sizes()	
    {
		System.out.println(homePage.Ssize().getText());
		System.out.println(homePage.msize().getText());
		System.out.println(homePage.lsize().getText());

	}
	@Test
	public void AddToCart()
	{
		homePage.getAddToCart();
		System.out.println(homePage.Success());
	}
	
}
	
	
	
	
	
	
	
	

	

	

