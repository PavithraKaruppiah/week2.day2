package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		
		xpath.findElement(By.linkText("Leads")).click();
		xpath.findElement(By.linkText("Find Leads")).click();
		//xpath.findElement(By.xpath("(//label[text() = 'Lead ID:']//following::input[contains(@name,'id')])")).sendKeys("10223");
		xpath.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Pavi");
		xpath.findElement(By.linkText("Find Leads")).click();
		xpath.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//parent::a")).click();
		
		String title = xpath.getTitle();
		System.out.println(title);
		
		if(title.contentEquals("View Lead | opentaps CRM") )
		{
			System.out.println("Expected Title");
			}
		
			else {
				System.out.println("Wrong Title");
			}	
		
	xpath.findElement(By.linkText("Edit")).click();
	xpath.findElement(By.id("updateLeadForm_companyName")).clear();
	xpath.findElement(By.id("updateLeadForm_companyName")).sendKeys("Updated Company Name");
	xpath.findElement(By.xpath("//input[@value='Update']")).click();
	
	String text = xpath.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(text);
	
	xpath.close();
		}

	}


