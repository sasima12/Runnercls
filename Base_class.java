package Org.Apache.maven.archetypes.Maven.Archetype.Quickstart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	public static WebDriver sasi;
	public static String value;
	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\sasi\\chromedriver.exe");
			 sasi =new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\sasi\\gecko.exe");
			 sasi  =new FirefoxDriver();	 
		}
		sasi.manage().window().maximize();
		return sasi;	
	}
	public static void get(String url) {
		sasi.get(url);		
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void inputValues(WebElement element,String value) {
		element.sendKeys(value);
	}
	
public static String particular_data(String path, int row_Index, int cell_Index) throws IOException {
	
	File f=new File(path);
	FileInputStream fis=new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAT=	wb.getSheetAt(0);
	Row row = sheetAT.getRow(row_Index);
	Cell cell=row.getCell(cell_Index);
	CellType cellType = cell.getCellType();
	if (cellType.equals(CellType.STRING)) {
		 value= cell.getStringCellValue();
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double cellValue = cell.getNumericCellValue();
		int Val=  (int) cellValue;
		value=String.valueOf(Val);
	}
	return value;
}
}
	







    
	
	
	
	
	
	
	


