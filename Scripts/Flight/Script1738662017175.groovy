import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper

import java.util.logging.Logger

import org.openqa.selenium.Keys as Keys

// Step 1: Open browser and navigate to Google
//WebUI.openBrowser('')
//WebUI.navigateToUrl('https://www.google.com')

// Step 2: Make a public API request to get a list of flights
String apiUrl = 'https://opensky-network.org/api/states/all'
RequestObject request = new RequestObject()
request.setRestUrl(apiUrl)
request.setRestRequestMethod("GET")

ResponseObject response = WS.sendRequest(request)

// Step 3: Extract the first flight's callsign from the API response
def jsonResponse = new JsonSlurper().parseText(response.getResponseBodyContent())
def states = jsonResponse.states
for (Object flight in states) {
	this.println(flight[1].trim())
}
//String flightCallsign = states[0][1]?.trim() ?: 'Default Flight'
//this.println(flightCallsign)