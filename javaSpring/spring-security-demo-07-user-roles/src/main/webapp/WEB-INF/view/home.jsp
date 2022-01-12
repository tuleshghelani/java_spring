<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<html>
<head>
    <title>Home- title</title>
</head>
<body>
<h1>Home</h1>
<br>
Welcome to the the home page
<br>
<hr>
<p>
    User : <security:authentication property="principal.username"/><br>
    Role(s) : <security:authentication property="principal.authorities"/><br>
</p>
<hr>
<p>
    <a href="${pageContext.request.contextPath}/leaders">
        LeaderShip Meeting
    </a>(Only For Manager peeps)
</p>
<form:form action="${pageContext.request.contextPath}/logout" method="post">
    <input type="submit" value="Logout"/>
</form:form>~
</body>
</html>