package com.ita.actitime.basic.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {
	public static WebDriver driver = null;

	/**
	 * @author Aravinda
	 * @param - default method to execute Tests in chrome Browser
	 * @return - returns Chrome Browser
	 */
	public static WebDriver getMyDriver() {
		System.out.println("--[ LOG ]-- Crating Chrome Driver ");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver getMyDriver(String type) {
		System.out.println("--[ LOG ]-- Crating " + type + " Browser Driver ");
		switch (type.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please contact your framework Developer to support " + type);
			break;
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

	/**
	 * @author Aravinda
	 * @param identifier - id,name, classname,
	 *                   tagname,linktext,partiallinktext,css,xpath
	 * @param value      - correstponding value associated to identifier
	 * @return - WEbElement or null
	 */
	public static WebElement getMyElement(String identifier, String value) {

		WebElement ele = null;
		System.out.println("Finding Element using " + identifier + " and its value " + value);
		switch (identifier) {
		case "id":
			ele = driver.findElement(By.id(value));
			break;
		case "name":
			ele = driver.findElement(By.name(value));
			break;
		case "classname":
			ele = driver.findElement(By.className(value));
			break;
		case "tagname":
			ele = driver.findElement(By.tagName(value));
			break;
		case "linktext":
			ele = driver.findElement(By.linkText(value));
			break;
		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(value));
			break;
		case "css":
			ele = driver.findElement(By.cssSelector(value));
			break;
		case "xpath":
			ele = driver.findElement(By.xpath(value));
			break;
		default:
			ele = null;
			System.out.println(" Please check the Identifier..!!!!!!");
			break;
		}

		return ele;

	}

	/**
	 * @author Aravinda
	 * @param identifier
	 * @param value
	 */
	public static void clickOnElement(String identifier, String value) {
		System.out.println("clicking on element with identifier " + identifier + " and " + value);
		getMyElement(identifier, value).click();

	}

	public static void typeOnElement(String identifier, String value, String textToType) {
		System.out.println("typing on element with identifier " + identifier + " and " + value);
		getMyElement(identifier, value).sendKeys(textToType);

	}

	public static String getMyElementText(String identifier, String value) {
		WebElement ele = getMyElement(identifier, value);
		String text = ele.getText();
		System.out.println("Got Text On ELE - " + text);
		return text;
	}

	public static void staticWait(int ms) {
		System.out.println("STATIC WAIT FOR " + ms);
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void takeScreenShot(String fileName) throws IOException {
		System.out.println("Capturing Screen Shot....");
		TakesScreenshot ss = (TakesScreenshot) driver;
		File screenShot = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot,
				new File("D:\\ITA_Automation\\eclipse_ws\\SeleniumTraining\\screenshots\\" + fileName + ".png"));

	}

	public static String getCurrentDateAndTime() {
		Date d = new Date();

		String date = d.toString();

		date = date.replace(" ", "_").replace(":", "_");
		
		return date;
	}
}
