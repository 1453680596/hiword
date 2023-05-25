<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/24
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>
<h2>查询成功！</h2>

<table border="1" collspacing="0" collpadding="0" align="center">
    <tr>
        <th colspan="6">客户信息</th>
    </tr>
    <tr>
        <th>客户姓名</th>
        <th>性别</th>
        <th>电话</th>
        <th>客户等级</th>
        <th>电子邮箱</th>
        <th>操作</th>
    </tr>


    <c:forEach items="${customerList}" var="customer">
        <tr align="center">
            <td> ${customer.name}</td>
            <td> ${customer.sex}</td>
            <td> ${customer.phone}</td>
            <td> ${customer.grade}</td>
            <td> ${customer.email}</td>
            <td>
                <input type="button" name="return"
                       onclick="window.location.href=
                               '${pageContext.request.contextPath}/basicinfo/toUpdate?id=${customer.id}&name=${customer.name}&sex=${customer.sex}&phone=${customer.phone}&grade=${customer.grade}&email=${customer.email}'"
                       value="修改">
                <input type="button" name="return"
                       onclick="window.location.href='${pageContext.request.contextPath}/basicinfo/delete?id=${customer.id}'"
                       value="删除">
            </td>
        </tr>
    </c:forEach>

    <%--    <tr>--%>
    <%--        <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF">--%>
    <%--            <input type="submit" name="update" value="信息更新"--%>
    <%--                   formaction=""/>&nbsp;&nbsp;--%>
    <%--            <input type="submit" name="delete" value="删除该用户"--%>
    <%--                   formaction="${pageContext.request.contextPath}/basicinfo/delete"/>--%>
    <%--    </tr>--%>
</table>
<input type="button" name="return"
       onclick="window.location.href='${pageContext.request.contextPath}/basicinfo/toBasicInfo'" value="返回">
</body>
</html>
