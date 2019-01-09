package com.AladdinConnect.Automate;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OpenAladdinConnect extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement>driver=Capabilities();

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//xpath syntax //tagName[@attribute='value']use className as the tag name
		//driver.findElementByAndroidUIAutomator("attribute(\"value\")")   SYNTAX when identifying with attribute
		
		driver.findElementByXPath("//android.widget.EditText[@text='Email Address']").sendKeys("nitasha.ohd@gmail.com");
		driver.findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("Genie789");
		driver.findElementByXPath("//android.widget.Button[@text='Sign In']").click();
		Thread.sleep(5000);
			
			TouchAction t=new TouchAction(driver);
			//TouchAction concept should be completed with perform method.
			
	WebElement icon = driver.findElementByXPath("//android.widget.ImageView[@NAF='true']");
	t.tap(tapOptions().withElement(element(icon))).perform();
	WebElement text = driver.findElementByXPath("//android.widget.Button[@text='Push to Open']");
	//t.tap(tapOptions().withElement(element(text))).perform();
	//WebElement history = driver.findElementByXPath("//android.widget.Button[@text='See History']");
	//t.tap(tapOptions().withElement(element(history))).perform();
	//WebElement more=driver.findElementByXPath("//android.widget.TextView[text='More']");
	//t.tap(tapOptions().withElement(element(more))).perform();
	
	}

}
