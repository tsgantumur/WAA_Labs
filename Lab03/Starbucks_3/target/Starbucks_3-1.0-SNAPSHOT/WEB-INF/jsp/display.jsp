<%--
  Created by IntelliJ IDEA.
  User: Gana
  Date: 9/30/2019
  Time: 11:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>${status}</h2>
<%--<c:if test="${ask == true}">--%>
<h3>Welcome ${user}!</h3>

<form action="display" method="post">
    <select name="roast">
        <option value="">--Choose Roast--</option>
        <option value="dark">Dark</option>
        <option value="medium">Medium</option>
        <option value="light">Light</option>
    </select>
    <br/>
    <input type="submit" value="Submit"/>
</form>
<%--</c:if>--%>

<c:if test="${ask == false}">
    Advice for ${roast}:
    <ul>
        <c:forEach var="item" items="${items}">
            <li>
                    ${item}
            </li>

        </c:forEach>
    </ul>
</c:if>

</body>
</html>
