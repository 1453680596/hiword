<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/27
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息回复</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/feedback/update">
    <table width="500" height="95" border="0" cellpadding="0" cellspacing="1" style="background-color: #3A8ECD; color: #000;"><tr>
        <td><input type = "text" style="visibility:hidden" name = "id" value="${feedback.id}"></td>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">客户姓名：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="name" type="text" size="10" value="${feedback.name}"/></td>
        </tr>
        <tr>
            <td width="500" height="300" align="right" valign="middle" bgcolor="#FFFFFF">反馈信息：</td>
            <td width="600" height="200" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="message" type="text" size="300" value="${feedback.message}"/></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">回复：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="reply" type="text" size="10" value="${feedback.reply}"/></td>
        </tr>

        <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF">
            <input type="submit" name="update" value="回复" formaction="${pageContext.request.contextPath}/feedback/update"/>&nbsp;&nbsp;
            <input type="submit" name="return" value="返回" formaction="${pageContext.request.contextPath}/feedback/toSelect"/>
        </td>
        </tr>
    </table>
</form>
</body>
</html>
