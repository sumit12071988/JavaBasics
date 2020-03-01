package OOPS1.Encapsulation.SeleniumArchitecture;

/**
 * 
 * @author Sumit
 * @implNote
 * To Explain the basic Architecture of Selenium and Encapsulation inside Selenium
 */

public class SeleniumWebDriverBasicArchitecture {
	
	public void launch(String browser, String OS) {
		identifyBrowserThenAct(browser, OS);
	}
	
	private void identifyBrowserThenAct(String browser, String OS) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Launch Chrome");
			identifyOSForChromeThenAct(OS);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("Launch Firefox");
			identifyOSForFirefoxThenAct(OS);
		}		 	
	}
	
	
	private void identifyOSForChromeThenAct(String OS) {
		if (OS.equalsIgnoreCase("WIN")){
			System.out.println("WIN -- Chrome");
		}
		else if(OS.equalsIgnoreCase("MAC")) {
			System.out.println("MAC -- Chrome");
		}		
		else if(OS.equalsIgnoreCase("LINUX")) {
			System.out.println("LINUX -- Chrome");
		}
	}
	
	private void identifyOSForFirefoxThenAct(String OS) {
		if (OS.equalsIgnoreCase("WIN")){
			System.out.println("WIN -- Firefox");
		}
		else if(OS.equalsIgnoreCase("MAC")) {
			System.out.println("MAC -- Firefox");
		}		
		else if(OS.equalsIgnoreCase("LINUX")) {
			System.out.println("LINUX -- Firefox");
		}
	}
	
	
	
}
