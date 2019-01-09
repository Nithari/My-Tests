import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// 
		AndroidDriver<AndroidElement>driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByAndroidUIAutomator("attribute(\"value\")")   SYNTAX when identifying with attribute
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Validate clickable features
		//Syntax for identifying clickable property
		//driver.findElementByAndroidUIAutomator("new UiSelector().property(\"value\")"); property can be validated using new UiSelector
	System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());
		
		
		
		
		
		
	
	}

}
