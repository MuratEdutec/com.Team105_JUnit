package day08_HandlingWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_NewWindow {

    /*
    Selenium 4 ile windows konusunda yeni bir ozellik geldi

    Istersek kontrollu olarak driver icin yeni bir window veya tab olusturabiliriz
    Bu durumda driver'imizda otomatik olarak yeni sayfaya gecmis olur

     Testin ilerleyen asamalarinda yeniden eski sayfalara donus gorevi varsa
     o sayfada iken o sayfanin window Handle degeri alinip kaydedilir
     o sayfaya gecmek istenildiginde

     driver.switch().window(istenenSayfaninWindowHandleDegeri)
     kodu ile o sayfaya gecis yapar
     */

    static WebDriver driver;
    @BeforeClass
    public static void  setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();

    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);

        // Testin ilerleyen asamalarinda yeniden amazon sayfasina donmek gerekiyorsa
        // amazon sayfasindayken bu window'un window handle degerini alip kaydetmeliyiz
        String ilkSayfaHandleDegeri= driver.getWindowHandle();



        //yeni bir tab'da wisequarter'a gidin ve gittigimizi test edin

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");
        String actualUrl=driver.getCurrentUrl();
        String expcetedkelime="wisequarter";
        Assert.assertTrue(actualUrl.contains(expcetedkelime));
        Thread.sleep(3000);

       //
       //
       //
       //

        driver.switchTo().window(ilkSayfaHandleDegeri);
        String actualUrl2=driver.getCurrentUrl();
        String expcetedkelime2="amazon";
        Assert.assertTrue(actualUrl2.contains(expcetedkelime2));
        Thread.sleep(3000);


    }










}
