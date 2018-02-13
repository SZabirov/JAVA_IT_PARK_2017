
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table, tr, td {
            border-collapse: collapse;
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <table>
        <#list list as contact>
        <tr>
            <td>${contact.id}</td>
            <td>${contact.name}</td>
            <td>${contact.phone}</td>
        </tr>
        </#list>
    </table>
    <form action="/contacts" method="POST">

    </form>
</body>
</html>











