package day05_JUnitFrameWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

import java.time.Duration;

public class C02_BeforeAfter {

    // 3 farkli test methodu olusturun
    // her bir methodun basinda driver i olusturup
    // 1- amazon.com
    // 2- wisequarter.com
    // 3- youtube.com'a gidip
    // title'lari yazdirin ve method'dan sonra driver'i kapatin

    WebDriver driver;
    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        System.out.println("Set up methodu calisti");
    }

    @After
    public void tearDown(){
        driver.close();
        System.out.println("Tear Down methodu calisti");

    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https:www.amazon.com");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
    }


    @Test
    public void test02() throws InterruptedException {
        driver.get("https:www.wisequarter.com");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

    }

    @Test
    public void test03() throws InterruptedException {
        driver.get("https:www.youtube.com");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

    }





}
