package classAction;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class ContextClickTest {
	WebDriver driver;

	@Test
	public void clickTest() {
		driver.get("http://omayo.blogspot.com/");
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.id("link1"));
		action.contextClick(link).perform();
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
