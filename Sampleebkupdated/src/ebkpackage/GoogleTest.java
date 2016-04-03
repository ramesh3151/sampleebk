package ebkpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest{
	@Test
	public void init() throws InterruptedException{
		WebDriver dr=new FirefoxDriver();
		 dr.get("http://www.google.com");
		String b=dr.getTitle();
		System.out.println(b);
		Thread.sleep(10000);
		Assert.assertEquals(b, "Google");
		dr.quit();
}}
