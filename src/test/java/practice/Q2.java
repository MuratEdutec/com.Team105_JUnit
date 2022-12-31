package practice;

import utilities.TestBase;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;
import static org.junit.Assert.* ;

public class Q2 extends TestBase {

        //              ..Exercise2...


        //  Ayrica Relative Locator kullanarak;


    @Before
//  http://www.bestbuy.com 'a gidin,
    public void beforeTest(){
        driver.get("http://www.bestbuy.com");
    }
        @Test
//  Sayfa basliginin "Best" icerdigini(contains) dogrulayin
    public void titleTet(){
            String expTitle="Best";
            String actTitle=driver.getTitle();
            //System.out.println(actTitle);


            assertTrue(actTitle.contains(expTitle));
        }

        @Test
//  Ayrica Relative Locator kullanarak; logoTest => BestBuy logosunun goruntulenip goruntulenmedigini dogrulayin

        public void logoTest(){

     // WebElement bestBuyLogo= driver.findElement(By.xpath("//div[text()='Hello!']"));
       // Assert.assertTrue(bestBuyLogo.isDisplayed());

    WebElement helloHeading = driver.findElement(By.xpath("(//div[@class='heading'])[1]"));
    WebElement bestBuyLogo  = driver.findElement(RelativeLocator.with(By.tagName("img")).above(helloHeading));

    assertTrue(bestBuyLogo.isDisplayed());



    }



    @Test
    //  mexicoLinkTest => Linkin goruntulenip goruntulenmedigini dogrulayin

    public void mexicoLinkTest(){

        WebElement usFlag= driver.findElement(By.xpath("(//img[@alt='United States'])[1]"));
        WebElement mexFlag= driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(usFlag));

        boolean goruntuleniyormu= mexFlag.isDisplayed();
       // Assert.assertTrue(goruntuleniyormu);
        assertTrue(goruntuleniyormu);
        //assertEquals();



}

}
