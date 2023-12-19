<%--
  Created by IntelliJ IDEA.
  User: 34838
  Date: 2023/2/4
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/loginCheck" method="post">
        <input type="text" name="name"><br>
        <input type="password" name="passwd"><br>
        <input type="submit">
    </form>
    ${mgs}
</body>
</html>
