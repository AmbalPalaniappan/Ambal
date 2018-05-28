package Selenium;

public class DemoChrome {

	public static void main(String[] args) {
		WorkingwithChrome ch = new WorkingwithChrome();
		
		ch.invokeBrowser();
		
		System.out.println(ch.getTitleOfThePage());
		
		ch.closeBrowser();

	}

}
