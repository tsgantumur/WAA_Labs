<%--
  Created by IntelliJ IDEA.
  User: Gana
  Date: 9/30/2019
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <form action="calculator" method="post">
        <input type = "text" name = "add1" size = "2"  value = "" />+
        <input type = "text" name = "add2" value = "" size = "2"/>=<input type = "text" name = "sum" value = "${sum}"  size = "2" readonly/><br/>
        <input type = "text" name = "mult1" value = "" size = "2"/>*
        <input type = "text" name = "mult2" value = ""  size = "2"/>=<input type = "text" name = "product" value = "${product}"   size = "2" readonly/><br/>
        <input type = "submit" value = "Submit"/>

    </form>
</body>
</html>
