<%--
  Created by IntelliJ IDEA.
  User: pp-2
  Date: 27/12/21
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
    The customer is confirmed : ${customer.firstName} ${customer.lastName}<br>
    Free passes: ${customer.freePasses}<br>
    Postal Code: ${customer.postalCode}<br>
    Course Code: ${customer.courseCode}<br>
</body>
</html>
