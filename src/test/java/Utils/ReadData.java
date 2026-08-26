package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadData {

    private static final String testDataDir =
            System.getProperty("user.dir")
                    + "/src/test/java/TestData/TestData.xlsx";

    private static FileInputStream fileInputStream;
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;

    static {

        try {

            fileInputStream =
                    new FileInputStream(testDataDir);

            workbook =
                    new XSSFWorkbook(fileInputStream);

            sheet =
                    workbook.getSheet("Login Details");

        } catch (Exception e) {

            throw new RuntimeException(
                    "Unable to load test data file",
                    e);

        }
    }

    public static String getUsername() {

        try {

            return sheet
                    .getRow(1)
                    .getCell(0)
                    .getStringCellValue();

        } catch (Exception e) {

            throw new RuntimeException(
                    "Unable to read Username",
                    e);

        }
    }

    public static String getPassword() {

        try {

            return sheet
                    .getRow(1)
                    .getCell(1)
                    .getStringCellValue();

        } catch (Exception e) {

            throw new RuntimeException(
                    "Unable to read Password",
                    e);

        }
    }
}