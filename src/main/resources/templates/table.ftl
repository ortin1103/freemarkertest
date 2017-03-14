<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <title>Table</title>
</head>
<body>
<table border="1">
<caption>Table</caption>
    <tr>
        <th>ID</th>
        <th>time per sec</th>
        <th>Random long</th>
    </tr>
<#list table as s>
    <tr>
        <th>${s_index+1}</th>
        <th>${s.time}</th>
        <th>${s.random}</th>
    </tr>
</#list>

</table>
</body>