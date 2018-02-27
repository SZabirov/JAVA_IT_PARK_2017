
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
<table>
        <#list list as contact>
            <tr>
                <td>${contact.id}</td>
                <td>${contact.name}</td>
                <td>${contact.phone}</td>
            </tr>
        </#list>
</table>
<body>
<meta charset="UTF-8">
<form action="/contacts" method="POST">
    <meta charset="UTF-8">
    Name:<br>
    <p><input type="text" name="name"><br></p>
    <meta charset="UTF-8">
    Phone:<br>
    <p><input type="text" name="phone"></p>
    <p><input type="submit" value="Submit"></p>
</form>

</body>
</html>









