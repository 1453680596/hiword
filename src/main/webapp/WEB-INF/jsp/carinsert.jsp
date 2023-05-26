<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/26
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增车型信息</title>
</head>
<body>
新增车型信息：
<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/consumptioninfo/insert">
    <table width="500" height="95" border="0" cellpadding="0" cellspacing="1" style="background-color: #3A8ECD; color: #000;"><tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">客户id：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="customerId" type="text" size="10" /></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">车型：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="cartype" type="text" size="10" /></td>
        </tr>
        <tr>
            <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF"><input type="submit" name="button" id="button" value="添加" />&nbsp;&nbsp;
                <input type="reset" name="button2" id="button2" value="重置" /></td>
        </tr>
    </table>
    <input type="button" name="select" onclick="window.location.href='${pageContext.request.contextPath}/consumptioninfo/toSelect';" value="直接进行查询">
</form>
</body>
</html>
