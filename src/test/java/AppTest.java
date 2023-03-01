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

//            int result = App.add(3, 4);
//            assertEquals(7, result);

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setPlatform(Platform.VISTA);
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "selenium-build-5APUU");
        // sauceOptions.setCapability("name", "<your test name>");
        capabilities.setCapability("sauce:options", sauceOptions);
        // Create a RemoteWebDriver instance and connect to the local browsermvn
        WebDriver driver1 = new RemoteWebDriver(new URL("https://oauth-mahendramistri-b2316:b82ecf6f-d121-4c96-bef8-b187c151a0f6@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);
        // Perform the test using the driver instance
        driver1.get("https://reqres.in/");
        Thread.sleep(3000);
        driver1.navigate().to("https://github.com/mahendramistri/");
        driver1.close();
        driver1.quit();
    }
}