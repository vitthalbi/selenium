package BatchExcutaion;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Account_Create_Assignment {
	@Test
	public void FacebookAccount() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");

		WebElement CreateNewAccountLink = driver.findElement(By.linkText("Create new account"));
		CreateNewAccountLink.click();
		

		WebElement FirstName = driver.findElement(By.name("firstname"));
		FirstName.sendKeys("vitthal");

		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("biradar");

		WebElement MobileOremail = driver.findElement(By.name("reg_email__"));
		MobileOremail.sendKeys("9876543210");
		
		WebElement NewPassword = driver.findElement(By.id("password_step_input"));
		NewPassword.sendKeys("abc@123");
		
		WebElement BD = driver.findElement(By.name("birthday_day"));
		BD.sendKeys("11");
		
		WebElement BM = driver.findElement(By.name("birthday_month"));
		BM.sendKeys("Jun");
		
		WebElement BY = driver.findElement(By.name("birthday_year"));
		BY.sendKeys("1998");
		
		
		WebElement Gender = driver.findElement(By.xpath("//label[text()='Male']"));
		Gender.click();

		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
		
}
}