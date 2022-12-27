package day07_dropdown_jsAlerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BasicAuthetication {

    // 1- Bir class olusturun : BasicAuthentication
    // 2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin
    //             3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
    //     Html komutu : https://username:password@URL
    //     Username    : admin
    //     password     : admin
    // 4- Basarili sekilde sayfaya girildigini dogrulayin
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void test01(){

        driver.get();
    }






}
