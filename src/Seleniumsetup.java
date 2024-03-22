import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumsetup {

	public static void main(String[] args) throws InterruptedException{
		
		
		
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoes");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> l1=driver.findElements(By.xpath("//*[@id='search']//h2/a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
		try {
		for(WebElement l2:l1) {
			l2.click();
			Thread.sleep(1000);
		}}catch(NoSuchElementException e)
		{
			System.err.println(e.getStackTrace());
		}
		finally
		{
		driver.quit();
		}
		
		
	}

}
