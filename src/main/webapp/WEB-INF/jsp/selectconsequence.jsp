<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/24
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>
<h2>查询成功！</h2>
（若要更新可在下表更新）：
<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/basicinfo/update">
    <center>客户信息</center>
    <table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
        <tr>
            <td>客户姓名</td>
            <td>性别</td>
            <td>电话：</td>
            <td>客户等级</td>
            <td>电子邮箱</td>
        </tr>
        <tr>
            <td>${customer.name}</td>
            <td>${customer.sex}</td>
            <td>${customer.phone}</td>
            <td>${customer.grade}</td>
            <td>${customer.email}</td>
            <td>
                <c:forEach items="${customer.customerList}" var="name">
                    ${name}<br/>
                </c:forEach>
            </td>
        <tr>
            <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF"><input type="submit" name="update" value="信息更新" formaction="${pageContext.request.contextPath}/basicinfo/update"/>&nbsp;&nbsp;
                <input type="submit" name="delete" value="删除该用户" formaction="${pageContext.request.contextPath}/basicinfo/delete"/>
        </tr>
    </table>

</form>
<input type="button" name="return" onclick="window.location.href='${pageContext.request.contextPath}/basicinfo/toBasicInfo';" value="返回">
</body>
</html>
