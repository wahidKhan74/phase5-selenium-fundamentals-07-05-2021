package com.webapp.test.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSourceURLTest {

	public static void main(String[] args) {

		// 1. formulate test url
		final String siteURL = "https://www.amazon.in/";
		final String driverPath = "drivers/chromedriver";

		// 2. set selenium system property
		System.setProperty("webdriver.chrome.driver", driverPath);

		// 3. Instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();

		// 4. Launch browser window.
		driver.get(siteURL);
		// search data in search bar
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("iphone 12 max pro");
		searchBar.submit();		

		// 5. test evaluation
		String expectedTitle = "Amazon.in : iphone 12 max pro";
		if (expectedTitle.equals(driver.getTitle())) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + driver.getTitle());

		// 6. close driver.
		driver.close();
	}

}
