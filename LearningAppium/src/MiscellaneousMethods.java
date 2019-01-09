import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscellaneousMethods extends base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement>driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To cross check which build you have in your system, you use the following command.There are different activity for dev build and QA build.
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());//gives you whether you are in hybrid, native or webview
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
		//driver.hideKeyboard();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));// pressKey(new KeyEvent(AndroidKey. method will be used for all actions in android

}
}