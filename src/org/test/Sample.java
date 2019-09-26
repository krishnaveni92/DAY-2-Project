package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Work\\WindowsHandling\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.com");
	WebElement search = d.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphonex");
	WebElement button=d.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
	button.click();
	WebElement item=d.findElement(By.xpath("(//span[text()='Simple Mobile Prepaid - Apple iPhone X (64GB) - Silver'])[1]"));
	item.click();
	WebElement crt=d.findElement(By.name("submit.add-to-registry.wishlist"));
	crt.click();
	WebElement mail=d.findElement(By.id("ap_email"));
	mail.sendKeys("1234@gmail.com");
	WebElement sbmt=d.findElement(By.id("continue"));
	sbmt.click();
	WebElement pass=d.findElement(By.id("ap_password"));
	pass.sendKeys("andhra123");
	WebElement sgn=d.findElement(By.id("signInSubmit"));
	sgn.click();
}
}
