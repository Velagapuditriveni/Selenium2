package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.excelutility.Excelutility;



public class Jainbook_Advancesearchpage {
	WebDriver driver;
	 By login=By.linkText("Login");
	    By Email=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[1]/input");
	    By password=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[2]/input");
	    By advancesearch=By.xpath("//*[@id=\"navigation\"]/ul/li[1]/a");
	    By loginsubmit=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[3]/input");
	    By ISBN=By.id("txt_isbn");
		By Searchbutton=By.id("btn_advancedSearch");
		By addtocart=By.xpath("/html/body/form/div[3]/div[2]/div/div/div/div[2]/div[6]/span/a");
		By continueshopping=By.id("btn_ContinueShopping");
		By cartdetails=By.xpath("/html/body/form/div[3]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/a");  
		By checkout=By.className("btn item-checkout-btn");
		By removecart=By.xpath("//*[@id=\"ContentPlaceHolder1_GridView1\"]/tbody/tr[2]/td[7]/a/i");
	    By Myaccount=By.xpath("//*[@id=\"form1\"]/div[3]/header/div[2]/div/div[1]/div/ul/li/a/span[1]");
	    By wish=By.xpath("//*[@id=\"Wishlist\"]");
		By logout=By.xpath("//*[@id=\"logout\"]");
	   
	    public void launch() { // url for launch the chrome
			System.setProperty("webdriver.chrome.driver",  "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
		}
		public void LoginPage() //using webdriver get visting the testing website
		{
			driver.get("https://www.jainbookagency.com/india-largest-online-book-store.aspx");
			System.out.println(driver.getTitle());
		}
		
	    
	    public void login() throws IOException
	    {
	    	Excelutility a =new Excelutility();
			driver.findElement(login).click();
			driver.findElement(Email).sendKeys(a.excel_username(1)); // passing the vaild mail
			driver.findElement(password).sendKeys(a.excel_password(1)); // passing the vaild password
			driver.findElement(loginsubmit).click();
	    }
	    public void advancesearch()
	    {
	    	driver.findElement(advancesearch).click();
	    }
	    public void filldetails()
	    {
	    	driver.findElement(ISBN).sendKeys("9789387921511");
	    }
	    public void searchb()
	    {
	    	driver.findElement(Searchbutton).click();
	    }
	    public void addcart()
	    {
	    	driver.findElement(addtocart).click();
			driver.findElement(continueshopping).click();
	    }
		/*	public void details()
			{
			driver.findElement(cartdetails).click();
			
			WebElement a =driver.findElement(cartdetails);
			WebElement b=driver.findElement(checkout);
			Actions as=new Actions(driver);
			as.moveToElement(a);
			as.moveToElement(b).click().build().perform();
			}
			public void remove()
			
			{
			driver.findElement(removecart).click();
			Alert alert=driver.switchTo().alert();
			alert.accept()*/;
	    
	   /* public void cartdetails()
	    {
	    	driver.findElement(cartdetails).click();
	    }*/
	   /* public void removecart()
	    {
	    	driver.findElement(removecart).click();
	    }*/
			public void wishlist() throws InterruptedException
			{
				driver.findElement(Myaccount).click();
				WebElement b=driver.findElement(wish);
				Actions act=new Actions(driver);
				act.moveToElement(b).click();
				Thread.sleep(300);	
		    	driver.close();
			}
	    public void close() throws InterruptedException
	    {
	    	Thread.sleep(3000);
			driver.findElement(Myaccount).click();
			WebElement a=driver.findElement(logout);
			Actions act=new Actions(driver);
			act.moveToElement(a).click();
			Thread.sleep(300);	
	    	driver.close();
	    }
	    public void quit()
	    {
	    	driver.close();
	    }
		
}
