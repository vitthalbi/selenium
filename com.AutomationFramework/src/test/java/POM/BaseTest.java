package POM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Vitthal Biradar
 */

public class BaseTest implements IAutoConstant {

	static WebDriver driver;

	//launching the browser
	public void setUp() throws IOException {
		FLib lib = new FLib();
		String URL = lib.getDataFromProperty(PROP_PATH, "Url");
		String browser = lib.getDataFromProperty(PROP_PATH, "browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get("http://127.0.0.1/login.do");
	
	}
	 
	
	
	//close the browse
	public void tearDown()
	{
		driver.quit();
	}
   
    //Actitime
    public void createuser()
   	{
    	//click on user icon
   		driver.findElement(By.xpath("//a[@class='content users']")).click();
   		//click on create new user button
   		driver.findElement(By.xpath(" //input[@value='Create New User']")).click();
   		//send the user-name in user text filed
   		driver.findElement(By.name("username")).sendKeys("abc");
   		//send the password in password text filed
   		driver.findElement(By.name("passwordText")).sendKeys("abc123");
   		//send the password in Re-password text filed
   		driver.findElement(By.name("passwordTextRetype")).sendKeys("abc123");
   		//click on first name text filed
   		driver.findElement(By.name("firstName")).sendKeys("Raju");
   		//click on last name text filed
   		driver.findElement(By.name("lastName")).sendKeys("Bhai");
   		//click on Duration
   		driver.findElement(By.name("workdayDurationStr")).clear();
      	//click on Duration and pass the value
   		driver.findElement(By.name("workdayDurationStr")).sendKeys("9:00");
   		//click on create user
   		driver.findElement(By.xpath("//input[@type='submit']")).click();
 
   	}
    

    public void createTask() throws InterruptedException
   	{
   		driver.findElement(By.xpath("(//img[@src='/img/default/pixel.gif?hash=1692528820'])[4]")).click();
   	//cancel this process
   		driver.findElement(By.xpath("//input[@id='DiscardChangesButton']")).click();
   		//click on create task link
   		driver.findElement(By.xpath("//a[text()='Create new tasks']")).click();
   		//click on select customer text field
   		WebElement dropdown = driver.findElement(By.xpath("//select[@name='customerId']"));
   		Select s = new Select(dropdown);
   		Thread.sleep(2000);
   		s.selectByValue("1");
   	} 
	
	
    public void logout()
   	{
   		driver.findElement(By.className("logout")).click();
   	} 

}