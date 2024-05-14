package BatchExcutaion;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zomato_Add_Suger {
  @Test
	public  void zomato() throws InterruptedException {
		//launch the browser 
		WebDriver driver= new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Launch the web-application
		driver.get("https://www.zomato.com/india");
		// click on Blinkit
		driver.findElement(By.xpath("//p[text()='Blinkit']")).click();
		//click on detect my location
		driver.findElement(By.xpath("//button[@class='btn location-box mask-button']")).click();
        // Click Search Text-Filed 
		Thread.sleep(2000);
		driver.findElement(	
		By.xpath("//div[@class='SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS']/ancestor::div[@class='SearchBar__Container-sc-16lps2d-3 ZIGuc']")).click();

	    //pass the product name Sugar
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='SearchBarContainer__Input-sc-hl8pft-3 irVxjq']")).sendKeys("sugar");
	     // click the product
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Fortune Sulphurless Sugar']")).click();
	    //click on add button
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath("//div[@class='AddToCart__UpdatedButtonContainer-sc-17ig0e3-0 lmopxc']"));
		Thread.sleep(2000);
		add.click();
	//click on + button
	WebElement addproduct = driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']"));
	//addproduct.click();
	for(int i=0;i<2;i++)
	{
		addproduct.click();
	}
	
	}

}
