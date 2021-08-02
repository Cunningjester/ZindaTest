package utils;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

	public class ReadExcelData {
		public File inputWorkbook;
		public Sheet sheet;
		private Workbook w;

		public ReadExcelData(String sheetName) throws BiffException, IOException {
			inputWorkbook = new File(System.getProperty("user.dir") + "/src/main/java/com/zinda/resources/Zinda_Test_Sheet.xls");

			inputWorkbook.getAbsoluteFile();
			w = Workbook.getWorkbook(inputWorkbook);
			sheet = w.getSheet(sheetName);

		}

		public void setSheetName(String sheetName) {
			sheet = w.getSheet(sheetName);
		}

		public String readData(int column, int row) throws BiffException, IOException {

			Cell cell = sheet.getCell(column, row);

			return cell.getContents();

		}
	}
