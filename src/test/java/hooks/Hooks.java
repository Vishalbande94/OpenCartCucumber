package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Hooks {
static WebDriver driver;
Properties p;
    @Before
    public void setUp(){
        new Properties();
        driver=new ChromeDriver();
        //driver.get(p.getProperty("AppUrl"));
        driver.get("https://demo-opencart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @After
    public void tearDown(){
        driver.quit();

    }
    public Properties properties() throws IOException {
        FileReader file=new FileReader("C:\\Users\\visha\\IdeaProjects\\Project_BookCart_Cucumber\\config.properties");
        p=new Properties();
        p.load(file);
        return p;

    }

    @AfterStep
    public void addScreenShot(Scenario scenario){
        if(scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] screenShot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png",scenario.getName());
        }

    }
    public static WebDriver getDriver() {
        return driver;
    }
}
