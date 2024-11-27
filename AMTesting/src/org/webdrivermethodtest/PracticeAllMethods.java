package org.webdrivermethodtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAllMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.one8.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/cristiano/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demowebshop.tricentis.com/login");
		//driver.switchTo().activeElement().sendKeys("nitin");
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.sendKeys("nitin");
		driver.findElement(By.id("Password")).sendKeys("1111");
		emailTextBox.sendKeys("mishra@gmail.com");
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		
	}

}
