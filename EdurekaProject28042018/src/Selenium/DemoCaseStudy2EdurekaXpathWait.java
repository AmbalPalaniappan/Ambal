package Selenium;

import java.awt.AWTException;

public class DemoCaseStudy2EdurekaXpathWait {

	public static void main(String[] args)throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
      CaseStudy2EdurekaXpathWait cs= new CaseStudy2EdurekaXpathWait();
		
		cs.invokeBrowser();
		cs.searchcourseandValidate("Selenium Certification Training");
		
		cs.SelectAllcourses("javascript:void(0)"); 
		
				
		}

}
