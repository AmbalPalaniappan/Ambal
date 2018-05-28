package Selenium;

import java.awt.AWTException;

public class DemoCaseStudy3GoIndigo {

	public static void main(String[] args)throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
      Casestudy3GoIndigo GI= new Casestudy3GoIndigo();
		
		GI.invokeBrowser();
		GI.onewayFlightSelection("Bengaluru", "Lucknow");
		
				
		}

}
