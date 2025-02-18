import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//// Define the URL of your React app (update if different)
//String url = 'http://localhost:5000'
//
//// Define username and password for Basic Authentication
//String username = 'testuser'
//String password = 'testpassword'
//
//// Open browser and navigate to the page
//WebUI.openBrowser('')
//WebUI.navigateToUrl(url)
//
//// Authenticate using WebUI.authenticate
//WebUI.authenticate(url, username, password, 10)
//
//// Close the browser after the test
//WebUI.closeBrowser()

// Open browser and navigate to demo AUT site.
WebUI.openBrowser('')

// Input username and password on authentication dialog.
//WebUI.authenticate("http://localhost:5000", 'admin', 'password123', 12)
WebUI.navigateToUrl('http://admin:password123@localhost:5000')

// Close browser
//WebUI.closeBrowser()
