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
<body>
    <h4>webapp/index.jsp</h4>
没用的index.jsp,本来是直接在地址栏里敲<br>
<a href="${pageContext.request.contextPath}/other">为登录访问受保护文件other.jsp测试 </a><br>
<a href="${pageContext.request.contextPath}/loginAction">登录测试 </a><br>
<a href="${pageContext.request.contextPath}/loginCheck">登录检查测试 </a><br>

</body>
</html>
