package com.data;
import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

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
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91959\\eclipse-workspace\\MiniProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		File f1 = new File("C:\\Users\\91959\\eclipse-workspace\\MiniProject\\txtfolder");
		boolean b = f1.mkdir();
		System.out.println("Folder Created Successfully."+b);
		//File f2 = new File("C:\\\\Users\\\\91959\\\\eclipse-workspace\\\\MiniProject\\\\txtfolder\\\\write.txt");
		//boolean c = f2.createNewFile();
		//System.out.println("File Created Successfully."+c);
		Actions Acc = new Actions(driver);
		Robot r = new Robot();
		String[] rw = getData();
		for(int i=0;i<=2;i++)
		{
			
			driver.get("https://www.practo.com/");
			Thread.sleep(2000);
			WebElement mou1 = driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input"));
			Acc.doubleClick(mou1).build().perform();
			WebElement location = driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input"));
			location.sendKeys(rw[i]);
			Thread.sleep(2000);
			WebElement hos = driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input"));
			hos.sendKeys("Hospital");
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			WebElement accr = driver.findElement(By.xpath("(//div [@class = 'c-filter__select--checkbox u-d-inlineblock u-valign--middle u-pos-rel'])[2]"));
			accr.click();
			Thread.sleep(2000);
			WebElement allfltr = driver.findElement(By.xpath("//span[@class = 'u-spacer--right-thin']"));
			allfltr.click();
			Thread.sleep(2000);
			WebElement phrm = driver.findElement(By.xpath("(//div [@class = 'c-filter__select--checkbox u-d-inlineblock u-valign--middle u-pos-rel'])[6]"));
			phrm.click();
			Thread.sleep(2000);
			System.out.println("----------------------------------------------"+rw[i]+"---------------------------------------------");
			
			// Hospital 1
			
			WebElement h1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[2]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			System.out.println(h1.getText());
			WebElement info1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[2]/div/div[1]/div[2]/div"));
			System.out.println(info1.getText());
			System.out.println("=====================================================================================================");
			// Hospital 2
			
			WebElement h2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[3]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			System.out.println(h2.getText());
			WebElement info2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[3]/div/div[1]/div[2]/div"));
			System.out.println(info2.getText());
			System.out.println("=====================================================================================================");
			
			// Hospital 3
			
			WebElement h3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[4]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			System.out.println(h3.getText());
			WebElement info3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div"));
			System.out.println(info3.getText());	
			System.out.println("=====================================================================================================");
			

				
			File str1 = new File("C:\\Users\\91959\\eclipse-workspace\\MiniProject\\write.java");
			Files.write
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

				 
				 /*
				if (try3 > 3.5)
				{
					
					System.out.println("Hospital Rating is : " +try3);
				}
				else if (try6 > 3.5)
				{
					WebElement try4 = driver.findElement(By.xpath("(//div [@class = 'u-spacer--bottom-less'])[5]"));
					String try5 = try4.getText();
					
					System.out.println("Hospital Rating is : " +try6);
				}
				
				*/
			
			/*
			
			
			//WebElement dtls1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[2]/div/div[1]/div[2]/div"));
			//System.out.println(dtls1.getText());
			*/
			//String data = new String();
			//data = h1.getText();
			
			
			
			
			
			
			
			
			
			
			//File f3 = new File("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\91959\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\MiniProject\\\\\\\\\\\\\\\\txtfolder\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\write.txt");
			
			
			//System.out.println("File Written Succesfully.");
			
			
			
			
			
			
			
			//ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
			//driver.switchTo().window(newTab.get(1));
		   // driver.close();
	
			
			
			
			/*
			// make new file
			
			// create file inside folder
			
			
			// To Write inside File
			FileWriter f3 = new FileWriter("C:\\\\\\\\Users\\\\\\\\91959\\\\\\\\eclipse-workspace\\\\\\\\MiniProject\\\\\\\\txtfile\\\\\\\\write.txt");
			BufferedWriter br = new BufferedWriter(f3);
			br.write("Hello", i, i);
			*/
			
			
			
			
		}
		
		

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*
		Thread.sleep(2000);
		
		
		WebElement hos1 = driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input"));
		hos1.sendKeys("Hospital");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		WebElement acc1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[1]/div/div/header/div[1]/div/div[2]/label/div"));
		acc1.click();
		
*/	
		
		
		
		
	
	
	}

}