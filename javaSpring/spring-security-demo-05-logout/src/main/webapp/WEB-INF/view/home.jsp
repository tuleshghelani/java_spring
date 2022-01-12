<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home- title</title>
</head>
<body>
    <h1>Home</h1>
    <br>
    Welcome to the the home page
    <br>
    <form:form action="${pageContext.request.contextPath}/logout" method="post">
            <input type="submit" value="Logout" />
    </form:form>~
</body>
</html>