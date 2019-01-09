import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends base  {

	public static void main(String[] args) throws MalformedURLException {
	
		AndroidDriver<AndroidElement>driver=Capabilities();

		//xpath, id, className, androidUIautomator locators can be used to identify objects as these are the most stable.
		//xpath syntax ("//tagName[@attribute='value']")use className as the tag name
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	driver.findElementById("android:id/checkbox").click();
	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();//Here we wrote [2] which is the second index because we have 2 attributes which have all locators same
	driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
	driver.findElementsByClassName("android.widget.Button").get(1).click();//When you find multiple elements with same className then you do this get (index)
	}

}
