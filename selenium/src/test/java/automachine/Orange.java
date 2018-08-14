package automachine;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;


public class Orange {
WebDriver driver;
@BeforeGroups
	public void launchApp()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/") ;
		driver.manage().window().maximize();
		System.setProperty("webdriver.driver.chrome", "D:\\seleniumjars\\chromedriver.exe");
		
		}	

	public void login() {
		driver.findElement(By.xpath("//*[@id=\"divUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		
		
		
	}
	
	

	
}
