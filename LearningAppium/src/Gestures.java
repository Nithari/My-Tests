import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static  io.appium.java_client.touch.TapOptions.tapOptions;//imported manually
import static  io.appium.java_client.touch.LongPressOptions.longPressOptions;//imported manually
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static  io.appium.java_client.touch.offset.ElementOption.element;//imported manually

public class Gestures extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement>driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		Thread.sleep(2000);
		//Tap
		TouchAction t=new TouchAction(driver);
		//t is the object which has all the methods of touchAction class
		WebElement expandList= driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		
		t.tap(tapOptions().withElement(element(expandList))).perform();//TouchAction concept should be completed with perform method.
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		Thread.sleep(2000);
		
	WebElement pn=	driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
