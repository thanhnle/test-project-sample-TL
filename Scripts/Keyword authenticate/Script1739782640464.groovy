import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import custom.WebHelper

WebUI.openBrowser('')
WebHelper.authenticatePlus("http://localhost:5000", 'admin', 'password123', 12)
