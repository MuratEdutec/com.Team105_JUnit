package practice;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Q2 extends TestBase {

        //              ..Exercise2...
        //  http://www.bestbuy.com 'a gidin,
        //  Sayfa basliginin "Best" icerdigini(contains) dogrulayin
        //  Ayrica Relative Locator kullanarak;
        //  logoTest => BestBuy logosunun goruntulenip goruntulenmedigini dogrulayin
        //  Ayrica Relative Locator kullanarak;
        //  mexicoLinkTest => Linkin goruntulenip goruntulenmedigini dogrulayin

    @Before
    public void beforeTest(){
        driver.get("http://www.bestbuy.com");
    }
        @Test
    public void titleTet(){
            String expTitle="Best";
            String actTitle=driver.getTitle();
            //System.out.println(actTitle);


            Assert.assertTrue(actTitle.contains(expTitle));
        }

        @Test
    public void logoTest(){

     // WebElement bestBuyLogo= driver.findElement(By.xpath("//div[text()='Hello!']"));
       // Assert.assertTrue(bestBuyLogo.isDisplayed());

    WebElement helloHeading = driver.findElement(By.xpath("(//div[@class='heading'])[1]"));
    WebElement bestBuyLogo = driver.findElement(RelativeLocator.with(By.tagName("img")).above(helloHeading));

    Assert.assertTrue(bestBuyLogo.isDisplayed());



    }





}
