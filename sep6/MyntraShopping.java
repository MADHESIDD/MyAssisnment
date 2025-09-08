package homeassign.sep6;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraShopping {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.myntra.com/");
		driver.manage().window().maximize();
		
	}

}
