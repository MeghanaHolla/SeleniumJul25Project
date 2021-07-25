package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	
	WebDriver driver;
	
	public void openBrowser() {
		driver = new ChromeDriver();
	}
	
	public void maximizeBrowserWindow() {
		driver.manage().window().maximize();
	}
	
	public void implementImplicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void navigateToApplication(String url) {
		driver.get(url);
	}

	public void enterInTextBox(String locValue, String data) {
		driver.findElement(By.id(locValue)).sendKeys(data);
	}
	
	public void clickButton(String loc, String locValue) {
		if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).click();
		}
		else if(loc.equals("xpath")) {
			driver.findElement(By.xpath(locValue)).click();
		}
	}
	
	public String getMessage(String loc,String locvalue) {
		String msgText = null;
		if(loc.equals("cssSelector")) {
			msgText = driver.findElement(By.cssSelector(locvalue)).getText();
		}
		else if(loc.equals("id")) {
			msgText = driver.findElement(By.id(locvalue)).getText();
		}
		return msgText;
	}
	
	public void closeApp() {
		driver.close();
	}
}
