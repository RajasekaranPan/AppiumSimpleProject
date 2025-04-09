import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumTest {

    //Refer below channels
    // https://www.youtube.com/watch?v=v0GhPH8tz1s&list=PLox9xfUeaKQ5J0JA7K5948v-km6blF0nQ&index=24
    // https://www.youtube.com/watch?v=718M2yczkew

    //  Other channels to know driver.context()
    //  qavbox
    // SQA Step by Step


    public AppiumDriver appiumDriver;
    public AndroidDriver andriodDriver;

    public IOSDriver iOSDriver;

    @Test
     public void appiumRun() throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability("platformName", "Android");

        andriodDriver = new AndroidDriver(new URL(""), dc);

        iOSDriver = new IOSDriver(new URL(""), dc);

        appiumDriver = new AppiumDriver(new URL(""), dc);

        WebElement element = andriodDriver.findElement(By.id("element_id"));

        TouchAction action = new TouchAction(andriodDriver);


        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();

        WebDriverWait wait = new WebDriverWait(andriodDriver, Duration.ofSeconds(10));
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("element_id")));
        element1.click();


        andriodDriver.findElement(AppiumBy.accessibilityId("")).click();

        

    }
}
