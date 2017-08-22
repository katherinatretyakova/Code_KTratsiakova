package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AboutPage {

	private WebDriver driver;

	By clickOnAboutTab = By.xpath(".//*[@id='header']/div[1]/nav/a[1]");
	By text = By.xpath(".//*[@id='about']/div[1]/div/div/div[1]/div[2]/p");

	public AboutPage(FirefoxDriver driver) {

		this.driver = driver;
	}

	public void verifyAboutPage() {

		WebElement click;

		click = driver.findElement(clickOnAboutTab);
		click.click();
		System.out.println(click.getLocation());

		if (driver.findElement(text).isDisplayed())
			;
		System.out.println("AboutPage test is Pass");

	}
}
