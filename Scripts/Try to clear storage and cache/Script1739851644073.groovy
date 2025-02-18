import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import custom.BrowserUtils

WebUI.openBrowser('')
WebUI.navigateToUrl('https://google.com')
BrowserUtils.clearBrowserData()
WebUI.closeBrowser()