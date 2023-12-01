package Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	
	 public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

	        WebElement table = driver.findElement(By.className("tsc_table_s13"));

	        List<WebElement> rows = table.findElements(By.tagName("tr"));
	        System.out.println("Number of Elements : "+rows.size());
	        int structureCount = 0;
	        int strcount=0;
	        for (WebElement row : rows) {
	            List<WebElement> cells = row.findElements(By.tagName("td"));
	            for (WebElement cell : cells) {
	            	if(cell.getText().equals("Structure") || cell.getText().equals("Total"))
	            	{
	            		
	            	}
	            	else
	            	{
	            		structureCount+=1;
	            	}
	                String cellText = cell.getText();
					/*
					 * if (cellText.equals("Structure")) { structureCount++; }
					 */
	            }
	        }

	        assert structureCount == 4;
	        System.out.println("Structure count is "+structureCount);
	        
	        WebElement burjKhalifaRow = driver.findElement(By.xpath("//tr[contains(.,'Burj Khalifa')]"));
	        String burjKhalifaHeight = burjKhalifaRow.findElement(By.xpath(".//td[3]")).getText();
	        System.out.println(burjKhalifaHeight);

	        assert burjKhalifaHeight.equals("829m");
	        
	    


	        // Find the last row in the table
	        WebElement lastRow = table.findElement(By.tagName("tfoot"));

	        // Find all columns in the last row
	        List<WebElement> columns = lastRow.findElements(By.tagName("td"));
	        List<WebElement> column = lastRow.findElements(By.tagName("th"));
	        
	        // Verify that there are only two columns in the last row
	        assert columns.size() == 2;
	        System.out.println(+columns.size());
	        System.out.println(+column.size());



	        driver.quit();
	    }

}
