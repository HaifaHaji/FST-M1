package Activities;
/*

For this activity we will be using Excel to store data and Apache POI to retrieve that data.

First make sure that APache POI has been installed for your project.
To start with create a static global variable that is going to contain the file path for the Excel sheet.
private static String FILE_NAME = "resources/TestSheet.xlsx";

In the main function, create an object for XSSFWorkbook class. This object that will be used to create the Excel sheets.
Create an object for the XSSFSheet class as well. Initialize it as shown below.
XSSFWorkbook workbook = new XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("Datatypes in Java");


Next we create the data that will inserted into the sheet.

The data is input as a 2D array of objects.
Each row is one object and each item in that object counts as column value.
Example: (This is the format of the sample data that we will be pushing to the Excel sheet.)
Object[][] datatypes = {
    {"Datatype", "Type", "Size(in bytes)"},
    {"int", "Primitive", 2},
    {"float", "Primitive", 4},
    {"double", "Primitive", 8},
    {"char", "Primitive", 1},
    {"String", "Non-Primitive", "No fixed size"}
};

Initialize an integer with 0 (zero). This will be the row number index value.
Create the following loop to insert data into each cell:
int rowNum = 0;

for (Object[] datatype : datatypes) {
    Row row = sheet.createRow(rowNum++);
    int colNum = 0;
    for (Object field : datatype) {
        Cell cell = row.createCell(colNum++);
        if (field instanceof String) {
            cell.setCellValue((String) field);
        } else if (field instanceof Integer) {
            cell.setCellValue((Integer) field);
        }
    }
}

Finally in a try block,

Create a FileOutputStream object and pass in the FILE_NAME global variable.
Use workbook.write() method with the FileOutputStream object to write to the Excel sheet specified.
Create catch blocks for FileNotFoundException and for IOException.
FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
workbook.write(outputStream);


 */
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
public class Activity15 {


    private static final String FILE_NAME = "Act15.xlsx";

    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
        Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}
