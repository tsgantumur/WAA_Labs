<%--
  Created by IntelliJ IDEA.
  User: Gana
  Date: 9/30/2019
  Time: 11:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Starbuck's page</title>
</head>
<body>
<p />
Login
<form action = "action/login" method = "post">
    Name: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "name" size = "9" placeholder="Dave"/><br />
    Password: <input type = "password" name = "password" size = "9" placeholder="111"/><br/>
    <br/>
    <input type="submit" value = "Log In"/>
</form>
${status}
</body>
</html>
