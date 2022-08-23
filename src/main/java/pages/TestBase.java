package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;

	public static WebDriver initDriver() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=admin/");
		return driver;

	}

	public void takeScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		try {
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
			Date date = new Date();
			String label = formatter.format(date);
			try {
				FileUtils.copyFile(sourceFile,
						new File(System.getProperty("user.dir") + "/screenshots/" + label + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
