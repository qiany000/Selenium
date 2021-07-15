package classAction;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class OpenNewPageTest {
	WebDriver driver;

	@Test
	public void moveToTest() {
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		Actions action = new Actions(driver);
		
		driver.findElement(By.id("input-firstname")).sendKeys("Alex");
		driver.findElement(By.id("input-lastname")).sendKeys("YU");
		driver.findElement(By.id("input-email")).sendKeys("123456789@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("5141234567");
		driver.findElement(By.id("input-password")).sendKeys("12345678");
		driver.findElement(By.id("input-confirm")).sendKeys("12345678");
		//driver.findElement(By.name("agree")).click();
		//driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	}

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {
		//driver.close();
	}

}
