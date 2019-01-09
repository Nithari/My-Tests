import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static  io.appium.java_client.touch.LongPressOptions.longPressOptions;//imported manually
import static  io.appium.java_client.touch.offset.ElementOption.element;//imported manually
import static java.time.Duration.ofSeconds;

public class SwipeDemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement>driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();//Here we used * which means any tagName is accepted because here the className which is the tagName had $ which is not accepted so we used the syntax use any tagName which satisfies content-dsc=9
		TouchAction t= new TouchAction(driver);
		//long press//on element//2 sec//move to another element and release//swipe from 15 to 45
		WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second=driver.findElementByXPath("//*[@content-desc='45']");
		
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
		
		
	}

}
