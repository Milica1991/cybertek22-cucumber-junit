package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
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


    }
}
