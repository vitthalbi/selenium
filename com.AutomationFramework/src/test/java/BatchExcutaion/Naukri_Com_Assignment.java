package BatchExcutaion;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Naukri_Com_Assignment {
     @Test
	public  void naukri() {
		//Launch the browser
	WebDriver driver= new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//use implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//launch the web application
	driver.get("https://www.naukri.com/registration/createAccount?");
	//name text filed
	driver.findElement(By.id("name")).sendKeys("vivek patil");
	//Email text filed
	driver.findElement(By.id("email")).sendKeys("vikipatil@gmail.com");
	//Password text filed
	driver.findElement(By.id("password")).sendKeys("Viki@123");
	//mobile text filed
	driver.findElement(By.id("mobile")).sendKeys("7778889990");
	//click on fresher
	driver.findElement(By.xpath("//div[@data-val='fresher']")).click();
	//select the city
	driver.findElement(By.xpath("//span[text()='Pune']")).click();
	//select the check box
	driver.findElement(By.xpath("(//i[@class='ico resman-icon resman-icon-check-box'])[1]")).click();
	//click on register button
	driver.findElement(By.xpath("//button[@class='submitbtn resman-btn-primary resman-btn-regular']")).submit();

	//click on login 
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	//login directly
	driver.findElement(By.id("usernameField")).sendKeys("vivek patil");
	//password filed
	driver.findElement(By.id("passwordField")).sendKeys("Viki@123");
	//click on login button
	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).submit();

	}

}
