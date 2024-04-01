import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redbus {

	public static void main(String[] args) throws NoSuchElementException {
		// TODO Auto-generated method stub
		WebDriver driver;
		ChromeOptions op= new ChromeOptions();//https://www.tutorialspoint.com/how-to-click-allow-on-show-notifications-popup-using-selenium-webdriver
		op.addArguments("--disable-notifications");
		driver=new ChromeDriver(op);
		driver.get("https://www.redbus.in/");
	/*	driver.findElement(By.id("src")).sendKeys("Hyderabad");
		WebElement source=driver.findElement(By.id("src"));
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Hyderabad';", source);*/
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		/*wait.until(ExpectedConditions.visibilityOf(source));
		driver.findElement(By.id("dest")).sendKeys("Bengaluru");*/
		
		driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='sc-cvbbAY jcDPOJ']")));
		/*WebElement date= driver.findElement(By.xpath("(//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH'])[2]"));
		date.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='sc-cvbbAY jcDPOJ']")));
		driver.findElement(By.xpath("//button[@id='search_button']")).click();*/
		String Month=driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]")).getAttribute("innerText");
		System.out.println(Month);	
		String[] Monthvalue=Month.split(" ");
		System.out.println(Monthvalue[0]);
		CalenderMonthSelection cs=new CalenderMonthSelection();
		cs.setMothofInd("Jun");
		int countvalue=cs.monthSelection(Monthvalue[0]);
		
		for(int i=0;i<countvalue;i++)
	       {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Layer_1']")));
			WebElement cursor=driver.findElement(By.xpath("//*[local-name()='svg']/*[name()='path' and @d='M25.53,0.13A2.49,2.49,0,0,1,27.3.86L72.21,45.77a6,6,0,0,1,0,8.49l-45,45a2.5,2.5,0,1,1-3.54-3.54l45-45a1,1,0,0,0,0-1.42L23.76,4.39A2.5,2.5,0,0,1,25.53.13Z']"));
			Actions a=new Actions(driver);
			a.moveToElement(cursor).click().build().perform();
	    	   
	       }
			boolean holiday_count_visibility=driver.findElements(By.xpath("//div[@class='holiday_count']")).size()>0;
			System.out.println(holiday_count_visibility);
			if(holiday_count_visibility==false)
			{
				System.out.println("0 Holidays");
			}
			else
			{
				String holiday=driver.findElement(By.xpath("//div[@class='holiday_count']")).getText();
				System.out.println(holiday);
			}
		  WeekendsSelection ws=new WeekendsSelection();
		  ws.weekends(driver);
		driver.quit();
		}
}
