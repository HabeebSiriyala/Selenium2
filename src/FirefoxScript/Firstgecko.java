package FirefoxScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstgecko {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\habeeb\\Selenium\\geckodriver-v0.20.1-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.guru99.com");

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
