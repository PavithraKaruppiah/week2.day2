package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver xpath =new ChromeDriver();
		xpath.get("http://leaftaps.com/opentaps/control/main");
		xpath.manage().window().maximize();
		
		xpath.findElement(By.id("username")).sendKeys("DemoSalesManager");
		xpath.findElement(By.id("password")).sendKeys("crmsfa");
		xpath.findElement(By.className("decorativeSubmit")).click();
		xpath.findElement(By.linkText("CRM/SFA")).click();
		xpath.findElement(By.linkText("Contacts")).click();
		xpath.findElement(By.linkText("Create Contact")).click();
		xpath.findElement(By.id("firstNameField")).sendKeys("PAVITHRA");
		xpath.findElement(By.id("lastNameField")).sendKeys("Karuppiah");
		xpath.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Formal");
		xpath.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("LastName");
		xpath.findElement(By.name("departmentName")).sendKeys("ECE");
		xpath.findElement(By.id("createContactForm_description")).sendKeys("createContactForm_description");
		xpath.findElement(By.id("createContactForm_primaryEmail")).sendKeys("pavithra1karuppiah@gmail.com");
		WebElement state = xpath.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd =new Select(state);
		dd.selectByVisibleText("Missouri");
		
		xpath.findElement(By.xpath("//input[@value='Create Contact']")).click();
		xpath.findElement(By.linkText("Edit")).click();
		xpath.findElement(By.id("updateContactForm_description")).clear();
		xpath.findElement(By.name("importantNote")).sendKeys("Selenium Learning");
		xpath.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		String title = xpath.getTitle();
		System.out.println(title);
		
	}

}
