import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WeekendsSelection {

	public void weekends(WebDriver driver) {
		List<WebElement> dates=driver.findElements(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));
		for(WebElement date:dates)
		{
			String weekenddate=date.getText();
			System.out.println(weekenddate);
		}
		
	}
}
