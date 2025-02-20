package custom

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling

public class WebHelper {
    @Keyword
    def static authenticatePlus(String url, String username, String password, int timeout, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
        if (url.matches(".*:\\d{2,5}.*")) {
            def protocol = url.toLowerCase().startsWith("https") ? "https://" : "http://"
            
            def urlWithoutProtocol = url
                .replaceFirst("https://", "")
                .replaceFirst("http://", "")
            
            String formattedUrl = "${protocol}${username}:${password}@${urlWithoutProtocol}"
            WebUI.navigateToUrl(formattedUrl, flowControl)
        } else {
            WebUI.authenticate(url, username, password, timeout, flowControl)
        }
    }
}
