import org.example.App;
import org.junit.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        int result = App.add(3, 4);
        assertEquals(7, result);
    }
    @Test
    public void testTwo() throws MalformedURLException, InterruptedException {


        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setPlatform(Platform.VISTA);
       
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        
Map<String, Object> sauceOptions = new HashMap<>();
sauceOptions.put("username", "oauth-mahendramistri-9fa7e");
sauceOptions.put("accessKey", "ed9220fb-5092-412d-bc43-1b6e35ccbe60");
sauceOptions.put("build", "selenium-build-H0XKK");
browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
RemoteWebDriver driver1 = new RemoteWebDriver(url, browserOptions);

       
    
        driver1.get("https://reqres.in/");

        Thread.sleep(3000);
        driver1.navigate().to("https://www.google.com/");
        Thread.sleep(5000);
        driver1.close();
        driver1.quit();
    }
}
