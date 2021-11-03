


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;








public class Tests {
    WebDriver driver;
    Scenarios scenarios;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Doğukan/IdeaProjects/LcWaıkıkıTest/src/test/java/chromedriver.exe");
        driver = new ChromeDriver();
        scenarios=new Scenarios(driver);
        scenarios.driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        scenarios.driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);

    }



    @Test
    public void LcWaikiki2(){scenarios.LcWaikikiTest();
    }

    @After
    public void tearDown() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        scenarios.driver.quit();
        scenarios.driver.close();
    }
}