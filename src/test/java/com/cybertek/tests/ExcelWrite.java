package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void excel_writing_test() throws IOException {

        String path = "SimpleData1.xlsx";

        //To be able to read from Excel file, we need to load it into FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook > sheet > row > cell

        workbook = new XSSFWorkbook(fileInputStream);

        //get the sheet
        sheet = workbook.getSheet("Employees");

        //kings row
        row = sheet.getRow(1);

        //kings cell
        cell = row.getCell(1);

        //create and store adamsCell
        XSSFCell adamsCell = sheet.getRow(2).getCell(0);

        System.out.println("Before: " + adamsCell);

        //This method will override existing cell
        adamsCell.setCellValue("Madam");
        System.out.println("After:" + adamsCell);
        //TODO: CHANGE STEVEN'S NAME TO TOM
        for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {
            if (sheet.getRow(1).getCell(0).toString().equals("Steven")) {
                sheet.getRow(1).getCell(0).setCellValue("Tom");
            }
        }
//=====================================================================
        //use fileOutputStream to push change
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        //write to file using fileOutputStream
        workbook.write(fileOutputStream);

        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();


    }
}
