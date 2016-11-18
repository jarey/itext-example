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
/**
 * Created by maciej.debowski on 17.11.2016.
 */
public class PdfGenerator2 {

    public static void main(String[] args){// throws DocumentException, IOException {

//        Document document = new Document(PageSize.LEGAL);
//
//        fonts
//        XMLWorkerFontProvider fontProvider = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
//        fontProvider.register( "C:\\Users\\maciej.debowski\\Downloads\\arialbd.ttf", BaseFont.IDENTITY_H);
//        fontProvider.register("/Users/ibrahimbakhsh/Library/Fonts/trado.otf", BaseFont.IDENTITY_H);
//        fontProvider.register("/Users/ibrahimbakhsh/Library/Fonts/tahoma.ttf", BaseFont.IDENTITY_H);
//        CssAppliers cssAppliers = new CssAppliersImpl(fontProvider);
//        HtmlPipelineContext htmlContext = new HtmlPipelineContext(cssAppliers);
//        htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
//
//         CSS
//        CSSResolver cssResolver =
//                XMLWorkerHelper.getInstance().getDefaultCssResolver(true);
//
//
//
//         Pipelines
//        ElementList elements = new ElementList();
//        ElementHandlerPipeline end = new ElementHandlerPipeline(elements, null);
//        HtmlPipeline html = new HtmlPipeline(htmlContext, end);
//        CssResolverPipeline css = new CssResolverPipeline(cssResolver, html);
//
//         HTML
//        htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
//        htmlContext.autoBookmark(false);
//
//
//         XML Worker
//        XMLWorker worker = new XMLWorker(css, true);
//        XMLParser p = new XMLParser(worker);
//        p.parse(new FileInputStream("C:\\Users\\maciej.debowski\\Documents\\arabic.html"));
//
//
//        writer
//        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("output2.pdf"));
//        writer.setInitialLeading(12.5f);
//        writer.setRunDirection(PdfWriter.RUN_DIRECTION_LTR);
//
//
//         step 4
//        document.open();
//
//
//         step 5
//
//        for (Element e : elements) {
//            out.println(e.toString());
//            if(e instanceof PdfPTable){
//                PdfPTable t = (PdfPTable) e;
//                t.setRunDirection(PdfWriter.RUN_DIRECTION_LTR);
//                ArrayList<PdfPRow> rows = t.getRows();
//                for(PdfPRow row:rows){
//                    PdfPCell[] cells = row.getCells();
//                    for(PdfPCell cell:cells){
//                        cell.setRunDirection(PdfWriter.RUN_DIRECTION_LTR);
//                    }
//                }
//                e = t;
//            }
//            document.add(e);
//        }
//
//
//        try adding new table
//
//        PdfPTable table = new PdfPTable(1);
//        table.setRunDirection(PdfWriter.RUN_DIRECTION_LTR);
//        Font f = new Font(BaseFont.createFont("C:\\Users\\maciej.debowski\\Downloads\\arialbd.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
//        PdfPCell cell = new PdfPCell(new Paragraph("تجربة نص عربي",f));
//        table.addCell(cell);
//        document.add(table);
//
//         step 6
//        document.close();

    }

}
