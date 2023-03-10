package day08_HandlingWindows;

import utilities.ReusableMethods;
import utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class C04_TestBaseIlkTest extends TestBase {

    @Test
    public void test01() throws InterruptedException {


        driver.get("https://www.amazon.com");
        String expectedKelime="amazon";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedKelime));
        ReusableMethods.bekle(3);
    }


}
