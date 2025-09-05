package selenium.homeassign;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeadAssign {
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
	driver.findElement(By.partialLinkText("Leads")).click();
	driver.findElement(By.partialLinkText("Create Lead")).click();
	driver.findElement(By.className("inputBox")).sendKeys("CTS");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ARUNASID");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MAgiKavi");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TEAMLEAD");
	WebElement sour=driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select sel=new Select(sour);
	sel.selectByIndex(4);
	driver.findElement(By.name("submitButton")).click();
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
}
}
