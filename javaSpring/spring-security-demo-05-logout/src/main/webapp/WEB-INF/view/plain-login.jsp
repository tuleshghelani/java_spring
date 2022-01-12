<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Form</title>
    <style>
        .failed{
            color: #0073ff;
        }
    </style>
</head>
<body>
<h1>My custom login Page- Customer login Form</h1>
    <form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
        <c:if test="${param.error!=null}" >
            <i class="failed">Sorry! You enter invalid username and password</i>
        </c:if>
        <p>
            User name : <input type="text" name="username" />
        </p>
        <p>
            Password : <input type="password" name="password" />
        </p>

        <input type="submit" value="Login">
    </form:form>

</body>
</html>