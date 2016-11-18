//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.*;
//import com.itextpdf.tool.xml.ElementList;
//import com.itextpdf.tool.xml.XMLWorker;
//import com.itextpdf.tool.xml.XMLWorkerFontProvider;
//import com.itextpdf.tool.xml.XMLWorkerHelper;
//import com.itextpdf.tool.xml.html.CssAppliers;
//import com.itextpdf.tool.xml.html.CssAppliersImpl;
//import com.itextpdf.tool.xml.html.Tags;
//import com.itextpdf.tool.xml.parser.XMLParser;
//import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
//import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
//import com.itextpdf.tool.xml.pipeline.end.ElementHandlerPipeline;
//import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
//import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.tool.xml.ElementList;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.html.CssAppliers;
import com.itextpdf.tool.xml.html.CssAppliersImpl;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.ElementHandlerPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by maciej.debowski on 17.11.2016.
 */
public class PdfGenerator2 {

    public static void main(String[] args) throws IOException, DocumentException {// throws DocumentException, IOException {
        Document document = new Document(PageSize.LEGAL);
        String fontPath = "c:/windows/fonts/cour.ttf";
        BaseFont baseFont = BaseFont.createFont(fontPath, BaseFont.IDENTITY_H, true);
        XMLWorkerFontProvider fontProvider = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
        fontProvider.register( "C:\\Users\\maciej.debowski\\Downloads\\arialbd.ttf", BaseFont.IDENTITY_H);
        CssAppliers cssAppliers = new CssAppliersImpl(fontProvider);
        HtmlPipelineContext htmlContext = new HtmlPipelineContext(cssAppliers);
        htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());

        CSSResolver cssResolver =
                XMLWorkerHelper.getInstance().getDefaultCssResolver(true);

        ElementList elements = new ElementList();
        ElementHandlerPipeline end = new ElementHandlerPipeline(elements, null);
        HtmlPipeline html = new HtmlPipeline(htmlContext, end);
        CssResolverPipeline css = new CssResolverPipeline(cssResolver, html);

        htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
        htmlContext.autoBookmark(false);


        XMLWorker worker = new XMLWorker(css, true);
        XMLParser p = new XMLParser(worker);
        p.parse(new FileInputStream("C:\\Users\\maciej.debowski\\Documents\\arabic.html"), Charset.forName("UTF-8"));

        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("output2.pdf"));
        writer.setInitialLeading(12.5f);

        document.open();

        PdfPTable table = new PdfPTable(1);
        table.setRunDirection(PdfWriter.RUN_DIRECTION_LTR);

        String a0 = "+";
        String a1 = "٩٦٥٢٥٣٠٩٩٩٧";
        String a2 = " :";
        String a3 = "الهاتف";

        table.addCell(new Phrase("الهاتف: ٩٦٥٢٥٣٠٩٩٩٧+", new Font(baseFont)));
        table.addCell(new Phrase(a0 + a1 + a2 + a3, new Font(baseFont)));
        table.addCell(new Phrase("أمين الصندوق: 990001", new Font(baseFont)));
        table.addCell(new Phrase(" ", new Font(baseFont)));

//        for (Element e : elements) {
//            PdfPCell cell = new PdfPCell();
//            e.getChunks().get(0).setFont(new Font(baseFont));
//            cell.addElement(e);
//            table.addCell(cell);
//        }
        document.add(table);

        document.close();
    }

}
