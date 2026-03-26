package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import com.framework.regressionframework.utils.ScreenshotUtil; // add this
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();  // IMPORTANT
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("Browser launched successfully");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            ScreenshotUtil.capture(driver, result.getName());
        }

        driver.quit();
        System.out.println("Browser closed successfully");
    }
}