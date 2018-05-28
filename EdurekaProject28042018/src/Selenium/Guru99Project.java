package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {
	ChromeDriver driver;
	String url = "http://demo.guru99.com/v4";
	
	public void invokeBrowser(){
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Ambu\\eclipseworkspace\\libs\\chromedriver_win32\\chromedriver.exe");
		
		
		// \n \t -- escape character
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		
	}
	
	public void login(String userId, String password){
		driver.findElement(By.name("uid")).sendKeys(userId);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
	}
}
