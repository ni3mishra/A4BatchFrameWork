package DemoTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModificationOfDemoFirstTestCase {
	WebDriver driver;
	
	public void launchBrowser() {
		driver = new ChromeDriver();
	}
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	public void getUrl() {
		driver.get("https://www.ebay.com/");
	}
	public void searchProduct() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='gh-ac']")).sendKeys("JBL Speaker");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Daily Deals")).click();
	}
	public void navigate() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://www.simplilearn.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Title of the page is=> "+driver.getTitle());
	}
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		ModificationOfDemoFirstTestCase obj = new ModificationOfDemoFirstTestCase();
		obj.launchBrowser();
		obj.maximizeBrowser();
		obj.getUrl();
		obj.searchProduct();
		obj.navigate();
		obj.closeBrowser();
	}
}
