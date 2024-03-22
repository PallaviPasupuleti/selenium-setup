import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day1Challenge {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Authentication bypass open this link https://lnkd.in/dB3ZAGi7
		/* This code appears to be using some sort of interface or abstract class named HasAuthentication, which the driver object implements. The register method is being called on the driver object, and it takes a parameter that seems to be a lambda expression.

Let's break it down:

((HasAuthentication) driver): This part casts the driver object to the HasAuthentication type. This suggests that driver is of a type that implements or extends HasAuthentication.

.register(() -> new UsernameAndPassword("admin", "admin")): This part is calling the register method on the object obtained after the casting. It's passing a lambda expression as an argument to the register method.

() -> new UsernameAndPassword("admin", "admin"): This lambda expression represents a supplier that produces a new instance of UsernameAndPassword with the username "admin" and password "admin".
So, in summary, this code is registering a username and password pair "admin" for authentication with the driver object, which presumably implements some authentication mechanism through the HasAuthentication interface or class.*/
	/*	WebDriver driver;
		driver=new ChromeDriver();
		 ((HasAuthentication) driver).register(() -> new UsernameAndPassword("admin", "admin"));
		driver.get("https://the-internet.herokuapp.com/basic_auth");


		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); -- we can pass username and password directly in url, this is one  method and using HasAuthentication interface is second method
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Congratulations')]")));
		driver.quit();*/
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 13");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List <Integer> prices=new ArrayList<>();
		List<WebElement>l1=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(WebElement l2:l1)
		{
		String unsortedprice= l2.getAttribute("outerText").replace(",", "");
		int pricelist=Integer.parseInt(unsortedprice);
		prices.add(pricelist);
		}
		System.out.println(prices);
		Collections.sort(prices);
		System.out.println(prices);
		int max=Collections.max(prices);
		System.out.println(max);
		driver.quit();
	}

}

