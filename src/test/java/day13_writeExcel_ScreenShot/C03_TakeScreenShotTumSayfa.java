package day13_writeExcel_ScreenShot;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.io.IOException;

public class C03_TakeScreenShotTumSayfa extends TestBase {

    @Test

    public void test01() throws IOException {

        // amazon'a gidip
        // nutella aratin arama sonuclarinin
        // Nutella icerdigini test edin
        // sonrada tum sayfanin screenshot in alin


        driver.get("https://www.amazon.com/");

       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
       aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        WebElement aramaSonucElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
       String expextedKelime= "Nutella";
       String actualAramaSonucu= aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expextedKelime));

        ReusableMethods.tumSayfaSecreenshotCek(driver);

        ReusableMethods.bekle(5);
    }


}
