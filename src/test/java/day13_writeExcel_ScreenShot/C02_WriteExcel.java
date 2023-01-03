package day13_writeExcel_ScreenShot;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02_WriteExcel {

    @Test
    public void test01() throws IOException {

        // Excel dosyasinda kopyaladigimiz workbook objesi uzerinde degisiklik yapabiliriz
        // bunun icin oncelikle excel'in kopyasi olan workbook'u olusturalin

        String dosyaYolu="src/test/java/day12_webtables_Excels/ulkeler.xlsx";

        FileInputStream fis= new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);

        // 5. sutun olarak nufus basligi ile bir sutun olusturalim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nufus");

        // 3.satirdaki nufus bilgisini 1500000 yapalim

        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1500000");

        // 7. satirdaki nufus bilgisini 3000000 yapalim

        workbook.getSheet("Sayfa1").getRow(6).createCell(4).setCellValue("3000000");


        // Yaptigimiz degisiklikler kopya workbook uzerinde
        // bu degisiklikleri excel dosyasina kaydetmek icin
        // bunun icin FileOutPutStream class'ini kullanmaliyiz

        FileOutputStream fos= new FileOutputStream(dosyaYolu);
        workbook.write(fos);

        workbook.close();
        fis.close();
        fos.close();











    }
}
