class TestController {
    def zendeskService
    
    def index() {
        
    }
    
    def createTicket = {
        def zen = zendeskService.API
        zen.user = params.email
        zen.password = params.password
        def res = zen.createTicket( 
            subject:'Testing API',
            description:"I'm just testing the API as a user!"
        )
        render "Result: "+res
    }

    def createAndAttach = {
        def zen = zendeskService.API
        zen.user = params.email
        zen.password = params.password
        def id = zen.uploadAttachment(
            'testfile.txt', 
            'text/plain;charset=UTF-8', 
            new ByteArrayInputStream("Hello world from a text file!".getBytes('utf-8'))
        )
        assert id
        def res = zen.createTicket(
            subject:'Testing ticket with attachment',
            //fields: [plugin:'Authentication'], 
            attachments: [id],
            description:"Please take a look at this file"
        )
        render "Result: "+res
    }
    
    def search = {
        def zen = zendeskService.API
        zen.user = params.email
        zen.password = params.password
        def tickets = zen.search("requester:${zen.user}")
        [tickets: tickets]
    }
    
    def requests = {
        def zen = zendeskService.API
        zen.user = params.email
        zen.password = params.password
        def tickets = zen.requests
        [tickets: tickets]
    }
    
}