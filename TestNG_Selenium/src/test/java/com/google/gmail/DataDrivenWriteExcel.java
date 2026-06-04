package com.google.gmail;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenWriteExcel {

	public static void main(String[] args) throws Throwable {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Excel\\WriteExcel.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		XSSFRow row1 = sheet.createRow(0);
			row1.createCell(0).setCellValue("Name");
			row1.createCell(1).setCellValue("Address");
			row1.createCell(2).setCellValue("Marks");
			
			XSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("AAA");
			row2.createCell(1).setCellValue("XYZ  122");
			row2.createCell(2).setCellValue("100");
			
			XSSFRow row3 = sheet.createRow(2);
			row3.createCell(0).setCellValue("BBB");
			row3.createCell(1).setCellValue("ERT  565");
			row3.createCell(2).setCellValue("89");
			
			workbook.write(file);
			workbook.close();
			file.close();
	}

}
