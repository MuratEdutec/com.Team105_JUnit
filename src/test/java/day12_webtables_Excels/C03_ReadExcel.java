package day12_webtables_Excels;

import net.bytebuddy.pool.TypePool;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.checkerframework.checker.units.qual.Temperature;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class C03_ReadExcel {


    @Test
    public void test01() throws IOException {


 //  Yeni bir test method olusturalim readExcel2( )

        String dosyaYolu="src/test/java/day12_webtables_Excels/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);

        //  - 1.satirdaki 2.hucreye gidelim ve yazdiralim

        System.out.println("- 1.satirdaki 2.hucreye gidelim ve yazdiralim \n"+ workbook.getSheet("Sayfa1").getRow(0).getCell(1));

        //  - 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        String istenenHucreStr= workbook.getSheet("Sayfa1").getRow(0).getCell(1).toString();
        System.out.println("- 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim\n" + istenenHucreStr);

        //  - 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim

        String actualBaskent= workbook.getSheet("Sayfa1").getRow(1).getCell(3).toString();
        String expectedBaskent= "Kabil";
        System.out.println("- 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim");
        Assert.assertEquals(actualBaskent,expectedBaskent);
        System.out.println(actualBaskent+" <--> "+expectedBaskent);

 //  - Satir sayisini bulalim

        System.out.println("Satir sayisi : " + (workbook.getSheet("Sayfa1").getLastRowNum() + 1));


//  - Fiziki olarak kullanilan satir sayisini bulun
        // Bunu icin Sayfa2 deki


        System.out.println("2. sayfa son satir indexi :" + workbook.getSheet("Sayfa2").getLastRowNum());

        System.out.println("2.sayfa fiziki kullanilan indexi :"+ workbook.getSheet("Sayfa2").getPhysicalNumberOfRows());


        //  - Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim


        // ulke ismni ingilizce ==> key, geriye kalan 3 bilgi ise birlestirilerek value olsun

        Map<String,String> ulkelerMap= new TreeMap<>();
        int sonSatirIndexi= workbook.getSheet("Sayfa1").getLastRowNum();
        String key= "";
        String value= "";

        for (int i = 0; i <= sonSatirIndexi ; i++) {

            key=workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            value=  workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString()+", "+
                    workbook.getSheet("Sayfa1").getRow(i).getCell(2).toString()+", "+
                    workbook.getSheet("Sayfa1").getRow(i).getCell(3).toString()+", ";

            ulkelerMap.put(key,value);

        }
        System.out.println(ulkelerMap);


    }






}
