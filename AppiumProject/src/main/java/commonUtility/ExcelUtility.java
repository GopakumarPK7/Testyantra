package commonUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	private Workbook workbook;
	/**
	 * This method is used to initialize excelfile
	 */
	public void initializeExcel(String excelPath)
	{
	FileInputStream fis =null;
	try {
		try {
			fis = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	} catch (Exception e1) {
		e1.printStackTrace();
	}
	try {
		workbook=WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	/**
	 * This method is used fetch data from excel
	 * @param sheetname
	 * @param rowNumber
	 * @param coloumnNumber
	 * @return
	 */
	public String getTheDataFromExcel(String sheetname,int rowNumber,int cellNumber)
	{
		Sheet sheet=workbook.getSheet(sheetname);
		return new DataFormatter().formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
	}
}
