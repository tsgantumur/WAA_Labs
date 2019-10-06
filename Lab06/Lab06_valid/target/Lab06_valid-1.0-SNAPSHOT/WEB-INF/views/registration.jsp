<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
    <form:form modelAttribute="student" action="registration" method="post">
        <fieldset>
            <legend>Add a student</legend>
            <p>
                <form:errors path="*" cssStyle="color: red;" />
            </p>
            <p>
                <label for="id">ID:</label>
                <form:input path="id" id="id"/>
                <div style="...">
                    <form:errors path="id" cssStyle="color: red;"/>
                </div>
            </p>
            <p>
                <label for="firstName">First Name:</label>
                    <form:input path="firstName"/>
                <div style="...">
                    <form:errors path="firstName" cssStyle="color: red;"/>
                </div>
            </p>
            <p>
                <label for="lastName">Last Name:</label>
                    <form:input path="lastName" />
                <div style="...">
                    <form:errors path="lastName" cssStyle="color: red;"/>
                </div>
            </p>
            <p>
                <label for="email">Email:</label>
                    <form:input path="email"/>
                <div style="...">
                    <form:errors path="email" cssStyle="color: red;"/>
                </div>
            </p>
            <p>
                <label for="gender">Gender:</label>
                    <form:select path="gender">
                        <form:option value="" label="Select Gender"/>
                        <form:option value="Male" label="Male" />
                        <form:option value="Female" label="Female" />
                    </form:select>
                <div style="...">
                    <form:errors path="gender" cssStyle="color: red;"/>
                </div>
            </p>
            <p>
                <label for="birthday">Date of Birth:</label>
                    <form:input path="birthday" id="id"/>
                <div style="...">
                    <form:errors path="birthday" cssStyle="color: red;"/>
                </div>
            </p>
            <p>
                <label for="phone.area">Phone:</label>
                    <form:input path="phone.area" placeholder="xxx" />
                    <form:input path="phone.prefix" placeholder="xxx" />
                    <form:input path="phone.number" placeholder="xxxx"/>
            <div style="...">
                <form:errors path="phone.area" cssStyle="color: red;"/>
                <form:errors path="phone.prefix" cssStyle="color: red;"/>
                <form:errors path="phone.number" cssStyle="color: red;"/>
            </div>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5" value="Add Student">
            </p>
        </fieldset>

    </form:form>
</body>
</html>

<h1>Registration Form</h1><br />
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
</body>
</html>