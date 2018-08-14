package reddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jabong {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\seleniumjars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.jabong.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"mainTopNav\"]/li[5]/a"));

	}

}
