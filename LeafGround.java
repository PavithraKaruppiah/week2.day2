package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver leaf =new ChromeDriver();
		leaf.get("http://leafground.com/pages/Edit.html");
		leaf.manage().window().maximize();
		
		
		System.out.println("Title" + leaf.getTitle());
		
		if(leaf.getTitle().contains("Leaf")) {
			System.out.println("Contains Leaf");
		}
		else {
			System.out.println("No word");
		}
		
		System.out.println("Title" + leaf.getCurrentUrl());
		//System.out.println("Title" + leaf.getPageSource());
		System.out.println(leaf.findElement(By.name("username")).getAttribute("value"));
		System.out.println(leaf.findElement(By.name("username")).isEnabled());
		System.out.println(leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled());
		
		
		leaf.get("http://leafground.com/pages/Link.html");
		System.out.println(leaf.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("Button.html"));
		
		
		leaf.get("http://leafground.com/pages/Button.html");
		System.out.println(leaf.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println(leaf.findElement(By.id("color")).getText());
		System.out.println(leaf.findElement(By.id("color")).getLocation().getX());
		System.out.println(leaf.findElement(By.id("color")).getSize().getHeight());
		System.out.println(leaf.findElement(By.id("color")).getTagName());
		System.out.println(leaf.findElement(By.id("color")).isDisplayed());
		
		
		leaf.get("http://leafground.com/pages/checkbox.html");
		System.out.println(leaf.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[1]")).isSelected());
		System.out.println(leaf.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/input")).isSelected());
	}

}
