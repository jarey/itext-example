//

//import com.lowagie.text.*;
//import com.lowagie.text.pdf.BaseFont;
//import com.lowagie.text.pdf.PdfPCell;
//import com.lowagie.text.pdf.PdfPTable;
//import com.lowagie.text.pdf.PdfWriter;
//import org.jsoup.Jsoup;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Arrays;

/**
 * Created by maciej.debowski on 17.11.2016.
 */
public class PdfGenerator {

    public static void main(String[] args) {//throws DocumentException, IOException {
//        String fontPath = "C:\\Users\\maciej.debowski\\Downloads\\arialbd.ttf";
//        BaseFont baseFont = BaseFont.createFont(fontPath, BaseFont.IDENTITY_H, true);
//
//        java.util.List<String> lines = Arrays.asList(
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Kuwait&nbsp;-&nbsp;360&nbsp;Mall&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+&#1641;&#1638;&#1637;&#1634;&#1637;&#1635;&#1632;&#1641;&#1641;&#1641;&#1639;&nbsp;:&#1575;&#1604;&#1607;&#1575;&#1578;&#1601;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#1633;&#1635;:&#1633;&#1632;:&#1633;&#1635;&nbsp;&nbsp;&#1633;&#1641;/&#1633;&#1632;/&#1633;&#1638;&nbsp;:&#1578;&#1575;&#1585;&#1610;&#1582;&nbsp;&nbsp;&nbsp;&#1634;&#1633;&#1640;&#1641;&#1639;&nbsp;:&#1578;&#1584;&#1603;&#1585;&#1577;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#1634;&#1640;&#1639;&#1632;&#1633;&nbsp;:&#1605;&#1578;&#1580;&#1585;&nbsp;&nbsp;&nbsp;&#1636;&nbsp;:&#1578;&#1587;&#1580;&#1610;&#1604;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;990001&nbsp;&nbsp;:&#1571;&#1605;&#1610;&#1606;&nbsp;&#1575;&#1604;&#1589;&#1606;&#1583;&#1608;&#1602;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JENNIFER&nbsp;MIKE&nbsp;:&#1575;&#1604;&#1593;&#1605;&#1610;&#1604;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2300263323&nbsp;&#1607;&#1608;&#1610;&#1577;&nbsp;&#1575;&#1604;&#1593;&#1605;&#1610;&#1604;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><br/>",
//                "<span class=\"font_0\"><b><u>&nbsp;&nbsp;&nbsp;&nbsp;&#1575;&#1604;&#1605;&#1576;&#1604;&#1594;&#1587;&#1593;&#1585;&nbsp;&#1575;&#1604;&#1608;&#1581;&#1583;&#1577;&nbsp;&nbsp;&nbsp;&nbsp;&#1575;&#1604;&#1603;&#1605;&#1610;&#1577;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#1602;&#1591;&#1593;&#1577;&nbsp;</u></b></span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;806727274&nbsp;&nbsp;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;NOSIZ&nbsp;-&nbsp;9022&nbsp;-&nbsp;00018GA7M0Z&nbsp;&nbsp;&nbsp;HANDBAGS</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&#1640;&#1640;&#1632;.&#1632;&#1632;&nbsp;&nbsp;&nbsp;&nbsp;&#1640;&#1640;&#1632;.&#1632;&#1632;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#1633;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><br/>",
//                "<span class=\"font_0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;990001&nbsp;(MANAGER)&nbsp;&nbsp;:&#1605;&#1606;&#1583;&#1608;&#1576;&nbsp;&#1576;&#1610;&#1593;&nbsp;</span><br/>"
//        );
//        StringBuilder linesToCell = new StringBuilder();
//        for (String line : lines) {
//            linesToCell.append(Jsoup.parse(line).text());
//        }
//
//        Document document = new Document();
//        PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
//        document.open();
//
//        PdfPTable table = new PdfPTable(1);
//        table.setRunDirection(PdfWriter.RUN_DIRECTION_LTR);
//
//        Image image = Image.getInstance("C:\\Users\\maciej.debowski\\AppData\\Local\\Temp\\DtvResource6580447374521984865.bmp");
//        Image image2 = Image.getInstance("C:\\Users\\maciej.debowski\\AppData\\Local\\Temp\\DtvResource5330641316123788731.bmp");
//        table.addCell(new PdfPCell(image2));
//        table.addCell(new PdfPCell(image));
//
//        for(String line : lines){
//            PdfPCell cell = new PdfPCell(new Paragraph(StringEscapeUtils.unescapeHtml4(line.replaceAll("\\<.*?>","")), new Font(baseFont, 16)));
//            PdfPCell cell = new PdfPCell(new Paragraph( Jsoup.parse(line).text(), new Font(baseFont, 16)));

//            cell.setRunDirection(PdfWriter.RUN_DIRECTION_LTR);
//            cell.setBorder(Rectangle.NO_BORDER);
//            cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
//            table.addCell(cell);
//        }
//
//        document.add(table);
//        document.close();
    }

}
