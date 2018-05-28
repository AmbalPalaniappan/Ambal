package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;


public class CaseStudy1 {

			WebDriver driver;
		String url = "https://www.edureka.co";
		
		public void invokeBrowser(String browserType){
			
			if(browserType.equals("chrome")){
			
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Ambu\\eclipseworkspace\\libs\\chromedriver_win32\\chromedriver.exe");
			
			// \n \t -- escape character
			driver = new ChromeDriver();
			
			} else if(browserType.equals("edge")){
				System.setProperty("webdriver.edge.driver",
						"C:\\Ambu\\eclipseworkspace\\libs\\MicrosoftWebDriver.exe");
				
				// \n \t -- escape character
				driver = new EdgeDriver();
				
			} else if(browserType.equals("firefox")){
				System.setProperty("webdriver.gecko.driver",
						"C:\\Ambu\\eclipseworkspace\\libs\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
			
			driver.get(url);
	}

		public void searchcourse(String course) {
			
			driver.findElement(By.id("homeSearchBar")).sendKeys(course);
			//WebDriverWait wait = new WebDriverWait(driver, 20);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("homeSearchBar")));
			
				 
									
			driver.findElement(By.id("homeSearchBar")).click();
}
		public void getAttributes(String course) {
			
			String CoursesLink = driver.findElement(By.linkText("Courses")).getText();
			System.out.println("CoursesLink :: "+ CoursesLink);
			
		
			String Name = driver.findElement(By.name("user_v1[query]")).getText();
			WebElement Xpath = driver.findElement(By.xpath("//span[1]/input[@id='homeSearchBar']"));
            			
		}
		public void Inspectlogin() {
			
				
			driver.findElement(By.partialLinkText("Log")).click();	
}
}