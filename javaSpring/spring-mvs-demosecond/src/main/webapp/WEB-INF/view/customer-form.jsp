<%--
  Created by IntelliJ IDEA.
  User: pp-2
  Date: 27/12/21
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error{color: red}
    </style>
</head>
<body>
    <form:form action="processForm" modelAttribute="customer">
        First Name : <form:input path="firstName"/><br>
        Last Name* : <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/><br>

        Free Passes: <form:input path="freePasses" />
        <form:errors path="freePasses" cssClass="error"/><br>

        Postal Code: <form:input path="postalCode" />
        <form:errors path="postalCode" cssClass="error"/><br>

        Course Code: <form:input path="courseCode" />
        <form:errors path="courseCode" cssClass="error"/><br>



        <input type="submit" value="submit">
    </form:form>

</body>
</html>
