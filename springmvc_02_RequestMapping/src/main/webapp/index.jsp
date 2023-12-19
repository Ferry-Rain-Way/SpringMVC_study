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
<%--请求方式: get\post测试--%>
    <a href="${pageContext.request.contextPath}/ghy/hello.action">访问服务器</a></br>
    <a href="${pageContext.request.contextPath}/ghy/test.action">get_test</a></br>

    <form action="${pageContext.request.contextPath}/ghy/test.action" method="post">
    <input value="post-commit" type="submit">
    </form>

<%--数据提交--%>
<h4>1、表单中name对应方法形参名</h4>
<form action="${pageContext.request.contextPath}/submit1.action" method="post">
    <input type="text" name="student_name"/>
    <input type="text" name="studentNo"/> <!--测试是否区分大小写 → 区分-->
    <input type="submit" value="submit1"/>
</form>


<h4>2、封装实体类,表单参数对应实体类属性</h4>
<%--
    private String name;
    private int age;
    中文乱码问题:
        当前使用的是Tomcat10 ,post 和 get提交的中文乱码问题都已经被解决了
        Tomcat8之前的版本没有解决post乱码,但get请求的乱码问题可能已经解决

        所以对于低版本的Tomcat的post乱码需要解决
--%>

<form action="${pageContext.request.contextPath}/submit2.action" method="post">
    <input type="text" name="name"/>
    <input type="text" name="age"/>
    <input type="submit" value="submit2"/>
</form>

<hr>
<h4>3、动态占位符提交,使用 @PathVariable解析</h4>
<a href="${pageContext.request.contextPath}/郭洪宇/20111022/submit3.action">submit3</a>


<hr>
<h4>4、 映射名称不一致 ,使用注解@RequestParam来解析</h4>
<form action="${pageContext.request.contextPath}/submit4.action" method="post">
    <input type="text" name="uname"/>
    <input type="text" name="uage"/>
    <input type="submit" value="submit4"/>
</form>

<hr>

<h4>5、祖传之法-HttpServletRequest</h4>
<form action="${pageContext.request.contextPath}/submit5.action" method="post">
    <input type="text" name="name"/>
    <input type="text" name="age"/>
    <input type="submit" value="submit5"/>
</form>

</body>
</html>
