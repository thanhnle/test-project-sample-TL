package custom

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration

import groovy.json.JsonSlurper


public class JsonGlobalVarHelper {

	static String jsonPath = RunConfiguration.getProjectDir() + "/Include/resources/globalVars.json"

	@Keyword
	static String getVariable(String key) {
		File file = new File(jsonPath)
		def json = new JsonSlurper().parseText(file.text)
		return json[key]
	}
}
