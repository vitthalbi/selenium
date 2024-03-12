package SearchContext;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Launch the web application
		driver.get("file:///C:/Users/USER/Desktop/sign.html");
		//click on country
		driver.findElement(By.xpath("//select[@id='dropdown']")).click();
		
          WebElement multidropdown =driver.findElement(By.id("dropdown"));
             Select s= new Select(multidropdown);
             s.selectByIndex(1);
             s.selectByIndex(2);
             Thread.sleep(3000);
             s.deselectAll();
   
   
                /* for(int i=0;i<3;i++)
                     {
                      s.selectByIndex(i);
                      }
                 Thread.sleep(3000);

                  for(int i=0;i<3;i++)
                        {
	                     s.deselectByIndex(i);
                         }*/
	   

	}

}
