<%--
  Created by IntelliJ IDEA.
  User: 34838
  Date: 2023/2/2
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--导入jQuery--%>
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>
<a href="javascript:show()">点击显示学生信息</a>
<div id="mydiv">
等待响应.....
</div>
<script type="text/javascript">
    function show() {
        $.ajax({
            url :"${pageContext.request.contextPath}/list.action",
            type :"get",
            dataType : "json",
            success:function(responseList){
                let s = "";
                $.each(responseList,function (i,stuInfo){
                    s+= stuInfo.name +"------"+ stuInfo.age +"</br>";
                });
                $("#mydiv").html(s);
            }
        });
    }
</script>
</body>
</html>
