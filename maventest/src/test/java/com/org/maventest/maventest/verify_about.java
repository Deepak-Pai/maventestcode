package com.org.maventest.maventest;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_about {

	//public static String chromeDriverPath = "/usr/local/bin/chromedriver";
public static String chromeDriverPath = "C:\\Users\\deepa\\eclipse-workspace\\PHP-App-Testing\\chromedriver.exe";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ec2-3-17-109-75.us-east-2.compute.amazonaws.com/index.php");
		String x = driver.getTitle();
		System.out.println(x);
		String z = null;
		try {
			driver.findElementById("About Us").click();
			z = driver.findElementById("PID-ab2-pg").getText();
			System.out.println(z);
		} catch (Exception e) {
			System.out.println("Invalid Element");
			z = "";
		}

		int a = z.length();
		System.out.println(a);
		if (z.length() > 0) {
			System.out.println("Success");
            
		} else {
			System.out.println("Failure");
		}
	}

}
