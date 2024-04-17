package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin_intoActitime {
	public static void main(String[] args) throws IOException {
		FLib lib  = new FLib();
		//fetching the url from property file
		String url = lib.getDataFromProperty("./src/test/resources/CommonData.properties", "Url");
		String username = lib.getDataFromExcelFile("./src/test/resources/ValidData.xlsx", "Sheet1", 1, 0);
		String password = lib.getDataFromExcelFile("./src/test/resources/ValidData.xlsx", "Sheet1", 1, 1);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=7ce126jrb2g8");
		//pass the username
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		
	}

}
