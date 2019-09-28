package script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class mnu_Demo {
	WebDriver driver;
	
  @Test(dataProvider="dp")
  public void menu() throws InterruptedException {
	 WebElement wb= driver.findElement(By.xpath("//*[@class='full-screen-preview__frame']"));
	  driver.switchTo().frame(wb);
	  driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("opensourcecms");
	  driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("opensourcecms");
	  driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	  Thread.sleep(3000);
	  Actions action=new Actions(driver);
	  WebElement admin=driver.findElement(By.xpath("//*[text()='Admin']"));
	  action.moveToElement(admin).perform();
	  WebElement org=driver.findElement(By.xpath("//*[text()='Organization']"));
	  action.moveToElement(org).perform();
	  WebElement clk=driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/ul/li[2]/a/span"));
	  clk.click();
	  Thread.sleep(2000);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  wb=driver.findElement(By.xpath(""));
	  Select select1=new Select(wb);
	  select1.selectByVisibleText("");//can be passed using data provider or simply passing value in it
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://s1.demo.opensourcecms.com/s/44");

  }

  @AfterMethod
  public void afterMethod() {
  }

}
