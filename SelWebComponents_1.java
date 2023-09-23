package task_20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelWebComponents_1 {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement cal = driver.findElement(By.id("datepicker"));
		cal.click();
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td/a[@data-date='22']")).click();
		System.out.println(cal);
	}
	
}
