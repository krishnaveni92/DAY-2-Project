package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "F:\\Work\\WindowsHandling\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.snapdeal.com");
	WebElement search = d.findElement(By.id("inputValEnter"));
	search.sendKeys("iphone7");
	WebElement button=d.findElement(By.xpath("//span[text()='Search']"));
	button.click();
	WebElement sele=d.findElement(By.xpath("(//img[@title='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[1]"));
	sele.click();
	String parent = d.getWindowHandle();
	System.out.println(parent);
	Set<String> allwindows = d.getWindowHandles();
	System.out.println(allwindows);
	for(String x:allwindows)
	{
		if(!parent.equals(x))
			d.switchTo().window(x);
	}
	Thread.sleep(2000);
	WebElement crt=d.findElement(By.xpath("//span[text()='add to cart']"));
	crt.click();
	WebElement cst=d.findElement(By.xpath("//span[@class='price']"));
	String text = cst.getText();
	System.out.println(text);
	}
}
