package enuygun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Interface {
    WebDriver firefoxDriver;
    WebDriver chromeDriver;
    List<WebDriver> driverSetupList;


    ///////////////////////////////////////////////////////////////////////////
    // ÖDEV 3
    ///////////////////////////////////////////////////////////////////////////
    //Interface was written with DriverSetup.
    interface DriverSetup{

        this.firefoxDriver = new DriverFirefox().driver;
        this.chromeDriver = new DriverChrome().driver;

        void LoginPage();
    }

    class arayuz implements DriverSetup{
        @Override
        public void LoginPage() {
        }

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