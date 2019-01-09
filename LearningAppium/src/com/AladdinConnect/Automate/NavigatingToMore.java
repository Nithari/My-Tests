package com.AladdinConnect.Automate;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NavigatingToMore extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement>driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.EditText[@text='Email Address']").sendKeys("nitasha.ohd@gmail.com");
		driver.findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("Genie789");
		driver.findElementByXPath("//android.widget.Button[@text='Sign In']").click();
		Thread.sleep(40000);
		TouchAction t=new TouchAction(driver);
WebElement more= driver.findElementByXPath("//android.widget.TextView[@text='More']");
		
		t.tap(tapOptions().withElement(element(more))).perform();//TouchAction concept should be completed with perform method.
		Thread.sleep(10000);
		//xpath syntax //tagName[@attribute='value']use className as the tag name
		driver.findElementByXPath("//android.widget.TextView[@text='More']").click();
		
	}
		
		 
		

	}


