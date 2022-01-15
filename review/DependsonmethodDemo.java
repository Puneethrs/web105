package testngpackage;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DependsonmethodDemo {
WebDriver driver;
@Test(description = "Test case to open  application")
public void startapp()
{
System.out.println("start application");
System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/login");
driver.manage().window().maximize();
}

@Test(dependsOnMethods = "startapp")
public void loginapp()
{
System.out.println("successfully logged in");
driver.findElement(By.id("Email")).sendKeys("puni99@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("puneethrs");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
}

@Test(dependsOnMethods = "loginapp")
public void signoff()
{
System.out.println("singned out successfully");
driver.findElement(By.linkText("Log out")).click();
        driver.close();
}
}