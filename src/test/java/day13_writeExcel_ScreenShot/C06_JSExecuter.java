package day13_writeExcel_ScreenShot;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C06_JSExecuter extends TestBase {




    @Test
    public void test01(){

    // amazon anasayfaya gidin
    driver.get("https://www.amazon.com/");
    // sell linkini JS executor kullanarak click yapin

        WebElement sellLinki= driver.findElement(By.xpath("//a[text()='Gift Cards']"));

        JavascriptExecutor jse=(JavascriptExecutor) driver;

        jse.executeScript("arguments[0].click();",sellLinki);



    }




}
