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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Workbook wb = new XSSFWorkbook();

        Sheet sheet = wb.createSheet("new sheet");
        sheet.setDefaultColumnWidth(1);
        sheet.setDefaultRowHeightInPoints(10);

        String imageFName = "image.jpg";
        BufferedImage image = null;
        try(FileInputStream fin = new FileInputStream(imageFName);){
            image = ImageIO.read(fin);
        } catch (IOException exc){
            System.out.print("Ошибка ввода-вывода: " + exc);
        }

        Row row;
        Cell cell;
        //Color color = new Color(0);
        CellStyle cellStyle;
        //XSSFColor xssfColor = null;

        HashMap<Integer,CellStyle> cellStyleMap = new HashMap<>();
        //CellStyle[][] cellStyles = new CellStyle[image.getHeight()][image.getWidth()];


        System.out.println("Height: " + image.getHeight());
        System.out.println("Width: " + image.getWidth());

        /*for(int i = 0; i < image.getHeight(); i++){

            for(int j = 0; j < image.getWidth(); j++){

                if(!cellStyleMap.containsKey(image.getRGB(j,i))) {
                    cellStyle = wb.createCellStyle();
                    cellStyle.setFillForegroundColor(new XSSFColor(new Color(image.getRGB(j,i)),null));
                    cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                    cellStyleMap.put(image.getRGB(j,i),cellStyle);
                }
                cellStyles[j][i] = cellStyleMap.get(image.getRGB(j,i));
            }
        }*/

        /*
        for(int i : xSSFColorsMap.keySet()){
            System.out.println(i);
        }

         */


        for(int i = 0; i < image.getHeight(); i++){
        //for(int i = image.getHeight()/2; i < (image.getHeight()/2) + 10; i++){
            row = sheet.createRow(i);
            System.out.println("Row: " + i);
            for(int j = 0; j < image.getWidth(); j++){
            //for(int j = image.getWidth()/2; j < (image.getWidth()/2) + 10; j++){

                cell = row.createCell(j);

                if(!cellStyleMap.containsKey(image.getRGB(j,i))) {
                    cellStyle = wb.createCellStyle();
                    cellStyle.setFillForegroundColor(new XSSFColor(new Color(image.getRGB(j,i)),null));
                    cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                    cellStyleMap.put(image.getRGB(j,i),cellStyle);
                    cell.setCellStyle(cellStyle);

                }else{
                    cell.setCellStyle(cellStyleMap.get(image.getRGB(j,i)));
                }
                //cellStyles[j][i] = cellStyleMap.get(image.getRGB(j,i));


                //color = new Color(image.getRGB(j,i));
                //xssfColor = new XSSFColor(color,null);
                //System.out.print(color.toString()+" i: "+i+" j: "+j+"   R:" +color.getRed()+" G:"+color.getGreen()+" B:"+color.getBlue());
                //System.out.println(color.toString());
                //cellStyle = wb.createCellStyle();
                //cellStyle.setFillForegroundColor(xssfColor);
                //cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                //rgb = xssfColor.getRGB();
                //System.out.println("i: "+i+" j: "+j+"   R:" +rgb[0]+" G:"+rgb[1]+" B:"+rgb[2]);




                //String line = console.nextLine();
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