package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver acme =new ChromeDriver();
		acme.get("https://acme-test.uipath.com/login");
		acme.manage().window().maximize();
		acme.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		acme.findElement(By.name("password")).sendKeys("leaf@12");
		acme.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String title = acme.getTitle();
		System.out.println("Title is " + title );
		
		acme.findElement(By.linkText("Log Out")).click();
	}

}
