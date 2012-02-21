package com.grailsrocks.zendesk

class ZendeskTagLib {
    static namespace = "zd"
    
    def zendeskService
    
    def status = { attrs ->
        def ticket = attrs.ticket
        out << g.message(code:'zendesk.ticket.status.'+ticket.status_id).encodeAsHTML()
    }

    def createLink = { attrs ->
        def ticket = attrs.ticket
        def url = attrs.zendeskUrl ?: zendeskService.defaultUrl
        out << g.createLink(url:"${url}/requests/${ticket.nice_id}")
    }
}