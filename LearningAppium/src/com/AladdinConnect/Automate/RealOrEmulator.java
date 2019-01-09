package com.AladdinConnect.Automate;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealOrEmulator {
		public static  AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException{
			AndroidDriver<AndroidElement> driver;
			File f=new File("src");
			File fs=new File(f,"app-flavorAladdinConnect-release.apk");
			//File fs=new File(f,"ApiDemos-debug.apk");
			DesiredCapabilities cap=new DesiredCapabilities();//DesiredCapabilities is a class
			if(device.equals("Emulator"))
			{
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nitasha_Demo_Pixel");
		}else if(device.equals("real"))
		{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}
			
			cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
 driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub") ,cap);//connectiontoserverlink is the IP address for the local host
		return driver;
		}

	
	}


