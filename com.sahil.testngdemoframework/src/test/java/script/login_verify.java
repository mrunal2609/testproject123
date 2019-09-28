package script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class login_verify {

	WebDriver driver;
	WebElement wb;
	
  @Test
  public void verify_Login() {
	  wb=driver.findElement(By.xpath("//a[@class='login']"));
	  wb.click();
	  
	  wb=driver.findElement(By.xpath("//input[@id='email']"));
	  wb.sendKeys("demo@gmail.com");
	  
	  wb=driver.findElement(By.xpath("//input[@id='passwd']"));
	  wb.sendKeys("Demo123@");
	  
	  wb=driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	  wb.click();
	  
	  wb=driver.findElement(By.xpath("//a[@title='View my customer account']"));
	  String data=wb.getText();
	  Assert.assertEquals(data, "sameer mane");
	  
	  
  }

//  @Test
//  public void conct_us() {
//	  wb=driver.findElement(By.xpath("//a[@title='Contact Us']"));
//	  wb.click();
//	  
//	  wb=driver.findElement(By.xpath("//input[@id='email']"));
//	  wb.sendKeys("demo123@gmail.com");
//	  
//	  wb=driver.findElement(By.xpath("//input[@name='id_order']"));
//	  wb.sendKeys("Demo123");
//	  
//	  wb=driver.findElement(By.xpath("//textarea[@name='message']"));
//	  wb.sendKeys("hi ,kashab");
//	  
//	  wb=driver.findElement(By.xpath("//button[@id='submitMessage']"));
//	  wb.click();
//  }
  @BeforeClass
  public void Setup() {
	  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
  }

  @AfterClass
  public void afterMethod() {
	  driver.close();
  }

}
