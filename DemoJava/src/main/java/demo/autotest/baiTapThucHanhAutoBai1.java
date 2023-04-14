package demo.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class baiTapThucHanhAutoBai1 {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/minhhoa/Downloads/chromedriver_mac64/chromedriver.exe");


        driver.get("https://demoqa.com/");
        driver.manage().window().maximize(); //phóng to
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//đợi 10s
        driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]")).click();
        driver.findElement(By.xpath("//button[@id='login']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='newUser']")).click();
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Minh Hoa");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Nguyen");
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("mh");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Nguyenhoa@2");
        driver.findElement(By.xpath("//body")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='register']")).click();
        driver.findElement(By.xpath("//button[@id='gotologin']")).click();
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("mh");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Nguyenhoa@2");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Log out')]")).click();
        driver.quit();


    }
}
