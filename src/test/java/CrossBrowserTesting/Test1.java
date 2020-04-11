package CrossBrowserTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void main() throws MalformedURLException {
		
		
		DesiredCapabilities obj = new DesiredCapabilities();
		obj.setBrowserName("Chrome");
		
		obj.setPlatform(Platform.WINDOWS);
		
		//Merging Chrome options
		ChromeOptions Options = new ChromeOptions();
		Options.merge(obj);
		
		
		
		
		String hubUrl="http://192.168.1.59:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),obj);
		driver.get("http://www.youtube.com");
		String title= driver.getTitle();
		Assert.assertEquals("Youtube", title);
		
	}

}
