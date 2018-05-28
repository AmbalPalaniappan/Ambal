package Selenium;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import utility.WaitUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



//import utility.WaitUtils;


public class CaseStudy2EdurekaXpathWait {

			ChromeDriver driver;
		String url = "https://www.edureka.co";
		
		@Test
		public void invokeBrowser(){
			
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Ambu\\eclipseworkspace\\libs\\chromedriver_win32\\chromedriver.exe");
			
			// \n \t -- escape character
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get(url);
			
			driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
	}
		
		@Test
		public void searchcourseandValidate(String course)throws AWTException{
		
			
			driver.findElement(By.id("homeSearchBar")).sendKeys(course);
			
						
			//driver.findElement(By.id("homeSearchBarIcon"));
			
			Robot action = new Robot();
			
			action.keyPress(KeyEvent.VK_ENTER);
			
			String expectedTitle = "Selenium 3.0 WebDriver Online Training | Selenium Certification Course | Edureka";
						
			WebDriverWait wait = new WebDriverWait(driver, 90);
			 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Selenium Certification Training"))).click();
						
			String title = driver.getTitle();
			
			
          Assert.assertEquals(title, expectedTitle, "Verified Title");
          
          System.out.println(title);
			
		}
		@Test
		public void SelectAllcourses(String href) throws InterruptedException {
						
			driver.navigate().back();
						
			WebDriverWait wait = new WebDriverWait(driver, 90);
			
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/div[4]/section/article/div[1]/div[1]/ul/div[1]/div/li/a[contains(@class ,'listitem')and (text()='All Courses')]")));		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/div[4]/section/article/div[1]/div[1]/ul/div[1]/div/li[1]/a")));
			
			List<WebElement> anchors = driver.findElements(By.tagName("a"));
	        Iterator<WebElement> i = anchors.iterator();
	        while(i.hasNext()) {
	            WebElement anchor = i.next();
	            if(anchor.getAttribute("javascript:void(0)").contains(href)) {
	                anchor.click();
	                break;
	            }
	        }
	    
			
			//driver.findElement(By.xpath("//div[3]/div[4]/section/article/div[1]/div[1]/ul/div[1]/div/li[1]/a")).click();		
		
			//WaitUtils.fluentWait(driver, 10 ,2, By.xpath("//div[3]/div[4]/section/article/div[1]/div[1]/ul/div[1]/div/li/a[contains(@class ,'listitem active')]"));
			
			//WebElement AllCoursesLink = driver.findElement(By.xpath("//div[3]/div[4]/section/article/div[1]/div[1]/ul/div[1]/div/li/a[contains(@class ,'listitem')and (text()='All Courses')]"));
			
			//action.moveToElement(AllCoursesLink).click().build().perform();
		}
		
}

	
