package com.sauravpractice.gmail_webui_test;

import java.sql.Driver;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSigninTest {

	@Test

	public void gmailSuccessfulLogin() {

		// 1. Go To Gmail Website

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zik50826\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://gmail.com");

		// 2. Fill in Username & Password

		WebElement username = driver.findElement(By.id("Email"));
		username.clear();
		username.sendKeys("udemyken@gmail.com");
		driver.findElement(By.id("next")).click();

		WebElement password = driver.findElement(By.id("Passwd"));
		password.clear();
		password.sendKeys("udemyken123");

	}

	@After

	public void tearDown() {

	}

}
