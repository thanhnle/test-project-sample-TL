import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import custom.JsonGlobalVarHelper

String baseUrl = JsonGlobalVarHelper.getVariable("BaseURL")
String apiKey = JsonGlobalVarHelper.getVariable("ApiKey")

WebUI.comment("Base URL: " + baseUrl)
WebUI.comment("API Key: " + apiKey)
