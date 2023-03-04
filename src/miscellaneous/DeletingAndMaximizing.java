package miscellaneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletingAndMaximizing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ISHSHUKL\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//as they are browser related operation it will come under manage()
		driver.manage().window().maximize();// to maximize the window
		//to delete cookies
		driver.manage().deleteAllCookies(); //it will delete all cookies
		driver.manage().deleteCookieNamed(null);//in this we will provide particular cookie name which we want to delete
		driver.manage().addCookie(null);//if we want to add any cookie we can provide the name here in string form
		//to delete session id
		driver.manage().deleteCookieNamed("sessionKey");
		//then click on any link
		//login page - verify url
		
		}

}
