import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.LocaleUtil;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Workbook wb = new XSSFWorkbook();

        Sheet sheet = wb.createSheet("new sheet");
        sheet.setDefaultColumnWidth(1);
        sheet.setDefaultRowHeightInPoints(10);
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        byte[] rgb = new byte[3];
        XSSFColor xssfColor = null;


        String imageFName = "image.jpg";
        BufferedImage image = null;
        try(FileInputStream fin = new FileInputStream(imageFName);){
            image = ImageIO.read(fin);
        } catch (IOException exc){
            System.out.print("Ошибка ввода-вывода: " + exc);
        }

        Row row;
        Cell cell;
        Color color = new Color(0);

        System.out.println("Height: " + image.getHeight());
        System.out.println("Width: " + image.getWidth());

        for(int i = 0; i < image.getHeight(); i++){
        //for(int i = image.getHeight()/2; i < (image.getHeight()/2) + 10; i++){
            row = sheet.createRow(i);
            System.out.println("Row: " + i);
            for(int j = 0; j < image.getWidth(); j++){
            //for(int j = image.getWidth()/2; j < (image.getWidth()/2) + 10; j++){

                color = new Color(image.getRGB(j,i));
                xssfColor = new XSSFColor(color,null);
                //System.out.print(color.toString()+" i: "+i+" j: "+j+"   R:" +color.getRed()+" G:"+color.getGreen()+" B:"+color.getBlue());
                //System.out.println(color.toString());
                cellStyle = wb.createCellStyle();
                cellStyle.setFillForegroundColor(xssfColor);
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                //rgb = xssfColor.getRGB();
                //System.out.println("i: "+i+" j: "+j+"   R:" +rgb[0]+" G:"+rgb[1]+" B:"+rgb[2]);


                cell = row.createCell(j);
                cell.setCellStyle(cellStyle);


                //String line = console.nextLine();
                /*

                XSSFColor.toXSSFColor(color);
                XSSFColor.from(color);

                rgb[0] = (byte)color.getRed();
                rgb[1] = (byte)color.getGreen();
                rgb[2] = (byte)color.getBlue();

                //color.toString();

                //System.out.print("i: "+i+" j: "+j+"   R:" +rgb[0]+" G:"+rgb[1]+" B:"+rgb[2]);
                System.out.print(color.toString()+" i: "+i+" j: "+j+"   R:" +color.getRed()+" G:"+color.getGreen()+" B:"+color.getBlue());
                String line = console.nextLine();

                xssfColor.setRGB(rgb);
                cellStyle.setFillForegroundColor(xssfColor);
                cellStyle.set*/
            }
        }

            String fName = "test.xlsx";
            try (FileOutputStream fout = new FileOutputStream(fName);) {
                wb.write(fout);
            } catch (IOException exc) {
                System.out.print("Ошибка ввода-вывода: " + exc);
            }


        }
}