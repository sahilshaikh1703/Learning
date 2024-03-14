package com.qa.util;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;
import com.qa.pages.PimPage;

public class TestUtil extends TestBase {

	public static int implicitwait = 20;
	public static int pagetimeoutwait = 30;
	public static String path1 = "C:\\Users\\dell\\eclipse-workspace\\TestNG\\src\\main\\java\\com\\qa\\testdata\\TestData.xlsx";
	public static String path ="C:\\Users\\dell\\eclipse-workspace\\TestNG\\src\\main\\java\\com\\qa\\testdata\\CRMData.xlsx";
	static FileInputStream file;


	public Object[][] provideTestData() throws IOException {
	    File f = new File(path);
	    FileInputStream fis = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbookFactory().create(fis);
	    Sheet sheet = wb.getSheetAt(0); // Assuming the data is in the first sheet

	    int totalRow = sheet.getLastRowNum();
	    Row rowCell = sheet.getRow(0);
	    int totalCol = rowCell.getLastCellNum();

	    DataFormatter format = new DataFormatter();

	    Object[][] testData = new Object[totalRow][totalCol];
	    for (int i = 1; i <= totalRow; i++) {
	        for (int j = 0; j < totalCol; j++) {
	            testData[i - 1][j] = format.formatCellValue(sheet.getRow(i).getCell(j));
	        }
	    }
	    return testData;
	}


}
