package ass5W9D3;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeWebDriverAss3W9D3 {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 * 
	 * @throws InterruptedException
	 */

	@BeforeTest
	public void setUp() throws InterruptedException {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.codingdojo.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000); // wait web elements to load

	}

	/**
	 * Test cssSelector using StartsWith, EndsWith, & Contains
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {
		// to scroll down on a web page
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// define the web element to find it - used with EndsWith
		WebElement goTo = driver.findElement(By.cssSelector("div[class='carousel-inner'] a[class$='student']"));

		// scroll horizontally on a web page to a specific web element using Selenium
		js.executeScript("arguments[0].scrollIntoView(true);", goTo);
//		Thread.sleep(2000);

		// Find full_name TextField - used with StartsWith
		WebElement fullName = driver.findElement(By.cssSelector("div[class='form_info'] input[placeholder^='First ']"));
		fullName.sendKeys("Mawaddah");
//		Thread.sleep(2000);

		// Find email TextField - used with EndsWith
		WebElement email = driver.findElement(By.cssSelector("div[class='form_info'] input[placeholder$='Address']"));
		email.sendKeys("Hanbali");
//		Thread.sleep(2000);

		// wait until the web element appears.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("div[class='form_info'] div[class='iti__flag-container']")));

		// Find countryFlag - used with Contains
		WebElement countryFlag = driver
				.findElement(By.cssSelector("div[class='form_info'] div[class*='iti__flag-container']"));
		countryFlag.click();
//		Thread.sleep(2000);

		// select Saudi Arabia code - used with Contains
		WebElement saCode = driver.findElement(By.cssSelector("li[data-dial-code*='966']"));
		saCode.click();
//		Thread.sleep(2000);

		// Find phoneNumber TextField - used with StartsWith
		WebElement phoneNumber = driver.findElement(By.cssSelector("div[class='form_info'] input[placeholder^='201']"));
		phoneNumber.sendKeys("123456789");
//		Thread.sleep(2000);

		// Find location options - used with Contains
		WebElement location = driver.findElement(By.cssSelector("div[class^='form_info\'] option[value*='Los ']"));
		location.click();
		;
//		Thread.sleep(2000);

		// Find submit button - used with EndsWith
		WebElement submit = driver.findElement(By.cssSelector("div[class='form_info'] input[value$='Packet']"));
		submit.click();
		;
//		Thread.sleep(5000);

	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.close();

		// Quite the selenium
		driver.quit();
	}
}
