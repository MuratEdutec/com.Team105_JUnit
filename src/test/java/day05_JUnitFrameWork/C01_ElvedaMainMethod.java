package day05_JUnitFrameWork;

import org.junit.Ignore;
import org.junit.Test;

public class C01_ElvedaMainMethod {

    @Test
    public void test01(){
        System.out.println("test01 calisti");

        // @Test notasyobu sayesinde her bir test methodu bagimsiz olarak calisabilir
        // eger testin icerisinde bir asertion yoksa
        // kod problem yasanmadan calisip bittiginde
        // JUnit test olarak raporlar

    }



    @Test  @Ignore
    public void test02(){
        System.out.println("test02 calisti");
        //@Ignore notasyonu yazildiginda yazildigi methodu calistirmaz pas gecer
    }


    @Test
    public void test03(){
        System.out.println("test03 calisti");

    }



}
