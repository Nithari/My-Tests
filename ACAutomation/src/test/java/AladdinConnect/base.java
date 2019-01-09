package AladdinConnect;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static  AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{
		//My desired capabilities
		//Make sure your appium has started
		//Make sure your emulator is opened
		File f=new File("src");
		File fs=new File(f,"app-flavorAladdinConnect-release.apk");
		//File fs=new File(f,"ApiDemos-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();//DesiredCapabilities is a class
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nitasha_Demo_Pixel");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 XL API 28");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
   AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub") ,cap);//connectiontoserverlink is the IP address for the local host
	return driver;
	}

}
