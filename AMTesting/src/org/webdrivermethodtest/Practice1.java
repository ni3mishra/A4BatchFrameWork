package org.webdrivermethodtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		driver.findElement(By.name("As")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(8000);
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("itemquantity4530904")).sendKeys("2");
	}
}
