package org.webdrivermethodtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAllMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.in/"); 
		driver.manage().window().minimize(); driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.meesho.com/");
		
	}

}