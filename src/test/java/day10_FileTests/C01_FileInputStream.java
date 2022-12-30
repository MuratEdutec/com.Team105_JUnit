package day10_FileTests;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_FileInputStream {

    @Test
    public void test01() throws FileNotFoundException {

        String dosyaYolu="/Users/mnobody/Desktop/MerhabaJava.docx";

       FileInputStream fis=new FileInputStream(dosyaYolu);

        /*
        Dosya file testlerinde genellikle Downloads'a indirilecek bir dosyanin
        indirildigini test etmek veya masa ustundeki bir dosyanin web'e yuklenebildigini
        test etmek isteriz

        Ancak herkesin bilgisayarinin ismi, kullanici isimleri gibi farkliliklar olacagindan
        testler tek bir bilgisayarda calisacak gibi yazilmak zorunda kalinir

        Bu karisikligin onunen gecebilmek icin 2 basit
        kod blogu sunmus


         */

        System.out.println(System.getProperty("user.dir"));
        // o anda calisilan dosyanin (C01_FileInputStream) yolunu verir
        // /Users/mnobody/IdeaProjects/com.Team105JUnit

        System.out.println(System.getProperty("user.home"));
        // kullanicinin temel path'ini verir
        // /Users/mnobody

        // Masa ustune gitmek istersek
        // /Users/mnobody +/Desktop eklememiz yeterlidir


        // Downloads'a gitmek istersek
        // /Users/mnobody +/Downloads eklememiz yeterlidir

        // Kodlarimizin dinamik olmasi yani kisinin bilgisayarindaki
        // kullanici adi gibi detaylara takilmamasi icin
        // File testlerinde kullanilacak dosya yolunu
        // user.hom... temel paht'ini calistigi bilgisayardan alacak sekilde
        // olustururuz


        //         String dosyaYolu="/Users/mnobody/Desktop/MerhabaJava.docx";


        String dinamikDosyaYolu=System.getProperty("user.home")+"/Users/mnobody/Desktop/MerhabaJava.docx";




    }


}
