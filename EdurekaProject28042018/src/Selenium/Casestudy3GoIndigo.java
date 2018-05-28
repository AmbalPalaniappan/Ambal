package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.WaitUtils;

public class Casestudy3GoIndigo {
	
	ChromeDriver driver;
	String url = "https://www.goindigo.in/?linkNav=home_header";
	
	@BeforeClass
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Ambu\\eclipseworkspace\\libs\\chromedriver_win32\\chromedriver.exe");
		
		// \n \t -- escape character
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
	}
	
	@Test
	public void onewayFlightSelection(String FromLoc, String ToLoc) throws InterruptedException {
		driver.findElement(By.linkText("One Way")).click();
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[2]/div[4]/div/div/div[3]/button"))).click();
	
		
		
     WebElement FromLocation = driver.findElement(By.xpath("//div[2]/form/div[1]/ul/li[1]/input[1]"));
		FromLocation.sendKeys(FromLoc);
		//WebDriverWait wait1 = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[2]/form/div[1]/ul/li[1]/input[1]")));
		
	//WaitUtils.fluentWait(driver, 20 ,2, By.xpath("//div[2]/form/div[1]/ul/li[1]/input[1]"));
		
		 WebElement ToLocation = driver.findElement(By.xpath("//div[2]/form/div[1]/ul/li[2]/input[1]"));
		 ToLocation.sendKeys(ToLoc);
		 
		//driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/section/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/ul/li[3]/div/div[1]/label[2]/select"));
		 WebElement AdultPassenger = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/section/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/ul/li[3]/div/div[1]/label[2]/select"));
			
			Select dropdown = new Select(AdultPassenger);
			WebElement SelectedOption;
			
		SelectedOption = dropdown.selectByIndex(2);
			
		
	}
	
	
}