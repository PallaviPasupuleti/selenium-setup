import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		ChromeOptions op= new ChromeOptions();//https://www.tutorialspoint.com/how-to-click-allow-on-show-notifications-popup-using-selenium-webdriver
		op.addArguments("--disable-notifications");
		driver=new ChromeDriver(op);
		driver.get("https://www.redbus.in/");
		//driver.findElement(By.id("src")).sendKeys("Hyderabad");
		WebElement source=driver.findElement(By.id("src"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Hyderabad';", source);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(source));
		driver.findElement(By.id("dest")).sendKeys("Bengaluru");
		
		driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")));
		WebElement date= driver.findElement(By.xpath("(//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH'])[2]"));
		date.click();
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		WebElement Modify=driver.findElement(By.xpath("//div[@class='onward-modify-btn g-button clearfix fl']"));
		wait.until(ExpectedConditions.visibilityOf(Modify));
		driver.quit();
		}
}
