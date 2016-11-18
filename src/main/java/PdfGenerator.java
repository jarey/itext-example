import com.lowagie.text.*;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import org.jsoup.Jsoup;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by maciej.debowski on 17.11.2016.
 */
public class PdfGenerator {

    public static void main(String[] args) throws DocumentException, IOException {
        String fontPath = "C:\\Users\\maciej.debowski\\Downloads\\arialbd.ttf";
        BaseFont baseFont = BaseFont.createFont(fontPath, BaseFont.IDENTITY_H, true);
        String arabic = "Maciek \u0627\u0644\u0647\u0627\u062a\u0641           |";
        String arabic2 = "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+&#1641;&#1638;&#1637;&#1634;&#1637;&#1635;&#1632;&#1641;&#1641;&#1641;&#1639;&nbsp;:&#1575;&#1604;&#1607;&#1575;&#1578;&#1601;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><br/>";
        arabic2 = Jsoup.parse(arabic2).text();
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
        document.open();

        PdfPTable table = new PdfPTable(1);
        table.setRunDirection(PdfWriter.RUN_DIRECTION_LTR);

        PdfPCell cell = new PdfPCell(new Paragraph(arabic+arabic2, new Font(baseFont, 20)));
        cell.setRunDirection(PdfWriter.RUN_DIRECTION_LTR);
        cell.setBorder(Rectangle.NO_BORDER);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell2 = new PdfPCell(new Paragraph(arabic2, new Font(baseFont, 20)));
        cell2.setBorder(Rectangle.NO_BORDER);

        table.addCell(cell);
//        table.addCell(cell2);

        document.add(table);

        document.close();
    }

}
