package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuviLocators {

	public static void main(String[] args) {
		// Setup WebDriver
		WebDriverManager.chromedriver().setup();

		// Launching Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Navigate to Website
		driver.navigate().to("https://www.guvi.in/register");
		
		// ID Locators
	    driver.findElement(By.id("name"));
	    driver.findElement(By.id("email"));
	    driver.findElement(By.id("password"));
	    driver.findElement(By.id("mobileNumber"));
	    driver.findElement(By.id("signup-btn"));
	    
	    // ClassName Locators
	    driver.findElement(By.className("sign-up-form signup-custom-w"));
	    driver.findElement(By.className("form-control password-err"));
	    driver.findElement(By.className("form-control countrycode-left"));
	    driver.findElement(By.className("btn signup-btn"));
	    driver.findElement(By.className("signup-content-detail")); 
	    driver.findElement(By.className("login"));
	    driver.findElement(By.className("iti__selected-dial-code"));
	    
	    // TagName Locators
	    driver.findElement(By.tagName("h2"));
	    driver.findElement(By.tagName("html"));
	    
	    // CSS Selector Locator
	    driver.findElement(By.cssSelector(".sign-up-coures-free.signup-custom-w"));
	    driver.findElement(By.cssSelector(".sign-up-form.signup-custom-w"));
	    driver.findElement(By.cssSelector("div[class='sign-up-form signup-custom-w'] h2"));
	    driver.findElement(By.cssSelector("div[class='email-line mt-4'] p"));
	    driver.findElement(By.cssSelector("body > main:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(2)"));
	    driver.findElement(By.cssSelector("body > main:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(5) > div:nth-child(1)"));
	    driver.findElement(By.cssSelector("#name"));
	    driver.findElement(By.cssSelector("#email"));
	    driver.findElement(By.cssSelector("#password"));
	    driver.findElement(By.cssSelector("#mobileNumber"));
	    driver.findElement(By.cssSelector("#signup-btn"));
	    
	    // XPath Locator
	    driver.findElement(By.xpath("//html"));
	    driver.findElement(By.xpath("//div[@class='sign-up-coures-free signup-custom-w']"));
	    driver.findElement(By.xpath(".sign-up-form.signup-custom-w"));
	    driver.findElement(By.xpath("//h2[normalize-space()='Sign Up']"));
	    driver.findElement(By.xpath("//body/main[@id='sign-in-page']/section[@class='signup-page']/div[@class='section']/div[@class='sign-up-form signup-custom-w']/p[1]"));
	    driver.findElement(By.xpath("//a[normalize-space()='Login']"));
	    driver.findElement(By.xpath("(//div[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb'])[1]"));
	    driver.findElement(By.xpath("//p[normalize-space()='Or Sign Up with Email']"));
	    driver.findElement(By.xpath("//body/main[@id='sign-in-page']/section[@class='signup-page']/div[@class='section']/div[@class='sign-up-form signup-custom-w']/form[@id='signup-form']/div[1]"));
	    driver.findElement(By.xpath("//input[@id='name']"));
	    driver.findElement(By.xpath("//div[@id='emailgroup']"));
	    driver.findElement(By.xpath("//input[@id='password']"));
	    driver.findElement(By.xpath("//input[@id='mobileNumber']"));
	    driver.findElement(By.xpath("//div[@class='iti__selected-dial-code']"));
	    driver.findElement(By.xpath("//a[@id='signup-btn']"));
	    
	    
	   
	    
	}

}
 