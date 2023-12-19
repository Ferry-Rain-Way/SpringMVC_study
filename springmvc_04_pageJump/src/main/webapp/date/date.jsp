<%--
  Created by IntelliJ IDEA.
  User: 34838
  Date: 2023/2/3
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



<html>
<head>
    <title>Title</title>
</head>
<body>4
  <a>@DateTimeFormat <\mvc:annotation driver  </a> <br>

PersonInfo: name : ${person.name} birthday:${person.birthday}

<%--
处date类型数据需要导入
jstl依赖:注意,此处导入的是jakarta.servlet.jsp.jstl ,对应的是高版本的Tomcat
        若导入的依赖是 “jstl”,会抛出 java.lang.NoClassDefFoundError: javax/servlet/jsp/tagext/TagLibraryValidator


jstl的格式标签库(fmt)
        需要注意此处导入的是 \<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        有相似的,别导错了
--%>
<br>
<fmt:formatDate value="${person.birthday}" pattern="yyyy-MM-dd"/>
</body>
</html>
