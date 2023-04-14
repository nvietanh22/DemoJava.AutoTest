package demo.autotest;

import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handle_RadioButton extends Init {
    public static void main(String[] args) throws Exception {
        Setup();

        driver.navigate().to("https://demos.bellatrix.solutions/contact-form/");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#wpforms-3347-field_1")).sendKeys("Anh");
        driver.findElement(By.cssSelector("#wpforms-3347-field_1-last")).sendKeys("Nguyen");
        driver.findElement(By.cssSelector("#wpforms-3347-field_2")).sendKeys("vietanhsdtq19@gmail.com");

        /*Sử lý radio button*/
        WebElement radioBronze = driver.findElement(By.cssSelector("#wpforms-3347-field_3_1"));

        if (radioBronze.isSelected() == true) {
            System.out.println("bronze đã click");
        } else {
            System.out.println("bronze chưa click");
            radioBronze.click();
            System.out.println("bronze đã click");
        }

        Thread.sleep(1000);
        WebElement radio_Silver = driver.findElement(By.cssSelector("#wpforms-3347-field_3_2"));

        if (radio_Silver.isSelected() == true) {
            System.out.println("Silver đã được chọn => test case sai");
        } else {
            System.out.println("Silver đã đc chọn => đúng");
        }


        //  Sử lý 1 checkbox
//        driver.findElement(By.xpath("(//input[@id='wpforms-3347-field_4_1'])[1]")).click();

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@id='wpforms-3347-field_6_1'])[1]"));
        Thread.sleep(1000);

        if (checkbox1.isSelected() == false) {
            System.out.println("Nút chưa được chọn");
            Thread.sleep(1000);
            checkbox1.click();
            Thread.sleep(1000);
            System.out.println("Đã chọn checkbox");
        } else {
            System.out.println("Nút đã được chọn");
        }

        TearDown();
    }
}
