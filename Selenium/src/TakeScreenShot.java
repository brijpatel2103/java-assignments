import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenShot {
	@Test

    public void TakeScreenShot() throws Exception{

		WebDriver driver ;
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();


        driver.get("https://demo.guru99.com/V4/");


        TakeScreenShot(driver, "F://test.png") ;     

    }


    public static void TakeScreenShot(WebDriver webdriver,String fileWithPath) throws Exception{


        TakeScreenShot scrShot =((TakeScreenShot)webdriver);


                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                File DestFile=new File(fileWithPath);
                FileUtils.copyFile(SrcFile, DestFile);

    }

	private File getScreenshotAs(OutputType<File> file) {
		return null;
	}


}
