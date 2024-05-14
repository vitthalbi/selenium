package BatchExcutaion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paytm {
    @Test
	public  void paytm() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.paytm.com");
		// to fetch the current Title of particular web page
		String Acutal_Title=driver.getTitle();
		String Expected_Title="Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
        if( Acutal_Title.equals(Expected_Title))
        {
        	System.out.println("Title is correct");
        }
        else
        {
        	System.out.println("Title is wrong");
        }
        // to fetch the current Url of current web page
        String Acutal_Url=driver.getCurrentUrl();
        String Expected_Url="https://paytm.com/";
        if( Acutal_Url.equals(Expected_Url))
        {
        	System.out.println("Url is correct ");
        }
        else
        {
        	System.out.println("Url is wrong");
        }
        }

}
