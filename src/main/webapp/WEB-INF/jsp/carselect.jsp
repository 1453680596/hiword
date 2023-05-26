<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/26
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息查询</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/consumptioninfo/select">
    <table width="500" height="95" border="0" cellpadding="0" cellspacing="1" style="background-color: #3A8ECD; color: #000;"><tr>
        <tr>
            <td width="150" height="30" align="right" valign="middle" bgcolor="#FFFFFF">查询车辆类型：</td>
            <td width="250" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="cartype" type="text" size="10" /></td>
        </tr>

        <tr>
            <td height="30" colspan="3" align="center" valign="middle" bgcolor="#FFFFFF">
                <input type="submit" name="button" id="button" value="查找" />&nbsp;&nbsp;
                <input type="reset" name="button2" id="button2" value="重置" />
            </td>
        </tr>
    </table>
    <label style="color: red">${errormsg}</label>
</form>
</body>
</html>
