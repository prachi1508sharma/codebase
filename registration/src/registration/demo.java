package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// chrome driver path
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		// create driver obj for chrome.
		WebDriver driver = new ChromeDriver();

		// to maximize browser window.
		driver.manage().window().maximize();

		// To navigate the url
		driver.navigate().to("https://www.kloudlearn.com/");
		// To Delay execution for 2 sec.
		Thread.sleep(2000);

		// To click "sign up free" button.

		driver.findElement(By.xpath("//*[@id=\"navbar-main\"]/div/ul/li[3]/a/button")).click();
		Thread.sleep(2000);

		// To click "registration" button.
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/span/div/div/a/button")).click();
		Thread.sleep(2000);

		// To enter Email id in text box.
		driver.findElement(By.xpath("//*[@id=\"org_email\"]")).sendKeys("prachi1508sharma@gmail.com");
		Thread.sleep(2000);

		// To enter password in text box.
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("prachi@654321");
		Thread.sleep(2000);

		// To enter work space name.
		driver.findElement(By.xpath("//*[@id=\"org_name\"]")).sendKeys("Sigma Oss");
		Thread.sleep(2000);

		// To enter first name.
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Prachi");
		Thread.sleep(2000);

		// To enter last name
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Sharma");

         //To click on "Registration" button.
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[3]/div/div[6]/div/div/span/button"))
				.click();

	}

}
