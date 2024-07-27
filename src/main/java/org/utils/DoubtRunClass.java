package org.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubtRunClass {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://katalon-demo-cura.herokuapp.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("menu-toggle")).click();
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	
	
	
}
}
