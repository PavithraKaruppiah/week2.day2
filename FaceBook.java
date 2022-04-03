package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver fb =new ChromeDriver();
		fb.get("https://en-gb.facebook.com/");
		fb.manage().window().maximize();
	//	fb.manage().timeouts().implicitlyWait();
		
		fb.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		fb.findElement(By.xpath("//input[@name='firstname']")).sendKeys("PAVI");
		fb.findElement(By.xpath("//input[@name='lastname']")).sendKeys("KR");
		fb.findElement(By.xpath("//input[@name='reg_email__'] ")).sendKeys("97474745870");
		fb.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Hello12345");
		
		WebElement daydrop = fb.findElement(By.xpath("//select[@name='birthday_day'] "));
		Select Day = new Select(daydrop);
		Day.selectByValue("10");
		
		WebElement Month = fb.findElement(By.xpath("//select[@title='Month'] "));
		Select months =new Select(Month);
		months.selectByVisibleText("Jan");
		
		WebElement Years = fb.findElement(By.xpath("//select[@id='year']"));
		Select year =new Select(Years);
		year.selectByValue("1988");
		
		fb.findElement(By.xpath("//label[text() = 'Female']//following-sibling::input ")).click();		
			
	}

}
