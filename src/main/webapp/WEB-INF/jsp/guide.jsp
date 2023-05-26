<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/24
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
<html>
<head>
    <title>导航页</title>
</head>
<body>
<p>欢迎您：${username}！</p>
<a href="${pageContext.request.contextPath}/basicinfo/toBasicInfo">进入基本信息管理</a><br/>
<br/>
<a href="${pageContext.request.contextPath}/consumptioninfo/toConsumptionInfo">客户消费信息管理</a><br/>
<input type="button" name="logout" onclick="window.location.href='${pageContext.request.contextPath}/index/toIndex';" value="登出">


</body>
</html>
