import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class openAppOnDevice {
	//Download the APK info from APP store and look for details about your APP
	//Enable the developer mode in settings of android
	//need to know the package and activity name of the APP. Each page is defined as an activity
	
	public static void main(String[] args) throws MalformedURLException {
		//File appDir=new File("src");//To open the APP //Not a mandatory step
		
		DesiredCapabilities cap=new DesiredCapabilities();//DesiredCapabilities is a class
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 25);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.geniecompany.AladdinConnect");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.geniecompany.views.SplashActivity");//First activity in the APP which is here the splash screen
		
   AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub") ,cap);//connectiontoserverlink is the IP address for the local host

	}

}
