package package1;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class NewTest 
{
WebDriver dr;
@Test
public void Testcase1() throws Exception{
DesiredCapabilities capabilities=new DesiredCapabilities();
capabilities.setCapability("deviceName","Motorola xt1068");
capabilities.setCapability("platformVersion","5.0.1");
capabilities.setCapability("platformName","Android");
capabilities.setCapability("appPackage","com.whatsapp");
capabilities.setCapability("appActivity","com.whatsapp.Main");
dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
Thread.sleep(5000);
}


}
