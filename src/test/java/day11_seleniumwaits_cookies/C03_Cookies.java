package day11_seleniumwaits_cookies;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C03_Cookies extends TestBase {



//    Yeni bir class olusturun : cookiesAutomation
//   1- Amazon anasayfaya gidin
//   2- tum cookie’leri listeleyin
//   3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
//   4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
//   5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
//   6- eklediginiz cookie’nin sayfaya eklendigini test edin
//   7- ismi skin olan cookie’yi silin ve silindigini test edin
//   8- tum cookie’leri silin ve silindigini test edin

    @Test
    public void test01(){

        driver.get("https:www.amazon.com");
        Set<Cookie> cookieSet=driver.manage().getCookies();
        int siraNo=1;

        for (Cookie eachCookie: cookieSet
             ) {
            System.out.println(siraNo+"-"+ eachCookie);
            siraNo++;
        }

        Assert.assertTrue(cookieSet.size()>5);

        String expextedCookieDegeri="USD";
        String actualCookieDegeri="";

        for (Cookie eachCookie: cookieSet
        ) {
           if (eachCookie.getName().equals("i18n-prefs"));{
               actualCookieDegeri=eachCookie.getValue();
            }
        }
        Assert.assertEquals(expextedCookieDegeri,actualCookieDegeri);











    }



}
