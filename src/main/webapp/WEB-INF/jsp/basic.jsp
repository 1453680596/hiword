<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/24
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>基本管理功能</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/basicinfo/toSelect">查找、更新或删除客户</a><br/>
<a href="${pageContext.request.contextPath}/basicinfo/toInsert">新增客户</a>
<input type="button" name="return" onclick="window.location.href='${pageContext.request.contextPath}/index/toGuide';" value="返回首页">

</body>
</html>
