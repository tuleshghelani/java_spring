<%--
  Created by IntelliJ IDEA.
  User: pp-2
  Date: 27/12/21
  Time: 11:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student confirmation form data</title>
</head>
<body>
The student is confirmed : ${student.firstName} ${student.lastName}
<br>
Country : ${student.country}<br>

Favorite Language : ${student.favoriteLanguage}<br>

Operating Systems:
<ul>
    <c:forEach var="os" items="${student.operatingSystem}">
        <li> ${os}</li>
    </c:forEach>
</ul>

</body>
</html>
