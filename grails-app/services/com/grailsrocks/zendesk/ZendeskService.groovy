package com.grailsrocks.zendesk

class ZendeskService {

    static transactional = false

    def grailsApplication
    
    String getDefaultUrl() {
        def zendeskUrl = grailsApplication.config.plugin.zendesk.url 
        if (zendeskUrl instanceof ConfigObject) {
            throw new IllegalArgumentException("plugin.zendesk.url has not been set in Config")
        }
        return zendeskUrl
    }
    
    ZendeskAPI getAPI(url = defaultUrl) {
        new ZendeskAPI(url)
    }
}
