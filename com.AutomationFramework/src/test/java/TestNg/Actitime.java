package TestNg;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Actitime {
	 WebDriver driver= new ChromeDriver();
	 
     @Test(priority = 1)
     
     public void loginTestScript()
     {
    	 driver.get(" http://127.0.0.1/login.do");
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	 driver.findElement(By.name("username")).sendKeys("admin");
    	 driver.findElement(By.name("pwd")).sendKeys("manager");
    	 driver.findElement(By.name("remember")).click();
    	 driver.findElement(By.id("loginButton")).click();
     }
     @Test(priority = 2)
     public void createuserTestScript()
     {
    	 driver.findElement(By.xpath("//a[@class='content users']")).click();
    	 driver.findElement(By.xpath("//input[@value='Create New User']")).click();
    	 driver.findElement(By.name("username")).sendKeys("Ram");
    	 driver.findElement(By.name("passwordText")).sendKeys("Ram123");
    	 driver.findElement(By.name("passwordText")).sendKeys("Ram123");
    	 driver.findElement(By.name("passwordTextRetype")).sendKeys("Ram123");

    	 driver.findElement(By.name("firstName")).sendKeys("sagar");
    	 driver.findElement(By.name("lastName")).sendKeys("patil");
    	 driver.findElement(By.name("workdayDurationStr")).sendKeys("9:00");
    	 driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();


    	 

     }

}
