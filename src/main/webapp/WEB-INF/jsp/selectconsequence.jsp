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
    <table width="500" height="95" border="0" cellpadding="0" cellspacing="1" style="background-color: #3A8ECD; color: #000;"><tr>
        <td><input type = "text" style="visibility:hidden" name = "id" value="${customer1.id}"></td>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">客户姓名：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="name" type="text" size="10" value="${customer1.name}" /></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">性别：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="sex" type="text" size="10" value="${customer1.sex}"/></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">电话：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="phone" type="text" size="10" value="${customer1.phone}"/></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">客户等级：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="grade" type="text" size="10" value="${customer1.grade}" /></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">电子邮箱：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="email" type="text" size="10" value="${customer1.email}"/></td>
        </tr>
        <tr>
            <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF"><input type="submit" name="update" value="信息更新" formaction="${pageContext.request.contextPath}/basicinfo/update"/>&nbsp;&nbsp;
            <input type="submit" name="delete" value="删除该用户" formaction="${pageContext.request.contextPath}/basicinfo/delete"/>
        </tr>
    </table>
</form>
<input type="button" name="return" onclick="window.location.href='${pageContext.request.contextPath}/basicinfo/toBasicInfo';" value="返回">
</body>
</html>
