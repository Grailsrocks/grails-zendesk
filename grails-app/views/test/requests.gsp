<html>
<body>
    <g:each in="${tickets}" var="t">
        <p>${t.nice_id} : <a href="${zd.createLink(ticket:t).encodeAsHTML()}">${t.subject}</a> (<zd:status ticket="${t}"/>)</p>
    </g:each>
</body>
</html>