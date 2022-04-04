package SeleniumLab.TestSteps;

import SeleniumLab.utilities.DriverUtil;
import SeleniumLab.utilities.PropertiesFileReader;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

        @BeforeTest
        public void beforeTest(){
            DriverUtil.getDriver().manage().deleteAllCookies();
            DriverUtil.getDriver().get(PropertiesFileReader.getProperties("URL"));
            DriverUtil.getDriver().manage().window().maximize();
            DriverUtil.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        }
        @AfterTest
        public void afterTest(){
            DriverUtil.getDriver().quit();
        }
    }
