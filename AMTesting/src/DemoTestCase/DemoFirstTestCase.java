package DemoTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFirstTestCase {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("userid")).sendKeys("abc123@gmail.com");
		driver.findElement(By.cssSelector("button[type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1111");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.id("sgnBt")).click();
		Thread.sleep(3000);
		driver.navigate().to("https://www.ebay.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("JBL Speaker");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		driver.findElement(By.className("gh-p")).click();
		driver.navigate().to("https://www.simplilearn.com/");
		driver.navigate().back();
		driver.navigate().to("https://www.ebay.com/");
		driver.getTitle();
		driver.close();
	}

}
