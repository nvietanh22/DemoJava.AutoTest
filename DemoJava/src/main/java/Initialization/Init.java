package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Init {
    public static WebDriver driver = null;

    //Khởi tạo 1 hàm setup để dùng chung, sau này không cần phải viết lại nữa
    public static void Setup() {
//        System.setProperty("webdriver.chrome.driver", "/Users/minhhoa/Downloads/chromedriver_mac64/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "E:\\Auto-Test\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void TearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
