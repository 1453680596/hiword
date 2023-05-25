<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/25
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息更新</title>
</head>
<body>
请输入新的信息：
<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/basicinfo/update">
    <table width="500" height="95" border="0" cellpadding="0" cellspacing="1" style="background-color: #3A8ECD; color: #000;"><tr>
        <td><input type = "text" style="visibility:hidden" name = "id" value="${param.id}"></td>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">姓名：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="name" type="text" size="10" value="${customer.name}" /></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">性别：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="sex" type="text" size="10" value="${customer.sex}"/></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">电话：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="phone" type="text" size="10" value="${customer.phone}"/></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">客户等级：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="grade" type="text" size="10" value="${customer.grade}" /></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">电子邮箱：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="email" type="text" size="10" value="${customer.email}"/></td>
        </tr>
        <tr>
            <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF"><input type="submit" name="button" id="button" value="更新" />&nbsp;&nbsp;
                <input type="reset" name="button2" id="button2" value="重置" /></td>
        </tr>
    </table>
</form>
</body>
</html>
