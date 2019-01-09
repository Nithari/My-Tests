import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollInAC extends base
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
        AndroidDriver<AndroidElement>driver=Capabilities();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	//xpath syntax //tagName[@attribute='value']use className as the tag name
    	
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Installation Video\"))"); DID NOT WORK
    	
		//"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))");code given by the trainer worked
    	
    	//INSTALLATION VIDEO
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Installation Video\").instance(0))");
		//driver.findElementByXPath("//android.widget.Button[@text='Installation Video']").click();
		
    	
    	//RESET PASSWORD
    	driver.findElementByXPath("//android.widget.EditText[@text='Email Address']").sendKeys("nitasha.ohd@gmail.com");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Reset Password\").instance(0))");
		driver.findElementByXPath("//android.widget.Button[@text='Reset Password']").click();
    	
    	//To do Store locator script as below not working
    	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceID(\"com.geniecompany.AladdinConnect:id/btnStoreLocator\"))");
		//driver.findElementByXPath("//android.widget.Button[2]").click();

		
	}

}
