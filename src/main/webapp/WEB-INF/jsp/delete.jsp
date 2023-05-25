<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/25
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除信息</title>
</head>
<body>
请输入要删除的客户：
<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/basicinfo/delete">
    <table width="500" height="95" border="0" cellpadding="0" cellspacing="1" style="background-color: #3A8ECD; color: #000;"><tr>
        <tr>
            <td width="150" height="30" align="right" valign="middle" bgcolor="#FFFFFF">客户姓名：</td>
            <td width="250" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="name" type="text" size="10" /></td>
        </tr>
        <td><input type = "text" style="visibility:hidden" name = "id" value="${param.id}"></td>
        <tr>
            <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF"><input type="submit" name="button" id="button" value="删除" />&nbsp;&nbsp;
                <input type="reset" name="button2" id="button2" value="重置" /></td>
        </tr>
    </table>
</form>
</body>
</html>
