package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class RS_Screenshot {
	public static void takepicture(WebDriver driver,String name) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination=new File("D:\\ProjectOnGit\\APIAutomation\\Jan2024\\screenshots\\"+name+"jpg");
		
		FileHandler.copy(source, destination);
	}

}
