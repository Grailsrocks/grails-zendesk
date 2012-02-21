class ZendeskGrailsPlugin {
    // the plugin version
    def version = "1.0"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/**/*.gsp",
        "grails-app/controllers/**/*.groovy",
        "grails-app/web-app/**/*.*"
    ]

    // TODO Fill in these fields
    def title = "Zendesk API Plugin" // Headline display name of the plugin
    def author = "Marc Palmer"
    def authorEmail = "marc@grailsrocks.com"
    def description = '''\
Interface to Zendesk support system via their API
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/zendesk"

    def license = "APACHE 2"

    def organization = [ name: "Grailsrocks", url: "http://grailsrocks.com/" ]

    def developers = [ [ name: "Marc Palmer", email: "marc@grailsrocks.com" ]]

    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPZENDESK" ]

    def scm = [ url: "http://github.com/Grailsrocks/grails-zendesk/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
