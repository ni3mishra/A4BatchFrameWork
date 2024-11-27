package org.webdrivermethodtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.unscreen.com/");
		
	}

}
