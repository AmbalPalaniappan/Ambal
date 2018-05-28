package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithChrome {
	
	ChromeDriver driver;
	String url = "http://qatechhub.com";
	
	public void invokeBrowser(){
		
				
		System.setProperty("webdriver.chrome.driver",
				"C:\\Ambu\\eclipseworkspace\\libs\\chromedriver_win32\\chromedriver.exe");
		
		
		// \n \t -- escape character
		driver = new ChromeDriver();
		
		Dimension dim = new Dimension(375, 740);
		
		driver.manage().window().setSize(dim);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		
		
		//Navigate commands
		driver.navigate().to("http://www.facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}
	
	public void closeBrowser(){
		//Closes the current active window
	//	driver.close();
		
		//Closed all the opened windows
		driver.quit();
	}
	
	public String getTitleOfThePage(){
		String title = driver.getTitle();
		
		return title;
	}
	

}
