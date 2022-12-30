package day10_FileTests;

import Utulities.ReusableMethods;
import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileDownloadTesti extends TestBase {

    @Test
    public void test01(){
//   2. https://the-internet.herokuapp.com/download adresine gidelim.


        driver.get("https://the-internet.herokuapp.com/download");
//   3. Facebookd.png dosyasını indirelim
        driver.findElement(By.xpath("//a[text()='Facebookd.png']")).click();

        //   4. Dosyanın başarıyla indirilip indirilmediğini test edelim
        ReusableMethods.bekle(5);

// Test icin oncelikle dosyanin indirildiginde dosyaYolu ne olacak bunu olusturmaliyiz


        String dosyaYolu=System.getProperty("user.home")+"/Downloads/Facebookd.png";

        //
        //


        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }


    @Test
    public void test2(){

        //



        String dosyaYolu= System.getProperty("user.home")+"/Desktop/MerhabaJava.docx";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }


}