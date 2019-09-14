package registration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.kloudlearn.com/");
driver.findElement(By.xpath("//*[@id=\"navbar-main\"]/div/ul/li[3]/a/button")).click(); 
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/span/div/div/a/button")).click(); 
driver.findElement(By.xpath("//*[@id=\"org_email\"]")).sendKeys("prachi.sharma1508@gmail.com"); 
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);  
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("prachi@654321");
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);  
driver.findElement(By.xpath("//*[@id=\"org_name\"]")).sendKeys("Sigma Oss");
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);  
driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Prachi");
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);  
driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Sharma");
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);  
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[3]/div/div[6]/div/div/span/button")).click();

	}

}
