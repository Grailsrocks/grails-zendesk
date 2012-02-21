<html>
<body>
    <h1>Zendesk test page</h1>

    <h2>Create a user request</h2>
    <g:form controller="test">
        Email: <g:textField name="email"/><br/>
        Password: <input name="password" type="password"/><br/>
        <g:actionSubmit action="createTicket" value="Create a ticket"/>
        <g:actionSubmit action="createAndAttachg" value="Create a ticket with attachment"/>
        <g:actionSubmit action="search" value="Search for tickets"/>
        <g:actionSubmit action="requests" value="Get user requests"/>
    </g:form>
</body>
</html>