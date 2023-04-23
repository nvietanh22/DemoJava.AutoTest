package demo.autotest;

import Initialization.Init;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class bai2AutoTest extends Init {//khai bao init de tai su dung code

    @Test
    public void main() throws Exception {
        Setup();//goi ham set up trong init
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//mở 1 trang web
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");//findelemt: tim duong dan cua elem,sendkey:nhap text vao element
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).clear();//xoa text trong element
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("Miho");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("1998-04-01");
        //
        WebElement female = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]/span[1]"));
        if (!female.isSelected())//cham than de phu dinh: neu menh de nay sai se chay vao Th if, ko duoc chon se click vao check box
        //hoac co the viet if(female.isSelected()==true)
        {
            female.click();
            System.out.println("Da click");
        }
        WebElement smoker = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/i[1]"));
        if (!smoker.isSelected()) {
            smoker.click();
            System.out.println("da click");
        }

        Select dropdown = new Select(driver.findElement(By.xpath("(//*[@class = \"oxd-select-text oxd-select-text--active\"])[2]")));
        dropdown.selectByVisibleText("Other");
        Select nationality = new Select(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")));
        nationality.selectByVisibleText("Taiwanese");

        TearDown();//goi ham tear down
        //=> luon phai goi set up va tear down khi tao class moi

    }
}
