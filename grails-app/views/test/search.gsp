<html>
<body>
    <g:each in="${tickets}" var="t">
        ${t.id} : ${t.subject}
    </g:each>
</body>
</html>