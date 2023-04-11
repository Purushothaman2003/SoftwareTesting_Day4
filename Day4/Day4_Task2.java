package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_Task2 {
	public static void main(String[]args)
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-orgins=*");
	driver=new ChromeDriver(co);
	driver.get("https://www.google.com");
	WebElement text=driver.findElement(By.name("q"));
	text.sendKeys("selenium"+Keys.ENTER);
	}
	

}
