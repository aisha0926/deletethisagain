import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    //Worksheet excel
    private static XSSFSheet ExcelSheet;
    //Workbook excel
    private static XSSFWorkbook ExcelBook;
    //Excel cells
    private static XSSFCell Cell;
    //Excel rows
    private static XSSFRow Row;

    /*
        This method takes in a String parameter and an integer value which holds the file path and the
        index of the excel sheet correspondingly. It will then create a file stream which is used to access
        the physical file and then accessing the sheets within the workbook.
     */
    public static void setExcelFile(String Path, int sheetIndex){
        try {
            FileInputStream ExcelFile = new FileInputStream(Path);
            ExcelBook = new XSSFWorkbook(ExcelFile);
            ExcelSheet = ExcelBook.getSheetAt(sheetIndex);

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static XSSFSheet getExcelWSheet() {
        return ExcelSheet;
    }

    public static String getCellData(int RowNum, int ColNum) {

        try {

            Cell = ExcelSheet.getRow(RowNum).getCell(ColNum);

            String CellData = Cell.getStringCellValue();

            return CellData;

        } catch (Exception e) {

            e.printStackTrace();
            return "";

        }

    }

    public static void setCellData(String Result, int RowNum, int ColNum) {

        try {

            Row = ExcelSheet.getRow(RowNum);

            Cell = Row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);

            if (Cell == null) {

                Cell = Row.createCell(ColNum);

                Cell.setCellValue(Result);

            } else {

                Cell.setCellValue(Result);

            }

            // Constant variables Test Data path and Test Data file name

            FileOutputStream fileOut = new FileOutputStream(Contants.pathTestData + Contants.fileTest);

            ExcelBook.write(fileOut);

            fileOut.flush();

            fileOut.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
