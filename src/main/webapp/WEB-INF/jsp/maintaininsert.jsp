<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/10/14
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增维护信息</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/maintain/insert">
    <table width="500" height="95" border="0" cellpadding="0" cellspacing="1" style="background-color: #3A8ECD; color: #000;"><tr>
        <td><input type = "text" style="visibility:hidden" name = "id" value="${maintain.id}"></td>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">客户姓名：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="name" type="text" size="10" /></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">车牌号：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="carnumber" type="text" size="10" /></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">维护状态：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="carcondition" type="text" size="10" /></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">维护时间：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="times" type="text" size="10" /></td>
        </tr>
        <tr>
            <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF">
                <input type="submit" name="button" id="button" value="添加" formaction="${pageContext.request.contextPath}/maintain/insert"/>&nbsp;&nbsp;
                <input type="submit" name="return" value="返回" formaction="${pageContext.request.contextPath}/maintain/toSelect"/>
            </td>
        </tr>
    </table>
</form>
<p style="color:red">${errormsg}</p >
</body>
</html>
