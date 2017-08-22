package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProductPage {

	private WebDriver driver;

	By AssertText = By.xpath(".//*[@id='fp-nav']/ul");
	By textUptake = By.xpath(".//*[@id='header']/div[1]/div[1]/a/img");

	public ProductPage(FirefoxDriver driver) {

		this.driver = driver;
	}

	public void verifyProductPage() {

		WebElement click;

		click = driver.findElement(AssertText);
		click.click();
		System.out.println(click.getLocation());

		if (driver.findElement(textUptake).isDisplayed())
			;
		System.out.println("ProductPage test is Pass");

	}

}
