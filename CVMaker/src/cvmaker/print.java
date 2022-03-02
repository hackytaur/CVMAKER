package cvmaker;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.text.BaseColor;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.canvas.draw.DottedLine;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.FileOutputStream;
import java.text.AttributedString;

class print  
{
    int flag_project = 0;
    detail dt;
    String path;
    print(detail d,String s) {
        dt = new detail();
        dt=d;
        path=s;
        print1();
    }
    void print1() {
       try{ 
           //System.out.println("start");
        String dest = path+"\\CV.pdf";
   PdfWriter writer = new PdfWriter(dest);
    PdfDocument pdf = new PdfDocument(writer);
    com.itextpdf.layout.Document document = new com.itextpdf.layout.Document(pdf);
  //  System.out.println("file created");
    PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
    PdfFont font1 = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
    PdfFont font2 = PdfFontFactory.createFont(FontConstants.COURIER_OBLIQUE);
    PdfFont font3 = PdfFontFactory.createFont(FontConstants.ZAPFDINGBATS);
    DeviceRgb maroon = new DeviceRgb(128,0,0);
    DeviceRgb mustard = new DeviceRgb(255, 153, 0);
    Paragraph heading = new Paragraph();
    heading.setMarginLeft(15);
    heading.add(new Text(dt.p.name ).setFont(font) .setFontSize(28) .setFontColor(Color.convertRgbToCmyk(maroon)));
   
    document.add(heading);
Paragraph p = new Paragraph();
p.add("Date Of Birth :    ");
p.setBold();
p.setMarginLeft(15);
p.add(dt.p.dob);
document.add(p);
p = new Paragraph();
p.add("Contact number :    ");
p.setBold();
p.setMarginLeft(15);
p.add(dt.p.contact);
document.add(p);
p = new Paragraph();
p.add("Email ID :    ");
p.setBold();
p.setMarginLeft(15);
p.add(dt.p.email);
document.add(p);
p = new Paragraph();
p.add("Address :     ");
p.setMarginLeft(15);
p.setBold();
p.add(dt.p.address);
document.add(p);
p = new Paragraph("");
document.add(p);
p = new Paragraph("");
document.add(p);
p.add("-------------------------------------------------------------------------------------------------------------------------------");
p.setUnderline().setFontColor(Color.convertRgbToCmyk(mustard));
document.add(p);
 p = new Paragraph("");
    document.add(p);
heading = new Paragraph();
heading.setMarginLeft(15);
    heading.add(new Text("Education Information : ").setFont(font) .setFontSize(22).setFontColor(Color.convertRgbToCmyk(maroon)));
    document.add(heading);
     p = new Paragraph("");
    document.add(p);
     Table table = new Table(5);
            table.addCell("");
            table.addCell("Institute Name ");
            table.addCell("Passing Board/University");
            table.addCell("Grade/Percentage");
            table.addCell("Passing Year");
            table.addCell("Class 10th");
            table.addCell(dt.e.tenth[0]);
            table.addCell(dt.e.tenth[1]);
            table.addCell(dt.e.tenth[2]);
            table.addCell(dt.e.tenth[3]);
            table.addCell("Class 12th");
            table.addCell(dt.e.twelve[0]);
            table.addCell(dt.e.twelve[1]);
            table.addCell(dt.e.twelve[2]);
            table.addCell(dt.e.twelve[3]);
            table.addCell("Graduation");
            table.addCell(dt.e.graduate[0]);
            table.addCell(dt.e.graduate[1]);
            table.addCell(dt.e.graduate[2]);
            table.addCell(dt.e.graduate[3]);
    document.add(table);
     p = new Paragraph("");
    document.add(p);
    if(!dt.pf.course1.equals("")){
        p = new Paragraph("");
    document.add(p);
    p = new Paragraph("");
    document.add(p);
     p = new Paragraph("");
    document.add(p);
//    System.out.println("7");
    p.add("-------------------------------------------------------------------------------------------------------------------------------");
    p.setUnderline().setFontColor(Color.convertRgbToCmyk(mustard));
    document.add(p);
    p = new Paragraph("");
    document.add(p);
    heading = new Paragraph();
    heading.setMarginLeft(15);
    heading.add(new Text("Professional Qualification : ").setFont(font) .setFontSize(22) .setFontColor(Color.convertRgbToCmyk(maroon)));
    document.add(heading);
    p = new Paragraph(new Text(dt.pf.course1+" :   ").setBold());
    p.add(new Text(dt.pf.detail1));
    p.setMarginLeft(15);
    document.add(p);
    }
    p = new Paragraph("");
    document.add(p);
    if(!dt.pf.course2.equals("")){
    p = new Paragraph(new Text(dt.pf.course2+" :   ").setBold());
    p.add(new Text(dt.pf.detail2) );
    p.setMarginLeft(15);
    document.add(p);
    }
    p = new Paragraph("");
    document.add(p);
    p = new Paragraph("");
    document.add(p);
    if(!dt.pf.experience.equals("")){
        heading = new Paragraph();
        heading.setMarginLeft(15);
    heading.add(new Text("Professional Experience : ").setFont(font) .setFontSize(22).setFontColor(Color.convertRgbToCmyk(maroon)));
    document.add(heading);
    p = new Paragraph();
    p.add(new Text(dt.pf.experience));
    p.setMarginLeft(15);
    document.add(p);
    }
    
    if(!dt.ac.academic.equals("")){
         p = new Paragraph("");
    document.add(p);
    p = new Paragraph("");
    document.add(p);
    p.add("-------------------------------------------------------------------------------------------------------------------------------");
    p.setUnderline().setFontColor(Color.convertRgbToCmyk(mustard));
    document.add(p);
    p = new Paragraph("");
    document.add(p);
    //System.out.println("3");
        heading = new Paragraph();
        heading.setMarginLeft(15);
    heading.add(new Text("Academic Acheivements : ").setFont(font) .setFontSize(22).setFontColor(Color.convertRgbToCmyk(maroon)));
    document.add(heading);
    String[] split = dt.ac.academic.split("[\\r\\n|\\n|\\r]+");
     List list = new List();
            list.setSymbolIndent(12);
            list.setListSymbol("\u2022");
            list.setMarginLeft(30);
    for(int i=0;i<split.length;i++){
    list.add(new ListItem(split[i]));
    }
    document.add(list);
    }
    if(!dt.ac.extra.equals("")){
         p = new Paragraph("");
    document.add(p);
    p = new Paragraph("");
    document.add(p);
        heading = new Paragraph();
        heading.setMarginLeft(15);
    heading.add(new Text("Extra Curricular Acheivements : ").setFont(font) .setFontSize(22) .setFontColor(Color.convertRgbToCmyk(maroon)));
    document.add(heading);
    String[] split = dt.ac.extra.split("[\\r\\n|\\n|\\r]+");
     List list = new List();
            list.setSymbolIndent(12);
            list.setListSymbol("\u2022");
            list.setMarginLeft(30);
    for(int i=0;i<split.length;i++){
    list.add(new ListItem(split[i]));
    }
    document.add(list);
    }
    if(!dt.pr.projects.equals("")){
         p = new Paragraph("");
    document.add(p);
    p = new Paragraph("");
    document.add(p);
   p.add("-------------------------------------------------------------------------------------------------------------------------------");
    p.setUnderline().setFontColor(Color.convertRgbToCmyk(mustard));
    document.add(p);
    p = new Paragraph("");
    document.add(p);
    
    heading = new Paragraph();
    heading.setMarginLeft(15);
    heading.add(new Text("Projects : ").setFont(font) .setFontSize(22) .setFontColor(Color.convertRgbToCmyk(maroon)));
    document.add(heading);
    flag_project = 1;
    String[] split = dt.pr.projects.split("[\\r\\n|\\n|\\r]+");
     List list = new List();
            list.setSymbolIndent(12);
            list.setListSymbol("\u2022");
            list.setMarginLeft(30);
    for(int i=0;i<split.length;i++){
    list.add(new ListItem(split[i]));
    }
    document.add(list);
    }
    p = new Paragraph("");
    document.add(p);
    p = new Paragraph("");
    document.add(p); 
  p.add("-------------------------------------------------------------------------------------------------------------------------------");
    p.setUnderline().setFontColor(Color.convertRgbToCmyk(mustard));
    document.add(p);
    p = new Paragraph("");
    document.add(p);   
    heading = new Paragraph();
    heading.setMarginLeft(15);
    heading.add(new Text("Skills : ").setFont(font) .setFontSize(22) .setFontColor(Color.convertRgbToCmyk(maroon)));
    document.add(heading);
    p = new Paragraph();
    p.setMarginLeft(15);
    p.add(new Text(dt.pr.skill));
    p.setMarginLeft(15);
    document.add(p);
     p = new Paragraph("");
    document.add(p);
    p = new Paragraph("");
    document.add(p);
    p = new Paragraph("");
    p.add("---------------------------------------------------------------------------------------------------------------------------");
    p.setUnderline().setFontColor(Color.convertRgbToCmyk(mustard));
    document.add(p);
    p = new Paragraph("");
    document.add(p);
    
        heading = new Paragraph();
        heading.setMarginLeft(15);
    heading.add(new Text("Hobbies and Interests : ").setFont(font) .setFontSize(22) .setFontColor(Color.convertRgbToCmyk(maroon)));
    document.add(heading);
    String[] split = dt.hb.hobby.split("[\\r\\n|\\n|\\r]+");
     List list = new List();
            list.setSymbolIndent(12);
            list.setListSymbol("\u2022");
            list.setMarginLeft(30);
    for(int i=0;i<split.length;i++){
    list.add(new ListItem(split[i]));
    }
    document.add(list);
    int pages = pdf.getNumberOfPages();
     float width = pdf.getDefaultPageSize().getWidth();
    float height = pdf.getDefaultPageSize().getHeight();
   // int num = pdf.getPageNumber(pdf.getFirstPage());
    PdfCanvas[] canvas = new PdfCanvas[pages];
    for(int t=1;t<=pages;t++){
    canvas[t-1] = new PdfCanvas(pdf.getPage(t));
    // Add a rectangle
    canvas[t-1].setStrokeColor(Color.DARK_GRAY).setLineWidth(4);
    canvas[t-1].rectangle(20, 20, width - 40, height - 40);
    canvas[t-1].stroke();
    }
    document.close();
    System.exit(0);
       }
   catch(Exception e){
      System.exit(1);
   }
    }
}
