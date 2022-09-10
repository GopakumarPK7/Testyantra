import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class StartServerCustom
{
public void customServer()
{
	AppiumDriverLocalService server =AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withArgument(GeneralServerFlag.SESSION_OVERRIDE)
			.usingPort(4723).withLogFile(new File("../Appium/logs.txt")));
	server.start();
DesiredCapabilities dc=new DesiredCapabilities();
dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
dc.setCapability("noReset", true);
dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
dc.setCapability("appActvity", ".TouchScreenTestActivity");
}
}
