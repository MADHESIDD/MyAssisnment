package selenium.homeassign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebPage {
	public static void main(String[] args) {
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(Options);
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Test Aug Batch students");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("8");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.close();
	}

}
