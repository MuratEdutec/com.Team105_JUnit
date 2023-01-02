package day12_webtables_Excels;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel {

    @Test
    public void test01() throws IOException {

        // dosya yolu olusturalim
        String dosyaYolu= "src/test/java/day12_webtables_Excels/ulkeler.xlsx";
        // FFileInputStream objesi olusturup, parametre olarak dosya yolunu yazalim
        FileInputStream fis= new FileInputStream(dosyaYolu);

        // Kod alanimizda excel'in bir kopyasini olusturup
        // tum bilgileri ona kopyalayacagiz

        Workbook workbook= WorkbookFactory.create(fis);

        // Kod alanimizda excel'in bir kopyasini olusturup
        // istedigimiz sayfaya gidelim


        Sheet sheet=workbook.getSheet("Sayfa1");


        // Angola yazdirmak istedigimiz icin 5.satira gidelim

        Row row= sheet.getRow(5);

        // 5.satirdaki 2. index'teki datayi alalim

        Cell cell=row.getCell(2);
        System.out.println(cell);










    }
}
