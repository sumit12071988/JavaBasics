package OOPS1.Encapsulation.SeleniumArchitecture;

/**
 * 
 * @author Sumit
 * @implNote
 *  Driver Class
 */

public class BrowserTest {

	public static void main(String[] args) {
		SeleniumWebDriverBasicArchitecture driver = new SeleniumWebDriverBasicArchitecture();
		driver.launch("chrome", "MAC");
	}

}
