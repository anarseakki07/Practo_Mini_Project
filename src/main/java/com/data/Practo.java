package com.data;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Practo extends Read
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91959\\eclipse-workspace\\MiniProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// To Maximize The Window
		driver.manage().window().maximize();
		
		// To Create Folder 
		File f1 = new File("C:\\Users\\91959\\eclipse-workspace\\MiniProject\\txtFolder");
		boolean b = f1.mkdir();
		System.out.println("Folder Created Successfully."+b);
		
		// To Create File in Folder
		File xp = new File("C:\\\\Users\\\\91959\\\\eclipse-workspace\\\\MiniProject\\\\txtFolder\\\\Cities.txt");
		boolean v = xp.createNewFile();
		System.out.println("File Created uccessfully."+v);
		
		// Actions and Robot is Imported For Key Press event and Click Event
		Actions Acc = new Actions(driver);
		Robot r = new Robot();
		
		// Data is Retrived From Read.java Class 
		String[] rw = getData();
		
		
		for(int i=0;i<=2;i++)
		{
			// Go to URL 
			driver.get("https://www.practo.com/");
			Thread.sleep(2000);
			
			// Double Click on Location Field
			WebElement mou1 = driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input"));
			Acc.doubleClick(mou1).build().perform();
			
			// Entering Data in Location Field
			WebElement location = driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input"));
			location.sendKeys(rw[i]);		
			Thread.sleep(2000);
			
			// Entering Data in Next Field as a type
			WebElement hos = driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input"));
			hos.sendKeys("Hospital");
			Thread.sleep(2000);
			
			// By Clicking Submit the Selection Using Key Event
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			// Click on Accredited filter to apply on given Selection
			WebElement accr = driver.findElement(By.xpath("(//div [@class = 'c-filter__select--checkbox u-d-inlineblock u-valign--middle u-pos-rel'])[2]"));
			accr.click();
			Thread.sleep(2000);
			
			// Click on Drop Down Icon
			WebElement allfltr = driver.findElement(By.xpath("//span[@class = 'u-spacer--right-thin']"));
			allfltr.click();
			Thread.sleep(2000);
			
			// Click On 24X7 Pharmacy Check box Option
			WebElement phrm = driver.findElement(By.xpath("(//div [@class = 'c-filter__select--checkbox u-d-inlineblock u-valign--middle u-pos-rel'])[6]"));
			phrm.click();
			Thread.sleep(2000);
			System.out.println("----------------------------------------------"+rw[i]+"---------------------------------------------");
			
			//Hospital 1
			
			WebElement h1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[3]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			String ps = (h1.getText());
			
			WebElement info1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[3]/div/div[1]/div[2]/div"));
			
			String ps1 = (info1.getText());
			
	
			// Hospital 2
			
			WebElement h2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[4]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			
			String ps2 = (h2.getText());
			WebElement info2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]"));
			
			String ps3 =(info2.getText());
			
						
			// Hospital 3
						
			WebElement h3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[5]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			
			String ps4 =(h3.getText());
			WebElement info3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[5]/div/div[1]/div[2]"));
			
			String ps5 =(info3.getText());
									
						
						
			// Hospital 4
						
			WebElement h4 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[2]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			
			String ps6 =(h4.getText());
			WebElement info4 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[2]/div/div[1]/div[2]"));
			
			String ps7 =(info4.getText());
			
						

			// Hospital 5
						
			WebElement h5 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[8]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			
			String ps8 =(h5.getText());
			WebElement info5 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[8]/div/div[1]/div[2]"));
			
			String ps9 =(info5.getText());
			
			// Making List of Hospital Using Set Function
			Set<String> se = new LinkedHashSet<String>();
			
			se.add(ps);
			se.add(ps1);
			se.add(ps2);
			se.add(ps3);
			se.add(ps4);
			se.add(ps5);
			se.add(ps6);
			se.add(ps7);
			se.add(ps8);
			se.add(ps9);
			
			System.out.println("____________________________________________________________________");
			
			se.forEach(t -> System.out.println(t));
			
			System.out.println("____________________________________________________________________");
			for(int l=0;l<=2;l++)
			{
			File fe = new File("C:\\\\\\\\Users\\\\\\\\91959\\\\\\\\eclipse-workspace\\\\\\\\MiniProject\\\\\\\\txtFolder\\\\\\\\Cities.txt");
			FileUtils.write(fe, se.toString());
			}

		}
		driver.close();
	
	}

}