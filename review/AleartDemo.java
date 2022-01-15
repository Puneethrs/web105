package testngpackage;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


<..ok google..>

 
<so what>

<..big..>


public class AleartDemo {
	WebDriver driver;
	@Test(description = "Test case to open  application")
	public void startapp()
	{
		System.out.println("start the application");
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize(); 
	}
	@Test(priority= 1,description = "Test case to click on alert functionality")
	public void clickalert()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		Alert alt1=driver.switchTo().alert();
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		alt1.dismiss();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		
		alt1.accept();
	}
}
