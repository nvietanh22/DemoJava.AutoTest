package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Init {
    public WebDriver driver;

    //Khởi tạo 1 hàm setup để dùng chung, sau này không cần phải viết lại nữa
    public void Setup() {
//        System.setProperty("webdriver.chrome.driver", "E:\\Auto-Test\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/minhhoa/Downloads/chromedriver_mac64/chromedriver.exe");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void TearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
