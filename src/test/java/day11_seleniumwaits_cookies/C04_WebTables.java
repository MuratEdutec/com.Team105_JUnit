package day11_seleniumwaits_cookies;

import Utulities.ReusableMethods;
import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class C04_WebTables extends TestBase {

@Test
    public void test01(){

 //  1.“https://www.amazon.com” adresine gidin

    driver.get("https:www.amazon.com");


    //          2.Sayfanin en altina inin

    Actions actions=new Actions(driver);
    actions.sendKeys(Keys.END).perform();

    //  3.Web table tum body’sini yazdirin

    WebElement tumBody=driver.findElement(By.xpath("//tbody"));
    System.out.println(tumBody);


 //  4.Web table’daki satir sayisinin 9 oldugunu test edin

    List<WebElement> satirlarListesi= driver.findElements(By.xpath("//tbody"));
    Assert.assertEquals(2,satirlarListesi.size());
    //  5.Tum satirlari yazdirin
    for (WebElement eachRow: satirlarListesi

         ) {
        System.out.println(eachRow.getText());

    }


 //  6. Web table’daki sutun sayisinin 13 olduğunu test edin
 //  7. 5.sutunu yazdirin
 //  8.Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi döndüren bir method olusturun
    ReusableMethods.bekle(5);










}
}
