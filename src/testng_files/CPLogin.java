package testng_files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CPLogin extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  //sso link login
		  driver.get("***");
		  
		  //User name
		  driver.findElement(By.xpath("//input[@id ='logonIdentifier']")).sendKeys("***");
		  
		  //password
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("***");
		  
		  //Signin button
		  driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		  
		  Thread.sleep(2000);
		  
		  //Security question
		  driver.findElement(By.xpath("//input[@id='question']")).sendKeys("otis");
		  
		  //Click on continue button
		  driver.findElement(By.xpath("//button[text()='Continue']")).click();
		  
		  Thread.sleep(5000);
		  
		  System.out.println("Search LeftPanel  ");
		  driver.findElement(By.xpath("//*[@class='apps-icon off']")).click();  
		  
		  
		  System.out.println("Clicked LeftPanel  ");
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()='Service Requests']")).click();
		  
		  System.out.println("Service Request displayed  ");
    }
}