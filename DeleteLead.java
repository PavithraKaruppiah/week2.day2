package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver xpath =new ChromeDriver();
		xpath.get("http://leaftaps.com/opentaps/control/main");
		xpath.manage().window().maximize();
		
		xpath.findElement(By.id("username")).sendKeys("DemoSalesManager");
		xpath.findElement(By.id("password")).sendKeys("crmsfa");
		xpath.findElement(By.className("decorativeSubmit")).click();
		xpath.findElement(By.linkText("CRM/SFA")).click();
		
		xpath.findElement(By.linkText("Leads")).click();
		xpath.findElement(By.linkText("Find Leads")).click();
		xpath.findElement(By.xpath("//span[contains(@class,'x-tab-strip-inner')]/span[(text()='Phone')]")).click();
		xpath.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("9");
		xpath.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		
		String text = xpath.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-firstName')]/a[1]")).getText();
		System.out.println(text);
										
		xpath.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).click();
		xpath.findElement(By.linkText("Delete")).click();
		xpath.findElement(By.linkText("Find Leads")).click();
		xpath.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		Thread.sleep(3000);
		
		xpath.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement Verify = xpath.findElement(By.xpath("//div[@class='x-paging-info]"));
	
		if(Verify.equals("No records to display")) 
		{
			System.out.println("No Duplicates");
			}
			else {
				System.out.println("Duplicate Record");
			}
		}
	}


