package enuygun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class DriverSetup {

    WebDriver firefoxDriver;
    WebDriver chromeDriver;
    List<WebDriver> driverSetupList;

    ///////////////////////////////////////////////////////////////////////////
    // ÖDEV 3
    ///////////////////////////////////////////////////////////////////////////
    //DriverSetup are inherited with firefoxDriver using inheritance.
    class firefoxDriver extends DriverSetup{

        this.firefoxDriver = new DriverFirefox().driver;
    }

    //DriverSetup are inherited with chromeDriver using inheritance.
    class chromeDriver extends DriverSetup{

        this.chromeDriver = new DriverChrome().driver;
    }
    ///////////////////////////////////////////////////////////////////////////


    /*public DriverSetup() {

        this.firefoxDriver = new DriverFirefox().driver;
        this.chromeDriver = new DriverChrome().driver;
    }*/

    public List<WebDriver> setupDrivers() {

        //driverSetupList.add(this.firefoxDriver);
        driverSetupList.add(this.chromeDriver);
        return driverSetupList;
    }


    public void open(String url) {

        Utility.setDriverProps(DriverType.FIREFOX);
        this.firefoxDriver.get(url);
        this.chromeDriver.get(url);
        Utility.setDriverProps(DriverType.CHROME);

    }


    public ChromeDriver openChrome(String url) {
        Utility.setDriverProps(DriverType.CHROME);

        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }

    public FirefoxDriver openFirefox(String url){
        Utility.setDriverProps(DriverType.FIREFOX);

        FirefoxDriver driver = new FirefoxDriver();
        driver.get(url);
        return  driver;
    }
}