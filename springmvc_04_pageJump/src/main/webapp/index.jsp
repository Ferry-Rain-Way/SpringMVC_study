<%--
  Created by IntelliJ IDEA.
  User: 34838
  Date: 2023/2/1
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

  <a href="${pageContext.request.contextPath}/ghy/hello.action">转发</a><br>
  <a href="${pageContext.request.contextPath}/ghy/forward/test.action">forward:转发</a><br>
  <a href="${pageContext.request.contextPath}/ghy/redirect/test.action">redirect:重定向</a><br>
  <a href="${pageContext.request.contextPath}/ghy/forward/HttpServlet.action">HttpServlet转发</a><br>
  <a href="${pageContext.request.contextPath}/ghy/redirect/HttpServlet.action">HttpServlet重定向</a><br>

<br><br>
    <%--springmvc常用参数携带数据测试--%>

    <a href="${pageContext.request.contextPath}/data.action?haha=22">springmvc param</a>

<br><br>
    <form action="${pageContext.request.contextPath}/date.action" method="post">
        <input type="date" name="datePlaceholder1"/>
        <input type="date" name="datePlaceholder2"/>
        <input type="submit"/>
    </form>

<br><br>
<form action="${pageContext.request.contextPath}/date2.action" method="post">
    <input type="date" name="datePlaceholder1"/>
    <input type="date" name="datePlaceholder2"/>
    <input type="submit"/>
</form>

<br>
<a href="${pageContext.request.contextPath}/date3.action">date数据在前端处理</a>

</body>
</html>

