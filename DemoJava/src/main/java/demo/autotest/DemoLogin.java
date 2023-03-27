package demo.autotest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoLogin {
    public static void main(String[] args){
        //Setting driver của chrome
        System.setProperty("webdriver.chrome.driver", "E:\\Auto-Test\\chromedriver_win32\\chromedriver.exe");

        //Tạo đối tươợng driver
        WebDriver webDriver = new EdgeDriver();

        //Điều hướng đến trang web
        webDriver.get("https://demoqa.com/login");

        //Mở full size ide
        webDriver.manage().window().maximize();

        //Lấy tiêu đề của trang web
        String title = webDriver.getTitle();
        System.out.println("The page title is : " +title);

        //định vị các phần tử trên web
        WebElement username = webDriver.findElement(By.xpath("//*[@id='userName']"));
        WebElement password = webDriver.findElement(By.xpath("//*[@id='password']"));
        WebElement loginBtn = webDriver.findElement(By.xpath("//*[@id='login']"));


        //Thực hiện hành động tới các phần từ

        //Điền username vào phần tử username
        username.sendKeys("testuser");

        //Điền password vào phần tử  password
        password.sendKeys("Password@123");
        loginBtn.click();

        //Đặt thời gian chờ
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {

            //định vị phần tử nút login trên web
            WebElement logoutBtn = webDriver.findElement(By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']"));
            //Kiểm tra xem nút login có hiển thị hay ko
            if(logoutBtn.isDisplayed()){

                //Thực hiện thao tác trên nút
                logoutBtn.click();
                System.out.println("Logout Successful!");
            }
        }
        catch (Exception e) {
            System.out.println("Incorrect login....");
        }

        //Đóng trang web
        webDriver.quit();

    }
}
