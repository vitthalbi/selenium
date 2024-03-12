package SearchContext;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QsoiderdemoApp_Assignment_isSelected_Enabled_Displayed {

	public static void main(String[] args) throws InterruptedException {
        //Launch the browser
		WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
	    //use implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Launch the web application
         driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        // click on disabled button
        driver.findElement(By.xpath("//li[text()='Disabled']")).click();
 
      //name text filed
     WebElement nametextfiled = driver.findElement(By.xpath("//input[@name='name']"));
     nametextfiled.isEnabled();
     if(nametextfiled.isEnabled())
        {
           System.out.println("name text filed is Enabled");	 
        }
     else
        {
         System.out.println("name text filed is not Enabled");	 
        }
     //Email id text filed
     WebElement Emailidtextfiled = driver.findElement(By.xpath("//input[@id='email']"));
     Emailidtextfiled.click();
      if(Emailidtextfiled.isEnabled())
           {
            System.out.println("Email id text filed is Enabled");	 
           }
     else
        {
         	 System.out.println("Email id text filed is not Enabled");	 
         }
 
        //Password text filed
        WebElement passwordtextfiled = driver.findElement(By.xpath("//input[@type='password']"));
        passwordtextfiled.click();
       if(passwordtextfiled.isEnabled())
         {
	        System.out.println("Password text filed is Enabled");
         }
      else
          {
	         System.out.println("password text filed is not Enabled");
           }
        //check login link
        WebElement loginlink = driver.findElement(By.xpath("//a[@href='/ui/login']"));
          loginlink.click();
 
        if(loginlink.isEnabled())
          {
	         System.out.println("login link text filed is Enabled");
           }
        else
            {
	           System.out.println("login link text filed is not Enabled");
            }
 
              //fill the email address
 
                 driver.findElement(By.xpath("//button[@type='submit']")).submit();
 
 
 
 
 
 
 
 
 
 
	}

}
