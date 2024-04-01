import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class CalenderMonthSelection {
	
	private String Monthtofind;
	
	//Setting Month value for which holidays to be retrieved
	public void setMothofInd(String Monthofind)
	{
		this.Monthtofind=Monthofind;
	}
	
    
	public int monthSelection(String Mon)
	{
		Map<String, Integer> Month = new HashMap<String,Integer>();

	       Month.put("Mar", 3);
	       Month.put("Apr", 4);
	       Month.put("May", 5);
	       Month.put("Jun", 6);
	       Month.put("Jul", 7);
	       Month.put("Aug", 8);
	       Month.put("Sep", 9);
	       Month.put("Oct", 10);
	       Month.put("Nov", 11);
	       Month.put("Dec", 12);
	       Month.put("Jan", 1);
	       Month.put("Feb", 2);     
	       Integer MonthNumber=Month.get(Monthtofind);
	       System.out.println(MonthNumber);
	       Integer CurrentMonthNumber=Month.get(Mon);
	       Integer count=MonthNumber-CurrentMonthNumber;
	       System.out.println(count);
	       return count;
	     /*  if(Monthvalue[0].equals("May"))
			{
				String holiday=driver.findElement(By.xpath("//div[@class='holiday_count']")).getText();
				System.out.println(holiday);
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='Layer_1']")).click();
				String holiday=driver.findElement(By.xpath("//div[@class='holiday_count']")).getText();
				System.out.println(holiday);
			}*/
	       
	       
	}
}
