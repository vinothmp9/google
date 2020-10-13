package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver", "./src/BrowserDrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		driver.findElement(By.xpath("//div[text()='For myself']")).click();
		driver.switchTo().defaultContent();
		/*WebElement firstname=driver.findElement(By.id("firstName"));
		firstname.click();
		firstname.sendKeys("1"+ Keys.ENTER );
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.click();
		lastname.sendKeys("1");
		WebElement username=driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("1");*/
		WebElement password=driver.findElement(By.xpath("//input[@type='password'][@name='Passwd']"));
		password.click();
		password.sendKeys("1");

	}

}
