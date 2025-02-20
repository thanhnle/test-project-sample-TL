package custom

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class BrowserUtils {

	@Keyword
	static void clearBrowserData() {
		WebDriver driver = DriverFactory.getWebDriver()
		JavascriptExecutor js = (JavascriptExecutor) driver
		js.executeScript("window.localStorage.clear(); window.sessionStorage.clear();")
		js.executeScript("caches.keys().then(keys => keys.forEach(key => caches.delete(key)));")
		println("Browser cache and history cleared.")
	}
}
