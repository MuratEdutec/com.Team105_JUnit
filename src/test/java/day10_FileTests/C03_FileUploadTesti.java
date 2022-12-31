package day10_FileTests;

import Utulities.ReusableMethods;
import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_FileUploadTesti extends TestBase {


    @Test
    public void test01(){


        // 1.https://the-internet.herokuapp.com/upload adresine gidelim
    // 2.chooseFile butonuna basalim

    driver.get("https://the-internet.herokuapp.com/upload");


    // 3.Yuklemek istediginiz dosyayi secelim.

     /*
             Bu gorevi yapabilmek icin chooseFile butonuna basildiginda
             acilan bilgisayarimizdaki file dosyalarini click yapabilmeemiz gerekir
             ancak Selenium bilgisayarimizdaki dosyalari click yapamaz
             Bunun yerine soyle bir cozum uretilmistir
             1- chooseFile butonunu locate edin
             2- upload edilecek dosyanin dosya yolunu olusturun
             3- chooseFile butonuna sendKeys ile dosya yolunu gonderin
         */
        WebElement chooseFileButonu= driver.findElement(By.xpath("//input[@id='file-upload']"));


        String dosyaYolu=System.getProperty("user.home")+"/Desktop/MerhabaJava.docx";
        chooseFileButonu.sendKeys(dosyaYolu);


        // 4.Upload butonuna basalim.

        driver.findElement(By.xpath("//*[@id='file-submit']")).click();


        // 5.“File Uploaded!” textinin goruntulendigini test edelim.

    WebElement fileUploadedElementi=driver.findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedElementi.isDisplayed());
        ReusableMethods.bekle(3);
    }





}
