import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Challenge {

	public static void main(String[] args)
	{
		// Creating a script for entering text into disabled filed using javascriptececutor
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://lnkd.in/deJDkARE");
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Pallavi");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("document.getElementById('pass').disable=false");
		js.executeScript("document.querySelector(\"#pass\").disabled=false");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pasupuleti");	
		driver.quit();
		
	}
}