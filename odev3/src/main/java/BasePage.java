import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BasePage {

    private  void openBrowser{

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("user-data-dir=C:\Users\aydin\AppData\Local\Google\Chrome\User Data"");
            driver = new ChromeDriver(options);
        }
    }
}

