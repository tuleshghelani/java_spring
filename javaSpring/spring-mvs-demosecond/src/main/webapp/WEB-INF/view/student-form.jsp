<%--
  Created by IntelliJ IDEA.
  User: pp-2
  Date: 27/12/21
  Time: 11:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%--<%@ taglib prefix="FORM" uri="http://www.springframework.org/tags/form" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student registration form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/><br>
        Last name: <form:input path="lastName"/><br>
        
        Coutry:
        <form:select path="country">
           <form:options items="${student.countryOptions}" />

        </form:select>
        <br>
        
        Favourite Language :
        Java <form:radiobutton path="favoriteLanguage" value="java"/>
        C# <form:radiobutton path="favoriteLanguage" value="C#"/>
        PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
        Html <form:radiobutton path="favoriteLanguage" value="Html"/>
        <br>

        Operating System :
        Linux <form:checkbox path="operatingSystem" value="Linux"/>
        Mac Os <form:checkbox path="operatingSystem" value="Mac Os"/>
        MS Windows <form:checkbox path="operatingSystem" value="MS Windows"/>
        <input type="submit"  value="submit">
    </form:form>

</body>
</html>
