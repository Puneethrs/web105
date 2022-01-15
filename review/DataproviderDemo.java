package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataproviderDemo {
  WebDriver driver;
// TODO Auto-generated method stub
@Test(dataProvider = "dp")
public void f(String email , String password){
driver.get("http://demowebshop.tricentis.com/login");
driver.manage().window().maximize();
driver.findElement(By.id("Email")).sendKeys("Lokeshps@gmail.com");
driver.findElement(By.name("Password")).sendKeys("lokeshntr@9999");
driver.findElement(By.xpath("//input[@value='Log in']")).click();
driver.findElement(By.linkText("Log out")).click();
}
@DataProvider
public Object[][] dp() {
return new Object[][] {
new Object[] {"Lokeshps@gmail.com", "lokeshntr@9999"},
new Object[] {"lokintr@gmail.com", "lokeshntr@9999"},
};
}
@BeforeTest
public void beforeTest() {
System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
driver= new ChromeDriver();
}  
@AfterTest
public void afterTest() {
driver.close();
}
}



