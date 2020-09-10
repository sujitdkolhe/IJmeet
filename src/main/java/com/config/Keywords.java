package com.config;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Keywords {
	/**
	 * This method is used to open specific browser. Browser name should be as
	 * follow :<br>
	 * <ol>
	 * <li>Chrome</li>
	 * <li>Firefox</li>
	 * <li>IE</li> only above mention browsers can be open using this method
	 * 
	 * @param browserName
	 * @author Sujit Kolhe
	 * 
	 */
	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();
			Constants.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();
			Constants.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			break;
		case "IE":
			
			Constants.driver = new InternetExplorerDriver();
			Constants.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			break;
		default:
			System.out.println("Invalid browser name : " + browserName);

		}
	}

	/**
	 * This method is used to launched the url in the browser is looking at. .
	 * 
	 * @param url
	 * @author Sujit Kolhe
	 * 
	 */
	public static void launchURL(String url) {
		Constants.driver.get(url);
	}

	/**
	 * This method is used to maximizes the current window which recently launched
	 * url.
	 * 
	 * @author Sujit Kolhe
	 * 
	 */
	public static void maximizeBrowser() {
		Constants.driver.manage().window().maximize();
	}

	/**
	 * This method is used to get the matching web element on the current page
	 * follow :<br>
	 * <ol>
	 * <li>XPATH</li>
	 * <li>ID</li>
	 * <li>CSS</li>
	 * <li>NAME</li>
	 * <li>CLASS</li>only above mention locators type can be select using this
	 * method
	 * 
	 * @return WebElement
	 * @author Sujit Kolhe
	 * 
	 */
	public static WebElement getWebElement(String locatorType, String locatorValue) {
		Constants.element = null;
		switch (locatorType) {
		case "XPATH":
			Constants.element = Constants.driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			Constants.element = Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			Constants.element = Constants.driver.findElement(By.id(locatorValue));
			break;
		case "NAME":
			Constants.element = Constants.driver.findElement(By.name(locatorValue));
			break;
		case "CLASSNAME":
			Constants.element = Constants.driver.findElement(By.className(locatorValue));
			break;
		case "LINKTEXT":
			Constants.element = Constants.driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIALINKTEXT":
			Constants.element = Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "TAGNAME":
			Constants.element = Constants.driver.findElement(By.tagName(locatorValue));
			break;
		default:
			System.err.println("Invalid Locator Type");
			
		}
		return Constants.element;
	}

	/**
	 * This method is used to click on target web element on current page.
	 * 
	 * @author Sujit Kolhe
	 * 
	 */
	public static void clickOnElement(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}

	/**
	 * This method is used to hover on target element to move to on current window.
	 * 
	 * @author Sujit Kolhe
	 * 
	 */
	public static void hoverOnElement(String locatorType, String locatorValue) {
		Constants.element = getWebElement(locatorType, locatorValue);
		Constants.action = new Actions(Constants.driver);
		Constants.action.moveToElement(Constants.element).perform();
	}
	/*
	 * This method captures screenshot for the viewport using Yandex AShot
	 * library and returns the Image
	 * 
	 * @Param:Accepts parameter the file-format in which we need the output
	 * Image
	 * 
	 * @Param:Accepts parameter as the location in which we want to save the
	 * screenshot taken
	 */

	public static void captureScreenshot(String ImageFormatType, FileOutputStream filepath) throws IOException {

		Constants.ashot = new AShot();
		Screenshot sc = Constants.ashot.takeScreenshot(Constants.driver);
		ImageIO.write(sc.getImage(), ImageFormatType, filepath);		

	}

	/*
	 * This method will capture the screenshot for the entire web-page by
	 * parsing it
	 * 
	 * @Param:Accepts int value as parameter i.e. the time in milliseconds for
	 * which the web-page will be parsed
	 * 
	 * @Param:Accepts parameter as the type of Image we want i.e. JPG or PNG
	 * 
	 * @Param:Accepts paramter as the location where we need to save the image
	 * output stream
	 */
	public static void captureFullScreenshot(int timeinMiliseconds, String formatName, FileOutputStream filepath)
			throws IOException {

		Constants.ashot = new AShot();
		Screenshot sc = Constants.ashot.shootingStrategy(ShootingStrategies.viewportPasting(timeinMiliseconds))
				.takeScreenshot(Constants.driver);
		ImageIO.write(sc.getImage(), formatName, filepath);

		

	}

	/*
	 * This method will capture the screenshot for the WebElement of our
	 * interest and which needs to be passed as a parameter
	 * 
	 * @Param:Accepts WebElement as a parameter for which we want the screenshot
	 * 
	 * @Param:Accepts Image format as a parameter the type of format which we
	 * want the image to be of
	 * 
	 * @Param:Accepts the parameter as location where we want our FileOutPut
	 * Stream to be stored at
	 */
	public static void captureWebElementScreenshot(WebElement element, String formatName,
			FileOutputStream filepath) throws IOException {

		Constants.ashot = new AShot();
		Screenshot sc = Constants.ashot.takeScreenshot(Constants.driver, element);
		ImageIO.write(sc.getImage(), formatName, filepath);
		
	}

	/**
	 * This method is used to typing the text in the target element.
	 *
	 * @param keysToSend character sequence to send to the element
	 * @author Sujit Kolhe
	 * 
	 */
	public static void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
	}

	/**
	 * This method is used to switch to a different frame or window.
	 *
	 * @return A TargetLocator which can be used to select a frame or window
	 * @author Sujit Kolhe
	 * 
	 */
	public static void switchToWindow(int windowIndex) {
		Set<String> windows = Constants.driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windows);
		Constants.driver.switchTo().window(list.get(windowIndex));
	}

	/**
	 * This method is used to create logging operations, except configuration and *
	 * See {@getLogger(String)} detailed information.
	 * 
	 * @author Sujit Kolhe
	 * 
	 */
	public static void loggerInfo(String message) {
		Logger logger = Logger.getLogger(Keywords.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info(message);
	}

	/*
	 * This method is used to delete cookies
	 *
	 * @author Sujit Kolhe
	 *
	 */
	public static void deleteAllCookies() {
		Constants.driver.manage().deleteAllCookies();
	}

	/*
	 * This method is used to sleep methods
	 * 
	 * @author Sujit Kolhe
	 * 
	 */
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.out.println("Timeout: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to read JSON file as expected.
	 *
	 * @param filepath the path of the file to read
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @author Sujit Kolhe
	 * 
	 */
	public static void readJsonFile(String filePath,String key) {
		try {
			Constants.obj= new JSONParser().parse(new FileReader(filePath));
		} catch (IOException | ParseException e) {
			System.out.println("Unable to read file" + e.getMessage());
			e.printStackTrace();
		}
		Constants.jsonObj=(JSONObject)Constants.obj;
		Constants.jsonArray=(JSONArray)Constants.jsonObj.get(key);
		System.out.println("Expected Size is:-"+Constants.jsonArray.size());	
		Iterator itr = Constants.jsonArray.iterator();
		while(itr.hasNext()) {
			Constants.expected=(String) itr.next();
		}
		Constants.expectedList = new ArrayList<String>();
		String[] getList = new String[ Constants.jsonArray.size()];
		for(int i=0;i<Constants.jsonArray.size();i++) {
			getList[i]=(String)Constants.jsonArray.get(i);
			Constants.expectedList.add(i,getList[i]);
		}
	}
	
	/**
     * This method will delete all the cookies for the current domain.
     * @author Sujit Kolhe
     * 
     */
	public static void deleteCookies() {
		Constants.driver.manage().deleteAllCookies();
	}
	
	/**
	 * This method is used to highlight element.
	 * @author Sujit Kolhe
	 */
    public static void highlightElement(String locatorType,String locatorValue ) {
    	Constants.element= getWebElement(locatorType, locatorValue);
    	JavascriptExecutor jse = (JavascriptExecutor)Constants.driver;
    	jse.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');", Constants.element);
    	jse.executeScript("arguments[0].setAttribute('style',border:solid 2px white')", Constants.element);
    }
 
	/**
	 * This method is used to Close the current window, quitting the browser if it's
	 * the last window currently open.
	 * 
	 * @author Sujit Kolhe
	 * 
	 */
	public static void closeBrowser() {
		Constants.driver.close();
	}

	/**
	 * This method is used to quits this driver, closing every associated window.
	 *  @author Sujit Kolhe
	 * 
	 */
	public static void quiteDriver() {
		Constants.driver.quit();
	}

	/**
	 * This method is used to select  value from dropdown.
	 * 
	 * @author Kapil Chavan
	 * 
	 */
	public static void selectValueFromDropdown(String locatorType, String locatorValue, String textToSelect) {
		
		WebElement element = getWebElement(locatorType, locatorValue);
		Select select = new Select(element);
		select.selectByVisibleText(textToSelect);
	}
}
