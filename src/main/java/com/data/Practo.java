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
		File f2 = new File("C:\\\\Users\\\\91959\\\\eclipse-workspace\\\\MiniProject\\\\txtfolder\\\\write.txt");
		boolean c = f2.createNewFile();
		System.out.println("File Created Successfully."+c);
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
			
			//Hospital 1
			
			WebElement h1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[3]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			System.out.println(h1.getText());
			WebElement info1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[3]/div/div[1]/div[2]/div"));
			System.out.println(info1.getText());
			System.out.println("=====================================================================================================");
	
			// Hospital 2
			
			WebElement h2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[4]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			System.out.println(h2.getText());
			String ps = (h2.getText());
			WebElement info2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]"));
			System.out.println(info2.getText());
			String ps1 =(info2.getText());
			System.out.println("=====================================================================================================");
						
			// Hospital 3
						
			WebElement h3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[5]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			System.out.println(h3.getText());
			WebElement info3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[5]/div/div[1]/div[2]"));
			System.out.println(info3.getText());	
			System.out.println("=====================================================================================================");						
						
						
			// Hospital 4
						
			WebElement h4 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[2]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			System.out.println(h4.getText());
			WebElement info4 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[2]/div/div[1]/div[2]"));
			System.out.println(info4.getText());	
			System.out.println("=====================================================================================================");
						

			// Hospital 5
						
			WebElement h5 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[8]/div/div[1]/div[1]/div/div[2]/div/a/h2"));
			System.out.println(h5.getText());
			WebElement info5 = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[3]/div[8]/div/div[1]/div[2]"));
			System.out.println(info5.getText());	
			System.out.println("=====================================================================================================");
			
			File fs = new File("C:\\Users\\91959\\eclipse-workspace\\MiniProject\\txtfolder\\write.txt");
			FileUtils.write(fs, ps);
			FileUtils.write(fs, ps1);
			
			
			
		}
	
	}

}