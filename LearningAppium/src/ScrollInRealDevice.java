import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollInRealDevice extends base{

	public static void main(String[] args) throws MalformedURLException {
// The real estate of the real device is small so you will always add a 5 line code for swipe so that the TCs don't fail if the object in test is not in focus and we need to scroll down
//Emulator has a bigger size so we don't have this problem.
		AndroidDriver<AndroidElement>driver=Capabilities();

		//xpath, id, className, androidUIautomator locators can be used to identify objects as these are the most stable.
		//xpath syntax ("//tagName[@attribute='value']")use className as the tag name
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Dimension size=driver.manage().window().getSize();
		int x=size.getWidth()/2;
		int starty=(int) (size.getHeight() * 0.60);
		int endy=(int) (size.getHeight() * 0.10);
		//driver.swipe(x, starty, x, endy, 2000);*/// what to use here instead of swipe
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceID(\"com.geniecompany.AladdinConnect:id/btnStoreLocator\"))");
		driver.findElementByXPath("//android.widget.Button[2]").click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
