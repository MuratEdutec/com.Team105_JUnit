package ztraining;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class m1 extends TestBase {

        @Test
    public void test1(){

            driver.get("https://webmail.argewebhosting.nl/");
            WebElement argeWebUser= driver.findElement(By.name("_user"));
            argeWebUser.sendKeys("murat@taalschoolhetwerkwoord.nl");
            WebElement argeWebPass= driver.findElement(By.name("_pass"));
            argeWebPass.sendKeys("welkom");
            WebElement inlog= driver.findElement(By.id("rcmloginsubmit"));
            inlog.submit();
            WebElement verniewButton= driver.findElement(By.id("rcmbtn106"));
            verniewButton.isDisplayed();
            if (verniewButton.isDisplayed()){
                System.out.println("VERNIEUW button test Passed");
            }else {
                System.out.println("tekrar dene");
            }
            WebElement logUit= driver.findElement(By.id("rcmbtn101"));
            logUit.click();

            WebElement cikisKontrol=driver.findElement(By.);
            if (cikisKontrol.isDisplayed()){
                System.out.println("Cikis Kontrol PASSEDD");
            }else {
                System.out.println("FAILEDDD");
            }






            ReusableMethods.bekle(3);
        }

}
