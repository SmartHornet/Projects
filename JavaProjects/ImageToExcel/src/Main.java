import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.LocaleUtil;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int b;

        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("new sheet");
        sheet.setDefaultColumnWidth(1);
        sheet.setDefaultRowHeightInPoints(10);
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        byte[] m = new byte[3];
        XSSFColor color = new XSSFColor();

        String imageFName = "image.jpg";
        BufferedImage image = null;
        try(FileInputStream fin = new FileInputStream(imageFName);){
            image = ImageIO.read(fin);
        } catch (IOException exc){
            System.out.print("Ошибка ввода-вывода: " + exc);
        }

        Row row;
        Cell cell;

        for(int i = 0; i < image.getHeight(); i++){
            row = sheet.createRow(i);
            for(int j = 0; j < image.getWidth(); j++){
                cell = row.createCell(j);


                color.setRGB(m);


                //cellStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
                cellStyle.setFillForegroundColor(color);


                cell.setCellStyle(cellStyle);
            }
        }


        String fName = "test.xlsx";
        try(FileOutputStream fout = new FileOutputStream(fName);){
            wb.write(fout);
        } catch (IOException exc){
            System.out.print("Ошибка ввода-вывода: " + exc);
        }




        //image.r

        //System.out.print("Ввод: ");

        /*Scanner console = new Scanner(System.in);

        String fName = "file.data";

        try(FileOutputStream fout = new FileOutputStream(fName);){
            for(int i = 0; i<10; i++){
                fout.write(i);
            }
        } catch (IOException exc){
            System.out.print("Ошибка ввода-вывода: " + exc);
        }



        try(FileInputStream fin = new FileInputStream(fName);){
            do{
                b = fin.read();
                if(b != -1) {
                    System.out.println(b);
                }
            }while(b != -1);
        } catch (IOException exc){
            System.out.print("Ошибка ввода-вывода: " + exc);
        }

        String line = console.nextLine();*/

        //System.out.println(line);
    }
}