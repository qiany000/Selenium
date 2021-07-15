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

public class DragDropTest {
	WebDriver driver;

	@Test
	public void dragDropTest1() {
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions action = new Actions(driver);
		WebElement dragElement = driver.findElement(By.id("box1"));
		WebElement dropElement = driver.findElement(By.id("box101"));
		action.dragAndDrop(dragElement, dropElement).perform();
		
	}
	@Test
	public void dragDropTest2() throws InterruptedException {
		driver.get("http://omayo.blogspot.com/p/page3.html");
		Actions action = new Actions(driver);
		WebElement dragElement = driver.findElement(By.cssSelector("#post-body-6103478144908648662 > div:nth-child(4) > div.ui-content > form > div > div > div:nth-child(2) > a:nth-child(2)"));
		
		action.dragAndDropBy(dragElement, 200, 0).perform();
		//Thread.sleep(4000);
		//action.pause(4000);
		action.dragAndDropBy(dragElement, -100, 0).perform();
		
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
		driver.close();
	}

}
