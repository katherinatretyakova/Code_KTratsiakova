package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnittestPage {

	By Slogan = By.xpath(".//*[@id='home']/div[1]/div/div[1]/div/div[1]/p");

	FirefoxDriver driver;

	AboutPage objAboutPage;
	ProductPage objProductPage;

	@Before
	public void setUp() {

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

		driver.get("https://uptake.com/");
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}

	}

	@Test
	public void testSearch() {

		objAboutPage = new AboutPage(driver);
		objAboutPage.verifyAboutPage();
		driver.navigate().back();
	
		
		if (driver.findElement(Slogan).isDisplayed())
			;
		System.out.println("HomePage test is Pass");
		driver.navigate().back();
        driver.navigate().refresh();
		objProductPage = new ProductPage(driver);
		objProductPage.verifyProductPage();
		driver.navigate().back();

	}

}
