package Selenium;

public class CaseStudy1LaunchEdureka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CaseStudy1 cs= new CaseStudy1();
		
		cs.invokeBrowser("chrome");
		cs.searchcourse("Selenium Certification Training");
		cs.getAttributes("Selenium Certification Training");
		cs.Inspectlogin();
		
		}

}
